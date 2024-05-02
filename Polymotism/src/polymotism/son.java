/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymotism;

/**
 *
 * @author sshj1
 */
public class son extends parent {
    String name;
    
    public son (String name)    {
        super();
        this.name = name;
    }
    
//    public void work()  {
//        System.out.println("son :: work()");
//        show();
//    }
    
    public void show() {
        System.out.println("son :: show()");
}
}


