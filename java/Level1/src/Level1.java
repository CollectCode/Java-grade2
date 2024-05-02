import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		System.out.println("이름 국어 영어 수학 순서로 자료를 주세요.");
		
		Scanner scn = new Scanner(System.in);
		
		String name = scn.next();
		int korean = scn.nextInt();
		int english = scn.nextInt();
		int math = scn.nextInt();
		
		int result = korean + english + math;
		float average = result / 3;
		
		System.out.println(name + "\t" + korean + "\t" + english + "\t" + math + "\t" + result + "\t"+ average);
	}
}
