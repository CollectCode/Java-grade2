/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoreoop3;
/**
 *
 * @author sshj1
 */
import java.util.Scanner;
import java.io.File;

public class ScoreOop3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(new File("C:\\HyeonJun\\7777.dat"));
            int count = scn.nextInt();
            Students3[] stuli = new Students3[count];
        
            for (int i = 0; i < count; i++) {
                String inpu = scn.nextLine();
                stuli[i] = new Students3(inpu);
            }

            for (int j = 0; j < count; j++) {
                stuli[j].setRank(0);
                for (int k = 0; k < count; k++) {
                   stuli[j].getRank(stuli[k]); 
                }
            }

            for (int l = 0; l < count; l++) {
                for (int m = 0; m < count; m++) {
                    if (stuli[m].rank == l+1)  {
                        System.out.println(stuli[m]);    
                    }   
                }
            }
            
        } catch (Exception e) {
        }
    }   
}
