
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class ShButton extends JButton {
    StudentInfo student;
    
    public ShButton()    {
        
    }
    
    public ShButton(StudentInfo obj) {
        super(obj.toString());
        this.student = obj;
    }
    
    public void setStudent(StudentInfo obj2)    {
        this.student = obj2;
    }
    
    public StudentInfo getStudent() {
        return student;
    }
}
