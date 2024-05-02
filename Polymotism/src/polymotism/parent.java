/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymotism;

/**
 *
 * @author sshj1
 */
public class parent {
    String name;
    
    public parent() {
        this("");
    }
    
    public parent (String name)    {
        this.name = name;
        work();
    }
    
    public void work()  {
        System.out.println("parent :: work()");
        show();
    }
    
    public void show() {
        System.out.println("parent :: show()");
        work();
}
}


