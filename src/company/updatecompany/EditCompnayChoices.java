/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company.updatecompany;

import company.CompanyChoices;
import medicalstockmanagementsystem.Input;

public class EditCompnayChoices 
{
     public void editCompantChoies(String companyName)
     {
              Input input = new Input();
              try
               {
                          String temp = "";
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("+++++++++++++ A  :  Update Company Country +++++++++++++++");
                          System.out.println("+++++++++++++ B  :  Update Company Email +++++++++++++++++");
                          System.out.println("+++++++++++++ C  :  Update Company Contact Number  +++++++++");
                          System.out.println("+++++++++++++ D  :  Update Company Address  +++++++++++++++");
                          System.out.println("+++++++++++++ E  :  Exit ++++++++++++++++++++++++++++++++");
                          System.out.println("+++++++++++++ Enter your Choice ::: ");
                          String choice =  input.inputString();
                          choice = choice.toUpperCase().trim();
                          if(choice.equals("A"))
                          {
                                 System.out.println("Enter Company Country ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateCompany company = new UpdateCompany();
                                 company.editCompanyData(companyName, temp, 1);
                                 CompanyChoices cc =new CompanyChoices();
                                  cc.companyChoices();
                          }
                          else if(choice.equals("B"))
                          {
                                 System.out.println("Enter Company Email ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateCompany company = new UpdateCompany();
                                 company.editCompanyData(companyName, temp, 2);
                                  CompanyChoices cc =new CompanyChoices();
                                  cc.companyChoices();
                          }
                          else if(choice.equals("C"))
                          {
                                 System.out.println("Enter Company Contact Number  ::: ");
                                 long countactNumber = input.longBug();
                                 temp = Long.toString(countactNumber);
                                 temp = temp.trim();
                                 UpdateCompany company = new UpdateCompany();
                                 company.editCompanyData(companyName, temp, 3);
                                 CompanyChoices cc =new CompanyChoices();
                                 cc.companyChoices();
                          }
                          else if(choice.equals("D"))
                          {
                                 System.out.println("Enter Company Address ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 UpdateCompany company = new UpdateCompany();
                                 company.editCompanyData(companyName, temp, 4);
                                 CompanyChoices cc =new CompanyChoices();
                                 cc.companyChoices();
                          }
                          else if(choice.equals("E"))
                          {
                                 CompanyChoices cc =new CompanyChoices();
                                 cc.companyChoices();
                          }
                          else
                          {
                              System.out.println("Enter the Choice Between the given Choices .......................");
                              editCompantChoies(choice);
                          }
                          
          }
          catch (Exception e) {
          }
          
     }
    
}
