/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalstockmanagementsystem;

import company.deleteCompany.DeleteCompany;
import company.displaycompanydata.DisplayCompanyData;
import company.displayhoecompanydetails.DisplayHoleCompanyDetails;
import company.insertcompanies.InsertCompanies;
import company.updatecompany.UpdateCompany;
import homepage.FrontPage;
import medical.deletemedicine.DeleteMedicine;
import medical.insertmedicines.InsertMedicines;
import medical.medicinedisplaydetails.MedicineDisplayDetails;
import medical.medicineholedatadetails.MedicineHoleDataDetails;
import medical.updatemedicines.UpdateMedicines;
import sale.newsale.NewSale;
import sale.viewsale.ViewSale;
import user.createuser.CreateUser;
import user.createuser.ForgotPassword;
import user.createuser.UserLogin;

/**
 *
 * @author MCT
 */
public class MedicalStockManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        InsertCompanies companies = new InsertCompanies();
//        companies.insertCompanies();
//          UpdateCompany company = new UpdateCompany();
//          company.updateCompany();
//          DisplayCompanyData companyData = new DisplayCompanyData();
//          companyData.displayCompanyData();
//            DisplayHoleCompanyDetails companyDetails = new DisplayHoleCompanyDetails();
//            companyDetails.displayHoleCompanyDetails();
//            DeleteCompany company = new DeleteCompany();
//            company.deleteCompany();
//              InsertMedicines im = new InsertMedicines();
//              im.insertMedicines();
//               UpdateMedicines medicines = new UpdateMedicines();
//               medicines.updateMedicines();
//             DeleteMedicine deleteMedicine = new DeleteMedicine();
//             deleteMedicine.deleteMedicine();
//               MedicineDisplayDetails details = new MedicineDisplayDetails();
//               details.medicineDisplayDetails();
//                MedicineHoleDataDetails dataDetails = new MedicineHoleDataDetails();
//                dataDetails.medicineHoleDataDetails();
//              NewSale newSale = new NewSale();
//              newSale.newSale();
                
//               CreateUser createUser = new CreateUser();
//               createUser.createUser();
//                 ForgotPassword forgotPassword = new ForgotPassword();
//                 forgotPassword.forgotPassword();
//                   UserLogin login = new UserLogin();
//                   login.userLogin();
//                     NewSale newSale = new NewSale();
//                     newSale.newSale("1");
                    FrontPage fp = new FrontPage();
                    fp.designed();
    }
    
}
