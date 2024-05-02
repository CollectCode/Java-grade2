import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("이름 국어 영어 수학 순서로 자료를 주세요.");
		int count = 0;
		
		while (true)	{
			count += 1;
			String name = scn.next();
			String grade = "";
			int korean = scn.nextInt();
			int english = scn.nextInt();
			int math = scn.nextInt();
			int result = korean + english + math;
			double average = (double) result / 3;
			
				if(average >= 90)	{
					grade = "A 학점";
				}
				else if (average >= 80)	{
					grade = "B 학점";
				} else {
					grade = "F 학점";
				}
			
			System.out.println(count + "번" + "\t" + name + "\t" +  korean + "\t" + english + "\t" + math + "\t" + result + "\t" + average + "\t" + grade);
			}
	}

}
