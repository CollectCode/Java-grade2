import java.util.Scanner;

public class Notepad {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	        
	    int a = scn.nextInt();
	    int b = scn.nextInt();
	        
	    System.out.println(a * (b % 10));
	    System.out.println(a * (b % 100));
	    System.out.println(a * (b % 1000));
	    System.out.println(a * b);          

	}

}
