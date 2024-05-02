/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymotism;

/**
 *
 * @author sshj1
 */
import newpackage.grandson;

public class Polymotism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        son first = new son("first son");
        first.work();
        
        grandson granson = new grandson("grandson");
        granson.work();
//        
//        daughter second = new daughter("second daughter");
//        // second.work();
//        
//        parent father = new parent("third parent");
//        // third.work();
        
        parent mother = new son("son");
        mother = new daughter("daugher");
    }
}

// 값에 따라 각 객체들을 부모클래스로 만들어서 출력하기
