
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class SButton2 extends JButton {
    StudentVO2 student2;
    
    public SButton2() {
    
    }
    
    public SButton2(StudentVO2 obj)  {
        super(obj.toString());
        this.student2 = obj;
    }
    
    public StudentVO2 getStudent()   {
        return student2;
    }
    
    public void setStudent(StudentVO2 obj2) {
        this.student2 = obj2;
    }
    
    public void setText()   {
        super.setText(student2.toString());
    }
}
