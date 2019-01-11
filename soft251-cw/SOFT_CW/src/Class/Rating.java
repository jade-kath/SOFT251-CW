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
public class Rating {
   private int Rating;
   private String Feedback;

    /**
     * Receives a Rating
     * @return
     */
    public int getRating() {
        return Rating;
    }

    /**
     * Sets a value for the Rating
     * @param Rating
     */
    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    /**
     * Receives Feedback
     * @return
     */
    public String getFeedback() {
        return Feedback;
    }

    /**
     * Sets the Feedback to a value
     * @param Feedback
     */
    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }
   
   
}
