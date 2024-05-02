import java.util.Scanner;

public class Level4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("몇 명을 처리할까요?");
		int man = scn.nextInt();
		System.out.println("이름 국어 영어 수학 순서로 자료를 주세요.");
		
		String [][] nam = new String [man][man];
		int [][] inf = new int [man][4];
		double [] ave = new double [man];
		
		int result = 0;
		
		for (int i = 0; i < man; i++)	{
			String name = scn.next();
			int korean = scn.nextInt();
			int english = scn.nextInt();
			int math = scn.nextInt();
			result = korean + english + math;
			
			inf[i][0] = korean;
			inf[i][1] = english;
			inf[i][2] = math;
			inf[i][3] = result;
			
			ave[i] = (double) result / 3;
			
			nam[0][i] = name;
			
			if(ave[i] >= 90) {
				nam[1][i] = "A";
			} else if(ave[i] >= 80)	{
				nam[1][i] = "B";
			} else	{
				nam[1][i] = "F";
			}
		}
		
		for (int j = 0; j < man; j++)	{
			System.out.print(j+1 + "번" + "\t" + nam[0][j] + "\t");
			for (int k = 0; k < inf[j].length; k++)	{
				System.out.print(inf[j][k] + "\t");
			}
			System.out.print(ave[j] + "\t" + nam[1][j] + "학점");
			System.out.println(" ");
		}
	}
}
