
package sale.viewsale;

import java.io.BufferedReader;
import java.io.FileReader;
import sale.SaleChoices;

public class ViewSale
{
      public void viewSale(String userID)
      {
          try
          {
                FileReader fileReader = new FileReader(userID+"ordered.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                
                for(int i=0 ; (data = reader.readLine()) != null ; i++)
                {
                    if(i == 0)
                    {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("User ID :::: " +data);
                  
                    }
                    if(i == 1)
                    {
                        
                        System.out.println("Product Name :::: " +data);
                     
                    }
                    if(i == 2)
                    {
                        
                        System.out.println("Quantity  :::: " +data);
                       
                    }
                    if(i == 3)
                    {
                      
                        System.out.println("Bill :::: " +data);
                         
                    }
                    if(i == 4)
                    {
                        System.out.println("Data  :::: " +data);
                        System.out.println("----------------------------------------------------------");
                        i = -1;
                    }
                }
                SaleChoices choices = new SaleChoices();
                choices.saleChoices(userID);
          }
          catch (Exception e) {
          }
      }
    
}
