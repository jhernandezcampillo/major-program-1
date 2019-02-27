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
public class Department {
    private String departmentName;
    private String unitName;
    private String universityName;
    private ArrayList<Faculty> faculty;
    
    public Department(){
        departmentName = "";
        unitName = "";
        universityName = "";
        faculty = new ArrayList<>();
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return the unitName
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * @param unitName the unitName to set
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * @return the universityName
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * @param universityName the universityName to set
     */
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
        
    public int getFaculty(){
        return faculty.size();
    }
    public Faculty getFaculty(int index){
        return faculty.get(index);
    }
    public void setFaculty(int index, Faculty item){
        faculty.set(index, item);
    }
    public void addFaculty(Faculty time){
        faculty.add(time);
    }
    public Faculty removeFaculty(int index){
        return faculty.remove(index);
    }
}
