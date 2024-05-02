/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoreoop5;

/**
 *
 * @author sshj1
 */
import java.util.Scanner;
import java.io.File;

public class ScoreOop5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(new File("C:\\HyeonJun\\7777.dat"));
            int num = scn.nextInt();
            Students5[] stuli5 = new Students5[num];
            
            for (int i = 0; i < stuli5.length; i++) {
               String set = "";
               try{
                    set = scn.nextLine();
                    if(set.length() < 5)    {
                        i--;
                        continue;
                    }
                }
                catch(Exception e)  {
                    num = i;
                    break;
                }
                stuli5[i] = new Students5(set);
            }
            
            for (int j = 0; j < num; j++)   {
                stuli5[j].setRank5(0);
                for (int k = 0; k < num; k++)   {
                    stuli5[j].getRank5(stuli5[k]);
                }
            }
            
            for (int l = 0; l < num; l++)   {
                for (int m = 0; m < num; m++)   {
                    if(stuli5[m].rank5 == l+1) {
                        System.out.println(stuli5[m]);
                    }
                }
            }
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
