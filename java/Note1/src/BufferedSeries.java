/* Buffered 시리즈를 사용하기 위해선 무조건 예외처리를 진행해야함 */

import java.io.BufferedReader; // == Scanner 
import java.io.BufferedWriter; // == print
import java.io.InputStreamReader; // == BufferedReader안에 있는 처리모듈..?
import java.io.OutputStreamWriter; // == BufferedWriter안에 있는 처리모듈..?
import java.io.IOException; // 예외처리 모듈..?

public class BufferedSeries  {
    public static void main(String args[]) throws IOException { // 예외처리??
    		
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // == (Scanner scn = new Scanner(System.in));
    	// String s = br.readLine();	// == (String s = scn.next());
    	int i = Integer.parseInt(br.readLine()); // == Default Setting으로 String 형태가 적용됨으로 Integer로 형변환을 진행해야한다.
    	int b = 0;
    	
    	System.out.println(i);
    	
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out)); // == System.out.println(""); 을 진행하기전 선언
    	wr.write(i + ""); // 출력문
    	wr.newLine(); // 줄바
    	wr.flush(); // 남아있는 데이터 모두 출력
    	wr.close(); // 스트림 닫음
    }
}