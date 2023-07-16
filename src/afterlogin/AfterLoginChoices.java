
package afterlogin;

import company.CompanyChoices;
import homepage.FrontPage;
import medical.MedicalChoices;
import medicalstockmanagementsystem.Input;
import sale.SaleChoices;

import user.createuser.CreateUser;
import user.createuser.ForgotPassword;
import user.createuser.UserLogin;


public class AfterLoginChoices 
{
      public void afterLoginChoices(String userID)
      {
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println(">>>>>>>>>A. COMPANY MANAGEMENT <<<<<<<<<");
           System.out.println(">>>>>>>>>B. MEDICINE MANAGEMENT  <<<<<<<<<");
           System.out.println(">>>>>>>>>C. SALE  <<<<<<<<<<<<<<<<<<<<<<<<<<<");
           System.out.println(">>>>>>>>>E. EXIT <<<<<<<<<<<<<<<<<<<<<<<<<<<");
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println(">>>>>>>>>Enter the choice :::::: ");
           Input input = new Input();
           String str = input.inputString();
           str = str.toUpperCase().trim();
           if(str.equals("A"))
           {
               CompanyChoices cc = new  CompanyChoices();
               cc.companyChoices();
           }
           else if(str.equals("B"))
           {
               MedicalChoices choices = new MedicalChoices();
               choices.medicalChoices();
           }
           else if(str.equals("C"))
           {
                SaleChoices saleChoices = new SaleChoices();
                saleChoices.saleChoices(userID);
           }
           else if(str.equals("E"))
           {
               FrontPage fp = new FrontPage();
               fp.designed();
           }
           else
           {
               System.out.println("Enter the Value Between Given Choices");
               afterLoginChoices(userID);
           }
      }
}
