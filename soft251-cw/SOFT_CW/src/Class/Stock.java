/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author jade_
 */
public class Stock {
    
    private ArrayList<Medicine>medication = new ArrayList();

    public ArrayList<Medicine> getMedication() {
        return medication;
    }

    public void setMedication(ArrayList<Medicine> medication) {
        this.medication = medication;
    }
    
    public void removeStock (int stockSelected, int PrescriptionQty) {
        int InStockQty = medication.get(stockSelected).getInStockQty();
        InStockQty = InStockQty - PrescriptionQty;
        medication.get(stockSelected).setInStockQty(InStockQty);
    }
    
    public void addStock (int stockSelected, int QtyAdded) {
        int InStockQty = medication.get(stockSelected).getInStockQty();
        InStockQty = InStockQty + QtyAdded;
        medication.get(stockSelected).setInStockQty(InStockQty);
    }
}
