/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author jade_
 */
public class Medicine {
   private String MedicationName;
   private String Dosage;
   private int PrescriptionQty;
   private int InStockQty;
   private Boolean Prescribed = false;

    public String getMedicationName() {
        return MedicationName;
    }

    public void setMedicationName(String MedicationName) {
        this.MedicationName = MedicationName;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }

    public int getPrescriptionQty() {
        return PrescriptionQty;
    }

    public void setPrescriptionQty(int PrescriptionQty) {
        this.PrescriptionQty = PrescriptionQty;
    }

    public int getInStockQty() {
        return InStockQty;
    }

    public void setInStockQty(int InStockQty) {
        this.InStockQty = InStockQty;
    }

    public Boolean getPrescribed() {
        return Prescribed;
    }

    public void setPrescribed(Boolean Prescribed) {
        this.Prescribed = Prescribed;
    }
   
   
   
}
