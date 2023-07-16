 package medicalstockmanagementsystem;
  
import com.oracle.nio.BufferSecrets;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import medical.updatemedicines.UpdateMedicines;

 public class CheckCompanyName 
 {
      public boolean checkCompanyName(String companyName)
      {
          boolean check = true;
          try
          {
                FileReader fileReader = new FileReader("CompanyNames.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                while((data = reader.readLine()) != null)
                {
                    if(data.equals(companyName))
                    {
                        check = false;
                    }
                }
          }
          catch (Exception e) 
          {
          }
          return check;
      }
      public boolean checkingCompanyName(String companyName)
      {
          boolean check = false;
          try
          {
                FileReader fileReader = new FileReader("CompanyNames.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                while((data = reader.readLine()) != null)
                {
                    if(data.equals(companyName))
                    {
                        check = true;
                     
                    }
                }
          }
          catch (Exception e) 
          {
          }
          return check;
      }
 } 
