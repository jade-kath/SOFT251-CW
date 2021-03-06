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
public class Prescription implements Serializable {
    private String Notes;

    /**
     * Receives Notes
     * @return
     */
    public String getNotes() {
        return Notes;
    }

    /**
     * Sets Notes with a value
     * @param Notes
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
    
    private ArrayList<Medicine>medication = new ArrayList();

    /**
     * Receives the Medication for the Prescription
     * @return
     */
    public ArrayList<Medicine> getMedication() {
        return medication;
    }

    /**
     * Set the value of a Medication
     * @param medication
     */
    public void setMedication(ArrayList<Medicine> medication) {
        this.medication = medication;
    }
    
}
