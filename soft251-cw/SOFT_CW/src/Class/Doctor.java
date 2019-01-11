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
public class Doctor extends User {
    
    private ArrayList<Rating>rating = new ArrayList();

    /**
     * Doctor creates an Array List that can receive the Doctor's Ratings
     * @return
     */
    public ArrayList<Rating> getRating() {
        return rating;
    }

    /**
     * Sets the value of Rating
     * @param rating
     */
    public void setRating(ArrayList<Rating> rating) {
        this.rating = rating;
    }
    
    /**
     * Allows a new Rating to be added 
     * @param ratings
     */
    public void addRating(Rating ratings) {
        this.rating.add(ratings);
    }
        
}
