/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import afterlogin.AfterLoginChoices;
import company.deleteCompany.DeleteCompany;
import company.displaycompanydata.DisplayCompanyData;
import company.displayhoecompanydetails.DisplayHoleCompanyDetails;
import company.insertcompanies.InsertCompanies;
import company.updatecompany.UpdateCompany;
import medicalstockmanagementsystem.Input;

/**
 *
 * @author MCT
 */
public class CompanyChoices 
{
     public void companyChoices()
     {
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println(">>>>>>>>>A. ADD COMPANY DETAILS <<<<<<<<<<");
           System.out.println(">>>>>>>>>B. UPDATE COMPANY DETAILS  <<<<<<");
           System.out.println(">>>>>>>>>C. DELETE COMPANY  DETAILS  <<<<<<");
           System.out.println(">>>>>>>>>D. DISPLAY ALL COMPANY DETAILS  <<");
           System.out.println(">>>>>>>>>E.  SEARCH COMPANY  <<<<<<<<<<<<<<");
           System.out.println(">>>>>>>>>X.  EXIT <<<<<<<<<<<<<<<<<<<<<<<<<<<");
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println(">>>>>>>>>Enter the choice :::::: ");
           Input input = new Input();
           String str = input.inputString();
           str = str.toUpperCase().trim();
           if(str.equals("A"))
           {
                 InsertCompanies companies = new InsertCompanies();
                 companies.insertCompanies();
           }
           else if(str.equals("B"))
           {
                 UpdateCompany company = new UpdateCompany();
                 company.updateCompany();
                       
           }
           else if(str.equals("C"))
           {
                DeleteCompany company = new DeleteCompany();
                company.deleteCompany();
           }
           else if(str.equals("D"))
           {
                DisplayHoleCompanyDetails companyDetails = new DisplayHoleCompanyDetails();
                companyDetails.displayHoleCompanyDetails();
           }
           else if(str.equals("E"))
           {
                DisplayCompanyData companyData = new DisplayCompanyData();
                companyData.displayCompanyData();
           }
           else if(str.equals("X"))
           {
             
           }
           else
           {
               System.out.println("Enter the Value Between Given Choices");
               companyChoices();
           }
     }
    
}
