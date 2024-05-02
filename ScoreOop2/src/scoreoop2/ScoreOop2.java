/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoreoop2;

/**
 *
 * @author sshj1
 */
import java.util.Scanner;
import java.io.File;

public class ScoreOop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(new File("C:\\HyeonJun\\7777.dat")); 
            int count = 100;
            Students2[] li = new Students2[count];
            int i = 0;
            
            for (i = 0; i < count; i++) {
                String stu = "";
                try {
                   stu = scn.nextLine();
                } catch (Exception e) {
                    count = i;
                    break;
                }
                li[i] = new Students2(stu);
            }
            
            for (i = 0; i < count; i++) {
                li[i].setRank(0);
                for (int j = 0; j < count; j++) {
                    li[i].getRank(li[j]);
                }
            }
            
            for (i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if(li[j].rank == i+1)   {
                        System.out.println(li[j]);
                    }
                }
            }
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
