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

    /**
     * Receives the Patients Date of Birth
     * @return
     */
    public LocalDateTime getDateOfBirth() {
        return DateOfBirth;
    }

    /**
     * Sets the value of the Patients Date of Birth
     * @param DateOfBirth
     */
    public void setDateOfBirth(LocalDateTime DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Receives the Gender of the Patient
     * @return
     */
    public String getGender() {
        return Gender;
    }

    /**
     * Sets the value of the Patients Gender
     * @param Gender
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    private ArrayList<Prescription>prescription = new ArrayList();

    /**
     * Receive Prescriptions from Prescription Class
     * @return
     */
    public ArrayList<Prescription> getPrescription() {
        return prescription;
    }

    /**
     * Sets the value of a Patients Prescription
     * @param prescription
     */
    public void setPrescription(ArrayList<Prescription> prescription) {
        this.prescription = prescription;
    }
    
    /**
     * Allows a Prescription to be added to a Patient
     * @param prescript
     */
    public void addPrescription (Prescription prescript) {
        this.prescription.add (prescript);
    }
    
    /**
     * Removes the Prescription from the Patient
     * @param prescript
     */
    public void deletePrescription (int prescript) {
        this.prescription.remove (prescript);
    }
    
}
