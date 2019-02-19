/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

import java.util.ArrayList;

/**
 *
 * @author Judith
 */
public class Course {
    private String courseName;
    private String location;
    private  ArrayList <TimeBlock> timeBlocks;
    
    public Course(){
        courseName = "me";
        location = "try";
        timeBlocks = new ArrayList<TimeBlock>();
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    /**
     * @return the timeBlocks
     */
    public ArrayList <TimeBlock> getTimeBlocks() {
        return timeBlocks;
    }

    /**
     * @param timeBlocks the timeBlocks to set
     */
    public void setTimeBlocks(ArrayList <TimeBlock> timeBlocks) {
        this.timeBlocks = timeBlocks;
    }
    
    public String toString(){
        String show = "";
        show += courseName+ "\n"+ location+ "\n"+timeBlocks;
        return show;
    }
}
