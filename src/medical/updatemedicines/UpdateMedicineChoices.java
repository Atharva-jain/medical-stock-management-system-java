
package medical.updatemedicines;

import company.updatecompany.UpdateCompany;
import medicalstockmanagementsystem.Input;

public class UpdateMedicineChoices
{
     public void updateMedicineChoices(String productName)
     {
           Input input = new Input();
              try
               {
                          String temp = "";
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("+++++++++++++ A  :  Update Company Name +++++++++++++++");
                          System.out.println("+++++++++++++ B  :  Update Product Category ++++++++++++++");
                          System.out.println("+++++++++++++ C  :  Update Quantity  ++++++++++++++++++++");
                          System.out.println("+++++++++++++ D  :  Update Price  +++++++++++++++++++++++");
                          System.out.println("+++++++++++++ E  :  Exit ++++++++++++++++++++++++++++++");
                          System.out.println("+++++++++++++ Enter your Choice ::: ");
                          String choice =  input.inputString();
                          choice = choice.toUpperCase().trim();
                          if(choice.equals("A"))
                          {
                                 System.out.println("Enter Company Name ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateMedicines medicines = new UpdateMedicines();
                                 medicines.updateMedicineData(productName, temp, 1);
                          }
                          else if(choice.equals("B"))
                          {
                                 System.out.println("Enter Product Category ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateMedicines medicines = new UpdateMedicines();
                                 medicines.updateMedicineData(productName, temp, 2);
                              
                          }
                          else if(choice.equals("C"))
                          {
                                 System.out.println("Enter Product Quantity  ::: ");
                                 long countactNumber = input.longBug();
                                 temp = Long.toString(countactNumber);
                                 temp = temp.trim();
                                 UpdateMedicines medicines = new UpdateMedicines();
                                 medicines.updateMedicineData(productName, temp, 3);
                          }
                          else if(choice.equals("D"))
                          {
                                 System.out.println("Enter Product Price ::: ");
                                 long countactNumber = input.longBug();
                                 temp = Long.toString(countactNumber);
                                 temp = temp.trim();
                                 UpdateMedicines medicines = new UpdateMedicines();
                                 medicines.updateMedicineData(productName, temp, 4);
                          }
                          else if(choice.equals("E"))
                          {
                                 
                          }
                          else
                          {
                              System.out.println("Enter the Choice Between the given Choices .......................");
                              updateMedicineChoices(choice);
                          }
                          
          }
          catch (Exception e) {
          }
          
     }
    
}
