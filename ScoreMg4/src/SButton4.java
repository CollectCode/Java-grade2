
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class SButton4 extends JButton{
    StudentVO4 student;
    
    public SButton4()   {
        
    }
    
    public SButton4(StudentVO4 obj)   {
        super(obj.toString());
        this.student = obj;
    }
    
    public void setStudent(StudentVO4 obj2)    {
        this.student = obj2;
    }
    
    public StudentVO4 getStudent()  {
        return student;
    }
    
    public void setText()   {
        super.setText(student.toString());
    }
}
