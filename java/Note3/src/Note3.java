import java.util.Scanner;

public class Note3    {
    public static void main(String args[])    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        for (int i = 0; i < num; i++)    {
            for (int j = 0; j < num - (num-i-1); j++)    {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}