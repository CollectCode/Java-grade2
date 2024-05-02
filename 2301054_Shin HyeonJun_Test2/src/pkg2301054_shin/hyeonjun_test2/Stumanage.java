/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2301054_shin.hyeonjun_test2;

/**
 *
 * @author sshj1
 */
import java.util.Scanner;
import java.io.File;

public class Stumanage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(new File("C:\\HyeonJun\\2301054_Shin HyeonJun_Test2\\7777.dat"));
            int subj = scn.nextInt();
            Stuinfo[] lis = new Stuinfo[subj];
            
            for (int i = 0; i < lis.length; i++)    {
                String set = scn.nextLine();
                if (set.length() < 5)   {
                    i--;
                    continue;
                }
                lis[i] = new Stuinfo(set);
            }
            
            for (int j = 0; j < lis.length; j++)  {
                lis[j].setRanking(0);
                for (int k = 0; k < lis.length; k++)    {
                    lis[j].getRanking(lis[k]);
                }
            }  
            
            for (int l = 0; l < lis.length; l++)    {
                for (int m = 0; m < lis.length; m++)    {
                    if(lis[m].ranking == l+1)   {
                        System.out.println(lis[m]);
                    }
                }
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
