/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carmgr;

/**
 *
 * @author sshj1
 */
public class Car {
    String no = "UnRegisted";
    static int cc = 0;
    static  {
        System.out.println("Call Car static");
    }
    
    public Car()  {
    }
    
    public Car(String _no) {
        System.out.println("Car()::Contructor : " + no + ", " + cc);
        gas();
        this.no = _no + "----";
        cc++;
        System.out.println("Car()::Contructor : " + no + ", " + cc);
    }
    
    public void gas()   {
        System.out.println("Car::gas() : " + no + ", " + cc);
    }
    
    public void move()  {
        System.out.println("Car::move() : " + no + ", " + cc);
    }
}
