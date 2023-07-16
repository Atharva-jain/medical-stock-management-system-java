
package user.createuser;

import homepage.FrontPage;
import java.io.BufferedReader;
import java.io.FileReader;
import medical.updatemedicines.UpdateMedicines;
import medicalstockmanagementsystem.CheckingUserID;
import medicalstockmanagementsystem.Input;

public class ForgotPassword 
{
      public boolean checkUsername(String ID, String username)
      {
          String usernameCheck="";
          boolean check = false;
          try
          {
               
                FileReader fileReader = new FileReader(ID+".txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                while((data = reader.readLine()) != null)
                {
                      if(data.equals(username))
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
      public void forgotPassword()
      {
           Input input = new Input();
           System.out.println("/////////////////////////////////////////////////////////////////////////////////");
           System.out.println("----------------------------------------------------------------");
           System.out.println("Enter Your ID ::: ");
           int ID = input.integerBug();
           CheckingUserID checkingUserID = new CheckingUserID();
           boolean check = checkingUserID.checkingUserID(Integer.toString(ID));
           if(check)
           {
              String id = Integer.toString(ID);
              System.out.println("----------------------------------------------------------------");
              System.out.println("Enter Username");
              String username = input.inputString();
              username = username.trim();
              boolean ok = checkUsername(id, username);
              if(ok)
              {
                  System.out.println("----------------------------------------------------------------");
                  System.out.println("Enter New Password :::: ");
                  String password = input.inputString();
                  password = password.trim();
                  UpdateMedicines medicines = new UpdateMedicines();
                  medicines.updateMedicineData(id, password, 2);
                  System.out.println("PASSWORD CHANGED SUCCESSFULLY !!!..................");
                  FrontPage fp = new FrontPage();
                  fp.designed();
              }
              else
              {
                  System.out.println("Invalid Username !! ..............");
                  System.out.println("You want to try Again (Yes / No )");
                  String str = input.inputString();
                  str = str.toUpperCase().trim();
                  if(str.equals("YES"))
                  {
                      forgotPassword();
                  }
                  else
                  {
                       FrontPage fp = new FrontPage();
                       fp.designed();
                  }
              }
           }
           else
           {
                  System.out.println("Invalid User ID !! ..............");
                  System.out.println("You want to try Again (Yes / No )");
                  String str = input.inputString();
                  str = str.toUpperCase().trim();
                  if(str.equals("YES"))
                  {
                      forgotPassword();
                  }
                  else
                  {
                       FrontPage fp = new FrontPage();
                       fp.designed();
                  }
           }
      }
    
}
