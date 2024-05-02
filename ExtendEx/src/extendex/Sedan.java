/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extendex;

/**
 *
 * @author sshj1
 */
public class Sedan extends Car {
    int count;

    public Sedan() {
        super();
        this.count = 0;
        System.out.println("Sedan::Sedan(number1) call Constructor");
    }
    
    public int load()   {
        return getIn();
    }
    
    public int unLoad()   {
        return getOut();
    }
    
    public int getIn()  {
        super.load();
        count++;
        System.out.println("Get in the car : " + count);
        return count;
    }
    
    public int getOut() {
        super.unload();
        count--;
        System.out.println("Get out the car : " + count);
        return count;
    }
   
    @Override
    public String toString() {
        return "Sedan{" + "no=" + no + ", count=" + count + '}';
    }
}
