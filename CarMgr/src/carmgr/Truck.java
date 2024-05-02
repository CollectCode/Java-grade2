/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carmgr;

/**
 *
 * @author sshj1
 */
public class Truck extends Car{
    
    public Truck()  {
    }
    
    public Truck(String _no) {
        super(_no);
        this.no = _no;
        System.out.println("Truck()::Contructor : " + no + ", " + cc);
    }
    
    public void gas()   {
        System.out.println("Truck::gas() : " + no + ", " + cc);
    }
    
    public void move()  {
        System.out.println("Truck::move() : " + no + ", " + cc);
    }
}
