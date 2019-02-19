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
        
        System.out.print(a.getFormatedTimeBlock());
        System.out.print(a.toString());
        
        Appointment b = new Appointment();
        
        System.out.print(b.toString());
        
        Course c = new Course();
        
        System.out.print(c.toString());
        
       /* Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Info");

        alert.showAndWait();
       */
       JOptionPane.showMessageDialog(null, c.toString());
    }
    
}
