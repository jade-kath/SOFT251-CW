/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author jade_
 */
public class Patient extends User {
    
    private LocalDateTime DateOfBirth;
    private String Gender;

    public LocalDateTime getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    private ArrayList<Prescription>prescription = new ArrayList();

    public ArrayList<Prescription> getPrescription() {
        return prescription;
    }

    public void setPrescription(ArrayList<Prescription> prescription) {
        this.prescription = prescription;
    }
    
    public void addPrescription (Prescription prescript) {
        this.prescription.add (prescript);
    }
    
    public void deletePrescription (int prescript) {
        this.prescription.remove (prescript);
    }
    
}
