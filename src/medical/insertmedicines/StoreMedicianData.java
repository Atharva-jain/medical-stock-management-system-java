
package medical.insertmedicines;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class StoreMedicianData 
{
     public void storeProductNames(String productName)
     {
         try
         {
                FileWriter writer = new FileWriter("ProductNames.txt",true);
                BufferedWriter buffWriter = new BufferedWriter(writer);
                buffWriter.write(productName);
                buffWriter.newLine();
                buffWriter.close();
         }
         catch (Exception e) {
         }
     }
     
     public void storeMedicianData(String name, String cName, String category, String quantity, String price)
     {
           
           try 
           {  
                 name = name.toUpperCase().trim();
                 FileWriter fileWriter = new FileWriter(name+".txt");
                 BufferedWriter writer = new BufferedWriter(fileWriter);
                 writer.write(name);
                 writer.newLine();
                 writer.write(cName);
                 writer.newLine();
                 writer.write(category);
                 writer.newLine();
                 writer.write(quantity);
                 writer.newLine();
                 writer.write(price);
                 writer.newLine();
                 writer.close();
                 storeProductNames(name);
           } catch (Exception e) 
          {
          }
     }
    
}
