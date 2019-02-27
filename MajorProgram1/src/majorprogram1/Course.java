/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Judith
 */
public class Course {
    private String courseName;
    private String location;
    private  ArrayList <TimeBlock> timeBlocks;
    
    public Course(){
        courseName = "";
        location = "";
        timeBlocks = new ArrayList<>();
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


    
    public int getNumTimeBlocks(){
        return timeBlocks.size();
    }
    public TimeBlock getTimeBlock(int index){
        return timeBlocks.get(index);
    }
    public void setTimeBlock(int index, TimeBlock item){
        timeBlocks.set(index, item);
    }
    public void addTimeBlock(TimeBlock time){
        timeBlocks.add(time);
    }
    public TimeBlock removeTimeBlock(int index){
        return timeBlocks.remove(index);
    }
    @Override 
    
    public String toString(){
        String nl = System.lineSeparator();
        String out = courseName + nl + location + nl + getNumTimeBlocks() + nl;
        for (int i = 0; i<timeBlocks.size();i++){
            out += timeBlocks.get(i).toString();
        }
        return out;
    }
}
