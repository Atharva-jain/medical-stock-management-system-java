
package sale;

import afterlogin.AfterLoginChoices;
import company.CompanyChoices;
import medical.MedicalChoices;
import medicalstockmanagementsystem.Input;
import sale.newsale.NewSale;
import sale.viewsale.ViewSale;

public class SaleChoices
{
      public void saleChoices(String userID)
      {
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println(">>>>>>>>>A. NEW SALE  <<<<<<<<<<<<<<<<<<<<<");
           System.out.println(">>>>>>>>>B. VIEW SALE  <<<<<<<<<<<<<<<<<<<<<");
           System.out.println(">>>>>>>>>E. EXIT <<<<<<<<<<<<<<<<<<<<<<<<<<<");
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println(">>>>>>>>>Enter the choice :::::: ");
           Input input = new Input();
           String str = input.inputString();
           str = str.toUpperCase().trim();
           if(str.equals("A"))
           {
                NewSale newSale = new NewSale();
                newSale.newSale(userID);
           }
           else if(str.equals("B"))
           {
                 ViewSale sale = new ViewSale();
                 sale.viewSale(userID);
           }
           else if(str.equals("E"))
           {
               AfterLoginChoices afterLoginChoices = new AfterLoginChoices();
               afterLoginChoices.afterLoginChoices(userID);
           }
           else
           {
               System.out.println("Enter the Value Between Given Choices");
               saleChoices(userID);
           }
      }
    
}
