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

    public ArrayList<Administrator> getAdmin() {
        return admin;
    }

    public void setAdmin(ArrayList<Administrator> admin) {
        this.admin = admin;
    }
   
    
   private ArrayList<Secretary>secretary = new ArrayList();

    public ArrayList<Secretary> getSecretary() {
        return secretary;
    }

    public void setSecretary(ArrayList<Secretary> secretary) {
        this.secretary = secretary;
    }
   
   
   private ArrayList<Doctor>doctor = new ArrayList();

    public ArrayList<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }
   
   
   private ArrayList<Patient>patient = new ArrayList();

    public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }
   
    private ArrayList<Stock>stock = new ArrayList();

    public ArrayList<Stock> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Stock> stock) {
        this.stock = stock;
    }
    
}
