
package medical.updatemedicines;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import medical.MedicalChoices;
import medicalstockmanagementsystem.CheckCompanyName;
import medicalstockmanagementsystem.Input;
import medicalstockmanagementsystem.MedicineCheck;

public class UpdateMedicines 
{
        
       public void replaceData(String productName)
       {
        try
        {
            FileReader fileReader = new FileReader("temp.txt");
            FileWriter fileWriter = new FileWriter(productName+".txt", false);
            BufferedReader reader= new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            String data = "";
            int i =0;
            while((data = reader.readLine()) != null)
            {
                writer.write(data);
                writer.newLine();
                i++;
            }
            writer.close();
            reader.close();
         }
         catch (Exception e) 
         {
           
         }
       }
     
       
       public void updateMedicineData(String productName, String valueToChanged, int index)
       {
           try
                   {
                         FileReader fileReader = new FileReader(productName+".txt");
                         FileWriter fileWriter = new FileWriter("temp.txt", false);
                         BufferedReader reader = new BufferedReader(fileReader);
                         BufferedWriter writer = new BufferedWriter(fileWriter);
                         String data =  "";
                         int i = 0 ; 
                         while((data = reader.readLine()) != null)
                         {
                             if(index == i)
                             {
                                  String changed = data.replaceAll(data, valueToChanged);
                                   
                                  writer.write(changed);
                                  writer.newLine();
                             }
                             else
                             {
                                  writer.write(data);
                                  writer.newLine();
                                   
                             }
                             i++;
                         }
                        
                        writer.close();
                        reader.close();
                        replaceData(productName);
                    }
                   catch (Exception e) 
                   {
                   }
       }
     
      public void updateMedicines()
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
                    UpdateMedicineChoices choices = new UpdateMedicineChoices();
                    choices.updateMedicineChoices(companyName);
                    MedicalChoices choicesDemo = new MedicalChoices();
                    choicesDemo.medicalChoices();
           }
           else
           {
                System.out.println("Product Name is Not Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    updateMedicines();
                }
                else
                {
                    MedicalChoices choices = new MedicalChoices();
                    choices.medicalChoices();
                }
                
           }
      }
    
}
