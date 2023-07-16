
package medical.medicinedisplaydetails;

import java.io.BufferedReader;
import java.io.FileReader;
import medical.MedicalChoices;
import medicalstockmanagementsystem.CheckCompanyName;
import medicalstockmanagementsystem.Input;
import medicalstockmanagementsystem.MedicineCheck;


public class MedicineDisplayDetails 
{
    
      public void displayDetails(String productName)
      {
           try
          {
               FileReader fileReader = new FileReader(productName+".txt");  
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";
               int i = 0 ; 
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
               while((data = reader.readLine()) != null)
               {
                     if(i == 0 )
                     {
                         System.out.println("Product Name ::: " +data);
                     }
                     if(i == 1 )
                     {
                         System.out.println("Company Name ::: " +data);
                     }
                     if(i == 2 )
                     {
                         System.out.println("Product Category ::: " +data);
                     }
                     if(i == 3 )
                     {
                         System.out.println("Product Quantity  ::: " +data);
                     }
                     if(i == 4 )
                     {
                         System.out.println("Product Price ::: " +data);
                     }
                     i++;
               }
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
          }
          catch (Exception e) {
          }
      }
    
      public void medicineDisplayDetails()
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
                  displayDetails(companyName);
                  MedicalChoices choices = new MedicalChoices();
                  choices.medicalChoices();
           }
           else
           {
                System.out.println("Product Name is Not Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    medicineDisplayDetails();
                }
                else
                {
                    MedicalChoices choices = new MedicalChoices();
                    choices.medicalChoices();
                }
                
           }
      }
}
