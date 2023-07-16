
package medical.medicineholedatadetails;

import company.displaycompanydata.DisplayCompanyData;
import java.io.BufferedReader;
import java.io.FileReader;
import medical.MedicalChoices;
import medical.medicinedisplaydetails.MedicineDisplayDetails;


public class MedicineHoleDataDetails 
{
     
       public void medicineHoleDataDetails()
       {
           try
         {
               MedicineDisplayDetails details = new MedicineDisplayDetails();
               FileReader fileReader = new FileReader("ProductNames.txt");  
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";
               int i = 0 ; 
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
               while((data = reader.readLine()) != null)
               {
                     details.displayDetails(data);
               }  
               MedicalChoices choices = new MedicalChoices();
               choices.medicalChoices();
         }
         catch (Exception e) 
         {
         }
       }
    
    
}
