import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("이름 국어 영어 수학 순서로 자료를 주세요.");
		
		while(true)	{
		count += 1;
		Scanner scn = new Scanner(System.in);
		
		String name = scn.next();
		int korean = scn.nextInt();
		int english = scn.nextInt();
		int math = scn.nextInt();
		int result = korean + english + math;
		double average = (double) result / 3;
		
		System.out.println(count+ "번" + "\t" + name + "\t" + korean + "\t" + english + "\t" + math + "\t" + average);
		}
	}
}
