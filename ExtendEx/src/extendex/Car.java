/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extendex;

/**
 *
 * @author sshj1
 */
public class Car {
    public String no;

    public Car() {
        
    }
    
    public Car(String no) {
        System.out.println("Car::car(" + no + ") call constructor");
        this.no = no;
    }
    
    public int load()   {
        System.out.println("Car::load() : ");
        return 1;
    }
    
    public int unload() {
        System.out.println("Car::unLoad() : ");
        return -1;
    }
    
    public void gas()   {
        System.out.println("Car::gas()");
    }
    
    public void go()   {
        System.out.println("Car::go()");
    }

    @Override
    public String toString() {
        return "Car{" + "no=" + no + '}';
    }
}
