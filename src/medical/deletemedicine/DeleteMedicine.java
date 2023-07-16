
package medical.deletemedicine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import medical.MedicalChoices;
import medical.updatemedicines.UpdateMedicineChoices;
import medicalstockmanagementsystem.Input;
import medicalstockmanagementsystem.MedicineCheck;


public class DeleteMedicine 
{
    
    public void replaceData()
     {
         try
         {
               FileReader fileReader = new FileReader("temp.txt");
               BufferedReader reader = new BufferedReader(fileReader);
               FileWriter fileWriter = new FileWriter("ProductNames.txt", false);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               String data =  "";
               while((data = reader.readLine()) != null)
               {
                      writer.write(data);
                      writer.newLine();
               }
               writer.close();
               reader.close();
         }
         catch (Exception e) 
         {
         }
     } 
    
    public void deleteProductNameFromFile(String productName)
     {
         try
         {
               FileReader fileReader = new FileReader("ProductNames.txt");
               BufferedReader reader = new BufferedReader(fileReader);
               FileWriter fileWriter = new FileWriter("temp.txt", false);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               String data =  "";
               while((data = reader.readLine()) != null)
               {
                      if(data.equals(productName))
                      {
                          writer.write("");
                      }
                      else
                      {
                         writer.write(data);
                         writer.newLine();
                      }
               }
               writer.close();
               reader.close();
               replaceData();
         } 
         catch (Exception e) {
         }
     }
    
    
    public void deleteProductFile(String productName)
     {
            File file = new File(productName+".txt");
            if(file.delete())
            {
                System.out.println("File Deleted Successfully ...........");
                deleteProductNameFromFile(productName);
                MedicalChoices choices = new MedicalChoices();
                    choices.medicalChoices();
            }
            else
            {
                System.out.println("File are not Deleted  ...........");   
                MedicalChoices choices = new MedicalChoices();
                    choices.medicalChoices();
            }
     }
    
       public void deleteMedicine()
       {
             Input input = new Input();
           System.out.println("////////////////////////////////////////////////////////////////////////////////");
           System.out.println("----------------------------------------------------------------");
           System.out.println("Enter Product Name ::: ");
           String companyName = input.inputString();
           companyName = companyName.toUpperCase().trim();
           MedicineCheck check = new MedicineCheck();
           boolean check1 = check.checkingMedicine(companyName);
           if(check1)
           {
                  deleteProductFile(companyName);
           }
           else
           {
                System.out.println("Product Name is Not Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    deleteMedicine();
                }
                else
                {
                    MedicalChoices choices = new MedicalChoices();
                    choices.medicalChoices();
                }
                
           }
       }
    
}
