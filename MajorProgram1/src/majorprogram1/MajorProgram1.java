/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.swing.JOptionPane;

/**
 *
 * @author Judith
 */
public class MajorProgram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TimeBlock a = new TimeBlock();
        a.setStartTime(1000);
        a.setEndTime(1200);
        a.setDay(DaysOfWeek.TUESDAY);
        a.setLocation("McNair 213");
        

        Appointment b = new Appointment();
        b.setDescription("Code Appt");
        b.setTimeBlock(a);
        

        
        Course c = new Course();
        c.addTimeBlock(a);
        c.setCourseName("Comp 167");
        c.setLocation("Cherry 111");
        
        Faculty f = new Faculty();
        f.setFirstName("Jay");
        f.setLastName("Juice");
        f.setOfficeLocation("SpaceJam");
        f.addCourse(c);
        f.addTimeBlock(a);
        f.addAppointment(b);
       
        Department d = new Department();
        d.setDepartmentName("Comp Sci Dep");
        d.setUnitName("College of Engineering");
        d.setUniversityName("A&T");
        d.addFaculty(f);
        
       /* Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Info");

        alert.showAndWait();
       */
       JOptionPane.showMessageDialog(null, a.toString());
       JOptionPane.showMessageDialog(null, b.toString());
       JOptionPane.showMessageDialog(null, c.toString());
       JOptionPane.showMessageDialog(null, f.toString());
       JOptionPane.showMessageDialog(null, d.toString());
    }
    
}
