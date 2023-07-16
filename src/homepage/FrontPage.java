
package homepage;

import medicalstockmanagementsystem.Input;
import user.createuser.CreateUser;
import user.createuser.ForgotPassword;
import user.createuser.UserLogin;

public class FrontPage
{
      public void designed()
      {
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println("-------------------------------------------------------------------------------------------------------------");
           System.out.println(">>>>>>>>>MEDICAL STORE STOCK MANAGEMENT SYSTEM <<<<<<<<<<<<<");
           System.out.println("-------------------------------------------------------------------------------------------------------------");
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println(">>>>>>>>>A. LOGIN <<<<<<<<<<<<<<<<<<<<<<<<<");
           System.out.println(">>>>>>>>>B. CREATE USER  <<<<<<<<<<<<<<<<<<<");
           System.out.println(">>>>>>>>>C. FORGOT PASSWORD <<<<<<<<<<<<<<");
           System.out.println(">>>>>>>>>E. EXIT <<<<<<<<<<<<<<<<<<<<<<<<<<<");
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println(">>>>>>>>>Enter the choice :::::: ");
           Input input = new Input();
           String str = input.inputString();
           str = str.toUpperCase().trim();
           if(str.equals("A"))
           {
               UserLogin login = new UserLogin();
               login.userLogin();
           }
           else if(str.equals("B"))
           {
               CreateUser createUser = new CreateUser();
               createUser.createUser();
                       
           }
           else if(str.equals("C"))
           {
               ForgotPassword forgotPassword = new ForgotPassword();
               forgotPassword.forgotPassword();
           }
           else if(str.equals("E"))
           {
               System.exit(0);
           }
           else
           {
               System.out.println("Enter the Value Between Given Choices");
               designed();
           }
      }
      
    
}
