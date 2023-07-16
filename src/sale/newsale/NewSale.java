
package sale.newsale;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import medical.medicinedisplaydetails.MedicineDisplayDetails;
import medicalstockmanagementsystem.Input;
import medicalstockmanagementsystem.MedicineCheck;
import sale.SaleChoices;


public class NewSale 
{
    public String  bill(String productName, int quantity)
    {
          String originalBill = "";
          try 
          {
               FileReader fileReader = new FileReader(productName+".txt");
               BufferedReader reader = new BufferedReader(fileReader);
               String data = "";
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               data = reader.readLine();
               System.out.println("");
               int billData = Integer.parseInt(data);
               int billValue =0 ;
               for(int i = 0; i<quantity ; i++ )
               {
                   billValue = billValue + billData;
               }
               originalBill = Integer.toString(billValue);
          }
         catch (Exception e) 
        {
        }
        return originalBill;
    }
    public void storeDataOfSale(String userID ,String productName, String quantity, String bill)
    {
        try
        {
              LocalDate date = LocalDate.now();
              String currentDate = date.toString();
              FileWriter fileWriter =  new FileWriter(userID+"ordered.txt", true);
              BufferedWriter writer = new BufferedWriter(fileWriter);
              writer.write(userID);
              writer.newLine();
              writer.write(productName);
              writer.newLine();
              writer.write(quantity);
              writer.newLine();
              writer.write(bill);
              writer.newLine();
              writer.write(currentDate);
              writer.newLine();
              writer.close();
        }
        catch (Exception e) {
        }
    }
    public void newSale(String userID)
      {
        try
         {
            Input input = new Input();
            System.out.println("//////////////////////////////////////////////////////////////////////////////");
           System.out.println("----------------------------------------------------------------");
           System.out.println("Enter Product Name ::: ");
           String companyName = input.inputString();
           companyName = companyName.toUpperCase().trim();
           MedicineCheck check = new MedicineCheck();
           boolean check1 = check.checkingMedicine(companyName);
           if(check1)
           {
                  MedicineDisplayDetails details = new MedicineDisplayDetails();
                  details.displayDetails(companyName);
                  System.out.println("You want to sale product (Yes / No )");
                  String str = input.inputString();
                  str = str.toUpperCase().trim();
                  if(str.equals("YES"))
                  {
                      System.out.println("----------------------------------------------------------------");
                      System.out.println("Enter Quantity to buy Product ::: ");
                      int quantity = input.integerBug();
                      String bill = bill(companyName, quantity);
                      System.out.println("Your Bill ::: "+bill);
                      storeDataOfSale(userID, companyName, Integer.toString(quantity), bill);
                      System.out.println("Ordered Succesfully !!!.................");
                      SaleChoices choices = new SaleChoices();
                      choices.saleChoices(userID);
                  }
                  else
                  {
                      newSale(userID);
                  }
           }
           else
           {
                System.out.println("Product Name is Not Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    newSale(userID);
                }
                else
                {
                    SaleChoices choices = new SaleChoices();
                    choices.saleChoices(userID);
                }
                
           }    
          }
          catch (Exception e) 
          {
          }
      }
    
}
