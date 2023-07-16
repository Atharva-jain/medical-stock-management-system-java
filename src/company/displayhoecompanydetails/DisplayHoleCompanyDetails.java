package company.displayhoecompanydetails;

import company.CompanyChoices;
import company.displaycompanydata.DisplayCompanyData;
import java.io.BufferedReader;
import java.io.FileReader;
import jdk.nashorn.internal.ir.TryNode;

public class DisplayHoleCompanyDetails 
{
     public void displayHoleCompanyDetails()
     {
         try
         {
               DisplayCompanyData companyData = new DisplayCompanyData();
               FileReader fileReader = new FileReader("CompanyNames.txt");  
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";
               int i = 0 ; 
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
               while((data = reader.readLine()) != null)
               {
                   companyData.displayData(data);
               }  
               CompanyChoices cc =new CompanyChoices();
               cc.companyChoices();
         }
         catch (Exception e) 
         {
         }
     }
    
}
