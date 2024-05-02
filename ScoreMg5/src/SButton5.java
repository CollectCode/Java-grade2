
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class SButton5 extends JButton{
    StudentVO5 student;
    
    public SButton5()   {
        
    }
    
    public SButton5(StudentVO5 obj) {
        super(obj.toString());
        this.student = obj;
    }
    
    public void setStudent(StudentVO5 obj2)    {
        this.student = obj2;
    }
    
    public StudentVO5 getStudent()  {
        return student;
    }
}
