/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jade_
 */
public class Stock implements Serializable {
    
    private ArrayList<Medicine>medication = new ArrayList();

    /**
     * Receives Medication from the Medicine class
     * @return
     */
    public ArrayList<Medicine> getMedication() {
        return medication;
    }

    /**
     * Sets the Medication to a value
     * @param medication
     */
    public void setMedication(ArrayList<Medicine> medication) {
        this.medication = medication;
    }
    
    /**
     * Removes the number of Prescribed Medicines away from the Stock Quantity so the Stock Quantity stays up to date and correct
     * @param stockSelected
     * @param PrescriptionQty
     */
    public void removeStock (int stockSelected, int PrescriptionQty) {
        int InStockQty = medication.get(stockSelected).getInStockQty();
        InStockQty = InStockQty - PrescriptionQty;
        medication.get(stockSelected).setInStockQty(InStockQty);
    }
    
    /**
     * Creates a way to add a number of items to the Stock
     * @param stockSelected
     * @param QtyAdded
     */
    public void addStock (int stockSelected, int QtyAdded) {
        int InStockQty = medication.get(stockSelected).getInStockQty();
        InStockQty = InStockQty + QtyAdded;
        medication.get(stockSelected).setInStockQty(InStockQty);
    }
}
