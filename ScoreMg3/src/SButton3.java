
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class SButton3 extends JButton{
    StudentVO3 student;
    
    public SButton3()   {
        
    }
    
    public SButton3(StudentVO3 obj1) {
        super(obj1.toString());
        this.student = obj1;   
    }
    
    public StudentVO3 getStudent()    {
        return student;
    }
    
    public void setStudent(StudentVO3 obj2)  {
        this.student = obj2;
    }
    // 못함
    public void setText() {
        super.setText(student.toString());
    }
}
