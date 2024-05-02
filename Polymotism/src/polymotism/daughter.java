/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymotism;

/**
 *
 * @author sshj1
 */
public class daughter extends parent {
    String name;
    
    public daughter (String name)    {
        this.name = name;
    }
    
//    public void work()  {
//        System.out.println("daughter :: work()");
//        show();
//    }
    
    public void show() {
        System.out.println("daughter :: show()");
}
}


