/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Judith
 */
public class Department {

    private String departmentName;
    private String unitName;
    private String universityName;
    private ArrayList<Faculty> faculty;

    public Department() {
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

    public int getNumFaculty() {
        return faculty.size();
    }

    public Faculty getFaculty(int index) {
        return faculty.get(index);
    }

    public void setFaculty(int index, Faculty item) {
        faculty.set(index, item);
    }

    public void addFaculty(Faculty time) {
        faculty.add(time);
    }

    public Faculty removeFaculty(int index) {
        return faculty.remove(index);
    }

    public void loadDepartmentData(String inputFileName) {
        try {
            Scanner scan = new Scanner(new File(inputFileName));

            setDepartmentName(scan.nextLine());
            setUnitName(scan.nextLine());
            setUniversityName(scan.nextLine());

            while (scan.hasNext()) {
                Faculty f = new Faculty();
                f.setFirstName(scan.nextLine());
                f.setLastName(scan.nextLine());
                f.setOfficeLocation(scan.nextLine());
                int cn = Integer.parseInt(scan.nextLine().trim());
                for (int i = 0; i < cn; i++) {
                    Course c = new Course();
                    c.setCourseName(scan.nextLine());
                    c.setLocation(scan.nextLine());
                    int tb = Integer.parseInt(scan.nextLine().trim());
                    for (int j = 0; j < tb; j++) {
                        TimeBlock t = new TimeBlock();
                        String[] s = scan.nextLine().split(",");
                        t.setDay(DaysOfWeek.valueOf(s[0].trim()));
                        t.setStartTime(Integer.parseInt(s[1].trim()));
                        t.setEndTime(Integer.parseInt(s[2].trim()));
                        c.addTimeBlock(t);
                    }
                    f.addCourse(c);

                }
                int offhr = Integer.parseInt(scan.nextLine());
                for (int j = 0; j < offhr; j++) {
                    TimeBlock t = new TimeBlock();
                    String[] s = scan.nextLine().trim().split(",");
                    t.setDay(DaysOfWeek.valueOf(s[0]));
                    t.setStartTime(Integer.parseInt(s[1].trim()));
                    t.setEndTime(Integer.parseInt(s[2].trim()));
                    f.addTimeBlock(t);

                }
                int apptNum = Integer.parseInt(scan.nextLine().trim());
                for (int j = 0; j < apptNum; j++) {
                    Appointment a = new Appointment();
                    TimeBlock t = new TimeBlock();
                    a.setDescription(scan.nextLine());
                    String[] s = scan.nextLine().trim().split(",");
                    t.setDay(DaysOfWeek.valueOf(s[0]));
                    t.setStartTime(Integer.parseInt(s[1].trim()));
                    t.setEndTime(Integer.parseInt(s[2].trim()));
                    a.setTimeBlock(t);
                    f.addAppointment(a);   
                }
                addFaculty(f);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File must be selected");
            System.exit(-1);
        }
    }


public void saveDepartmentData(String outputFileName) {
        try {
            PrintWriter p = new PrintWriter(outputFileName);
            p.print(toString());
            p.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File Not Found");
            System.exit(-1);
        }
    }

    public String atAGlance(DaysOfWeek day, int time) {
        String glance = "";
        return glance;

    }

    @Override
        public String toString() {
        String nl = System.lineSeparator();
        String out = departmentName + nl + unitName + nl + universityName + nl;
        for (int i = 0; i < faculty.size(); i++) {
            out += faculty.get(i).toString();
        }
        return out;
    }
}
