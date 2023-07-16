
package medical.insertmedicines;

import medical.MedicalChoices;
import medicalstockmanagementsystem.CheckCompanyName;
import medicalstockmanagementsystem.Input;
import medicalstockmanagementsystem.MedicineCheck;

public class InsertMedicines 
{
      Input input = new Input();
      public void insertMedicines()
      {
            CheckCompanyName  ccn = new CheckCompanyName();
            System.out.println("//////////////////////////////////////////////////////////////////////////////");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Product Name ::: ");
            String productName =  input.inputString();
            MedicineCheck check1 = new MedicineCheck();
            productName = productName.toUpperCase().trim();
            boolean ok = check1.checkMedicine(productName);
            if(ok){
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Company Name ::: ");
            String companyName = input.inputString();
            companyName = companyName.toUpperCase().trim();
            boolean check = ccn.checkingCompanyName(companyName);
            if(check)
            {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Product Category ::: ");
                String productCategory = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Quantity ::: ");
                int quantity = input.integerBug();
                String quantityString  = Integer.toString(quantity);
                System.out.println("----------------------------------------------------------------");
                System.out.println("Price Per Unit ::: ");
                int price = input.integerBug();
                String pricePerUnit = Integer.toString(price);
                System.out.println("----------------------------------------------------------------");
                StoreMedicianData data = new StoreMedicianData();
                data.storeMedicianData(productName, companyName, productCategory, quantityString, pricePerUnit);
                System.out.println("Medicine Details are Store !!! ...............................");
                MedicalChoices choices = new MedicalChoices();
                choices.medicalChoices();
            }
            else
            {
                System.out.println("Company Name is Not Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    insertMedicines();
                }
                else
                {
                    MedicalChoices choices = new MedicalChoices();
                    choices.medicalChoices();
                }
            }
            }
            else
            {
                System.out.println("Product Name is Already Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    insertMedicines();
                }
                else
                {
                    MedicalChoices choices = new MedicalChoices();
                    choices.medicalChoices();
                }
            }
      }    
}
