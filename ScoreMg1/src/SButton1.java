
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class SButton1 extends JButton{
    StudentVO student;
    
    public SButton1() {
    }
    
    public SButton1(StudentVO value)    {
        super(value.toString());
        this.student = value;
    }
    
    public void setStudent(StudentVO obj)   {
        this.student = obj;
    }
    
    public StudentVO getStudent()   {
        return student;
    }
    
    public void setText()   {
        super.setText(student.toString());
    }
}
