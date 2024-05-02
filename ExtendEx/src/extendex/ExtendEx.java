/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extendex;

/**
 *
 * @author sshj1
 */
import java.util.Scanner;

public class ExtendEx {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("어떤 차를 구입하시겠습니까?");
        int type = scn.nextInt();
        Car maincar = new Car();
        
        if (type == 1)  {
            maincar = new Sedan();
        } else if (type == 2)   {
            maincar = new Bus();
        } else if (type == 3)   {
            maincar = new Truck();
        } else if (type == 4)   {
            maincar = new Suv();
        }
        
        maincar.gas();
        maincar.go();
    }
}
