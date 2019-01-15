/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.Serializable;

/**
 *
 * @author jade_
 */
public class Medicine implements Serializable {
   private String MedicationName;
   private String Dosage;
   private int PrescriptionQty;
   private int InStockQty;
   private Boolean Prescribed = false;

    /**
     * Receives the Medication Name
     * @return
     */
    public String getMedicationName() {
        return MedicationName;
    }

    /**
     * Sets the variable to the name of Medication
     * @param MedicationName
     */
    public void setMedicationName(String MedicationName) {
        this.MedicationName = MedicationName;
    }

    /**
     * Receives Dosage
     * @return
     */
    public String getDosage() {
        return Dosage;
    }

    /**
     * Sets the Dosage to a value
     * @param Dosage
     */
    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }

    /**
     * Receives the Quantity of Medicine prescribed on the Prescription
     * @return
     */
    public int getPrescriptionQty() {
        return PrescriptionQty;
    }

    /**
     * Sets the Quantity of Medicine prescribed
     * @param PrescriptionQty
     */
    public void setPrescriptionQty(int PrescriptionQty) {
        this.PrescriptionQty = PrescriptionQty;
    }

    /**
     * Receives the Quantity of each Medicine in Stock
     * @return
     */
    public int getInStockQty() {
        return InStockQty;
    }

    /**
     * Sets the Stock Quantity to a value
     * @param InStockQty
     */
    public void setInStockQty(int InStockQty) {
        this.InStockQty = InStockQty;
    }

    /**
     * When a Patient gets a prescription Boolean will turn to true, therefore receives if the patient is prescribed
     * @return
     */
    public Boolean getPrescribed() {
        return Prescribed;
    }

    /**
     * Sets the boolean value to true or false
     * @param Prescribed
     */
    public void setPrescribed(Boolean Prescribed) {
        this.Prescribed = Prescribed;
    }
   
   
   
}
