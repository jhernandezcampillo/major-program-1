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
public class Faculty {
   private String firstName;
   private String lastName;
   private String officeLocation;
   private ArrayList<Course> courses;
   private ArrayList<TimeBlock> officeHours;
   private ArrayList<Appointment> appointments;
   
   public Faculty(){
       firstName = "";
       lastName = "";
       officeLocation = "";
       courses = new ArrayList<>();
       officeHours = new ArrayList<>();
       appointments = new ArrayList<>();
   }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the officeLocation
     */
    public String getOfficeLocation() {
        return officeLocation;
    }

    /**
     * @param officeLocation the officeLocation to set
     */
    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
   
    public int getNumCourses(){
        return courses.size();
    }
    public Course getCourse(int index){
        return courses.get(index);
    }
    public void setCourse(int index, Course item){
        courses.set(index, item);
    }
    public void addCourse(Course time){
        courses.add(time);
    }
    public Course removeCourse(int index){
        return courses.remove(index);
    }
    
    public int getNumOfficeHours(){
        return officeHours.size();
    }
    public TimeBlock getTimeBlock(int index){
        return officeHours.get(index);
    }
    public void setTimeBlock(int index, TimeBlock item){
        officeHours.set(index, item);
    }
    public void addTimeBlock(TimeBlock time){
        officeHours.add(time);
    }
    public TimeBlock removeTimeBlock(int index){
        return officeHours.remove(index);
    }
    
    public int getNumAppointments(){
        return appointments.size();
    }
    public Appointment getAppointment(int index){
        return appointments.get(index);
    }
    public void setAppointment(int index, Appointment item){
        appointments.set(index, item);
    }
    public void addAppointment(Appointment time){
        appointments.add(time);
    }
    public Appointment removeAppointment(int index){
        return appointments.remove(index);
    }
    
    @Override 
    public String toString(){
        String nl = System.lineSeparator();
        String out = firstName + nl + lastName + nl + officeLocation +nl + getNumCourses() + nl;
        
        for(int i = 0; i <courses.size();i++){
            out += courses.get(i).toString();   
        }
        out += getNumOfficeHours() + nl;
        
        for(int i = 0; i < officeHours.size(); i++){
            out += officeHours.get(i).toString();
        }
        out += getNumAppointments() + nl;
        for(int i = 0; i < appointments.size(); i++){
            out += appointments.get(i).toString();
        }
        return out;
    }
}
