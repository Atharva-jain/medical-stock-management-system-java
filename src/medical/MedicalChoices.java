 
package medical;

import medical.deletemedicine.DeleteMedicine;
import medical.insertmedicines.InsertMedicines;
import medical.medicinedisplaydetails.MedicineDisplayDetails;
import medical.medicineholedatadetails.MedicineHoleDataDetails;
import medical.updatemedicines.UpdateMedicines;
import medicalstockmanagementsystem.Input;

 
public class MedicalChoices
{
      public void medicalChoices()
      {
           
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println(">>>>>>>>>A. ADD MEDICINE DETAILS <<<<<<<<<<");
           System.out.println(">>>>>>>>>B. UPDATE MEDICINE DETAILS  <<<<<<");
           System.out.println(">>>>>>>>>C. DELETE MEDICINE  DETAILS  <<<<<<");
           System.out.println(">>>>>>>>>D. DISPLAY ALL MEDICINE DETAILS  <<");
           System.out.println(">>>>>>>>>E.  SEARCH MEDICINE  <<<<<<<<<<<<<<");
           System.out.println(">>>>>>>>>X.  EXIT <<<<<<<<<<<<<<<<<<<<<<<<<<<");
           System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
           System.out.println(">>>>>>>>>Enter the choice :::::: ");
           Input input = new Input();
           String str = input.inputString();
           str = str.toUpperCase().trim();
           if(str.equals("A"))
           {
                 InsertMedicines  im = new InsertMedicines();
                 im.insertMedicines();
           }
           else if(str.equals("B"))
           {
                  UpdateMedicines medicines = new UpdateMedicines();
                  medicines.updateMedicines();
                       
           }
           else if(str.equals("C"))
           {
                 DeleteMedicine deleteMedicine = new DeleteMedicine();
                 deleteMedicine.deleteMedicine();
           }
           else if(str.equals("D"))
           {
                 MedicineHoleDataDetails dataDetails = new MedicineHoleDataDetails();
                 dataDetails.medicineHoleDataDetails();
           }
           else if(str.equals("E"))
           {
                MedicineDisplayDetails details = new MedicineDisplayDetails();
                details.medicineDisplayDetails();
           }
           else if(str.equals("X"))
           {
               System.exit(0);
           }
           else
           {
               System.out.println("Enter the Value Between Given Choices");
               medicalChoices();
           }
      }
}
