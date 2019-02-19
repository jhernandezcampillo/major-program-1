/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

/**
 *
 * @author Judith
 */
public class TimeBlock {
    private DaysOfWeek day;
    private int startTime;
    private int endTime;
    private String comments;
    private String location;
    
    public TimeBlock(){
       day = null; 
       startTime = 0;
       endTime = 0;
       comments = "";
       location = "";
    }

    /**
     * @return the day
     */
    public DaysOfWeek getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(DaysOfWeek day) {
        this.day = day;
    }

    /**
     * @return the startTime
     */
    public int getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public int getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getFormatedTimeBlock(){
        String formTime ="";
        formTime += startTime + " - "+ endTime +" "+ comments + " "+ location;
        return formTime; 
    }
    public String toString(){
        String formBlock = "";
        formBlock += day + ", " + startTime + ", "+ endTime +"\n";
        return formBlock;
    }
    
    
}

