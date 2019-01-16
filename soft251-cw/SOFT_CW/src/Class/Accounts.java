/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jade_
 */
public class Accounts implements Serializable {
    
   private ArrayList<Administrator>admin = new ArrayList();
   private ArrayList<Secretary>secretary = new ArrayList();
   private ArrayList<Doctor>doctor = new ArrayList();
   private ArrayList<Patient>patient = new ArrayList();
   private Stock stock = new Stock();
   
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

    /**
     * Retrieves the class
     * @return
     */
    public Stock getStock() {
        return stock;
    }

    /**
     * Sets the values within the class
     * @param stock
     */
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    
    /**
     * writes an object to a file
     * @throws IOException
     */
    public void writeFile() throws IOException {
        ObjectOutputStream oos = null;
        FileOutputStream fout = null;
        
        try {
            fout = new FileOutputStream("Z:\\Computing - Stage 2\\Module 3 SOFT251 - Object-orientated Programming (Java)\\soft251-cw\\DataFile.ser");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(this);
            oos.close();
            fout.close();
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    } 
    
    /**
     * Reads what's written on the file to the accounts file
     * @return
     * @throws IOException
     */
    public Accounts readFile() throws IOException {
        ObjectInputStream objectinputstream = null;
        Accounts accounts = new Accounts();
        try{
            FileInputStream streamIn = new FileInputStream("Z:\\Computing - Stage 2\\Module 3 SOFT251 - Object-orientated Programming (Java)\\soft251-cw\\DataFile.ser");
            objectinputstream = new ObjectInputStream(streamIn);
            Accounts account = (Accounts)objectinputstream.readObject();
            accounts = account;
            streamIn.close();
            objectinputstream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return accounts;
    }

}
