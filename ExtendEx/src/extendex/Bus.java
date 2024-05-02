/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extendex;

/**
 *
 * @author sshj1
 */
public class Bus extends Car  {
    int weight;
    
    public Bus() {
        super();
        weight = 0;
        System.out.println("Truck::Truck(number2) Call Constructor");
    }
    
   public int load()    {
       super.load();
       weight ++;
       System.out.println("load : " + weight);
       return weight;
   }
   
   public int unload()  {
       super.load();
       weight --;
       System.out.println("unload : " + weight);
       return weight;
   }

    @Override
    public String toString() {
        return "Truck{" + "no=" + no + ", weight=" + weight + '}';
    }

}
