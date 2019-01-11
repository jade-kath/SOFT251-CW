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

    public ArrayList<Rating> getRating() {
        return rating;
    }

    public void setRating(ArrayList<Rating> rating) {
        this.rating = rating;
    }
    
     public void addRating(Rating ratings) {
        this.rating.add(ratings);
    }
        
}
