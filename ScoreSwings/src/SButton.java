
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class SButton extends JButton{
    StudentSwings2 student;
    
    public SButton()    {
        
    }
    
    public SButton(String text)    {
        super(text);
    }
    
    public SButton(StudentSwings2 student)   {
        super(student.toString());
        this.student = student;
    }
    
    public StudentSwings2 getstudent()   {
        return student;
    }
    
    public void setStudent(StudentSwings2 obj)    {
        this.student = obj;
    }
    
    public void setText()   {
        super.setText(student.toString());
    }
}
