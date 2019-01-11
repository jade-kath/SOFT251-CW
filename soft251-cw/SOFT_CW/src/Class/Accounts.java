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
public class Accounts {
    
   private ArrayList<Administrator>admin = new ArrayList();

    /**
     * Retrieves Administrator data from the Array
     * @return administrator
     */
    public ArrayList<Administrator> getAdmin() {
        return admin;
    }

    /**
     * Sets the value to Administrator 
     * @param admin
     */
    public void setAdmin(ArrayList<Administrator> admin) {
        this.admin = admin;
    }
   
    
   private ArrayList<Secretary>secretary = new ArrayList();

    /**
     * Retrieves Secretary data from the Array
     * @return
     */
    public ArrayList<Secretary> getSecretary() {
        return secretary;
    }

    /**
     * Sets the value to Secretary
     * @param secretary
     */
    public void setSecretary(ArrayList<Secretary> secretary) {
        this.secretary = secretary;
    }
   
   
   private ArrayList<Doctor>doctor = new ArrayList();

    /**
     * Retrieves Doctor data from the Array
     * @return
     */
    public ArrayList<Doctor> getDoctor() {
        return doctor;
    }

    /**
     * Sets the value to Doctor
     * @param doctor
     */
    public void setDoctor(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }
   
   
   private ArrayList<Patient>patient = new ArrayList();

    /**
     * Retrieves Patient data from the Array
     * @return
     */
    public ArrayList<Patient> getPatient() {
        return patient;
    }

    /**
     * Sets the value to Patient
     * @param patient
     */
    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }
   
    private ArrayList<Stock>stock = new ArrayList();

    /**
     * Retrieves Stock data from the Array
     * @return
     */
    public ArrayList<Stock> getStock() {
        return stock;
    }

    /**
     * Sets the value to Stock
     * @param stock
     */
    public void setStock(ArrayList<Stock> stock) {
        this.stock = stock;
    }
    
}
