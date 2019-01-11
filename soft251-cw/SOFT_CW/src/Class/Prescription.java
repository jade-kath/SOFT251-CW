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
public class Prescription {
    private String Notes;

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
    
    private ArrayList<Medicine>medication = new ArrayList();

    public ArrayList<Medicine> getMedication() {
        return medication;
    }

    public void setMedication(ArrayList<Medicine> medication) {
        this.medication = medication;
    }
    
}
