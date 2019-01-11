/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author jade_
 */
public class User {
    private String FirstName;
    private String Surname;
    private String AddressLineOne;
    private String AddressLineTwo;
    private String PostCode;
    private String IDNum;
    
    /**
     * Receives the First Name
     * @return
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Sets the First Name to a value
     * @param FirstName
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Receives the Surname
     * @return
     */
    public String getSurname() {
        return Surname;
    }

    /**
     * Sets the Surname to a value
     * @param Surname
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Receives Address Line One
     * @return
     */
    public String getAddressLineOne() {
        return AddressLineOne;
    }

    /**
     * Sets Address Line One to a value 
     * @param AddressLineOne
     */
    public void setAddressLineOne(String AddressLineOne) {
        this.AddressLineOne = AddressLineOne;
    }

    /**
     * Receives Address Line Two
     * @return
     */
    public String getAddressLineTwo() {
        return AddressLineTwo;
    }

    /**
     * Sets Address Line Two to a value
     * @param AddressLineTwo
     */
    public void setAddressLineTwo(String AddressLineTwo) {
        this.AddressLineTwo = AddressLineTwo;
    }

    /**
     * Receives Post Code
     * @return
     */
    public String getPostCode() {
        return PostCode;
    }

    /**
     * Sets Post Code to a value
     * @param PostCode
     */
    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }

    /**
     * Receives ID Number
     * @return
     */
    public String getIDNum() {
        return IDNum;
    }

    /**
     * Sets an ID Number
     * @param IDNum
     */
    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }
    
    
}
