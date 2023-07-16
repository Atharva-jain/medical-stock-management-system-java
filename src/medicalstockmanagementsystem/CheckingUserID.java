
package medicalstockmanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckingUserID 
{
      public boolean checkingUserID(String ID)
      {
          boolean check = false;
          try
          {
                FileReader fileReader = new FileReader("UserIDs.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                while((data = reader.readLine()) != null)
                {
                    if(data.equals(ID))
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
