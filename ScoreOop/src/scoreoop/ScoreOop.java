/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoreoop;

/**
 *
 * @author sshj1
 */
import java.util.Scanner;
import java.io.File;
public class ScoreOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(new File("C:\\HyeonJun\\7777.dat"));
            int count = 100;
            int i = 0;
            StuObj[] stuli = new StuObj[count];
            
            for (i = 0; i < count; i++) {
                String line = "";
                try {
                    line = scn.nextLine();
                } catch (Exception e) {
                    count = i;
                    break;
                }
                stuli[i] = new StuObj(line);
            }
            
            for (i = 0; i < count; i++) {
                stuli[i].getSum();
                stuli[i].getAvg();
            }
            
            for (i = 0; i < count; i++) {
                stuli[i].setRank(0);
                for (int j = 0; j < count; j++) {
                    stuli[i].RefreshRank(stuli[j]);
                }
            }
            
            for (i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if (stuli[j].rank == i+1)   {
                        System.out.println(stuli[j]);
                    }
                }
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
