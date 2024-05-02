/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoreoop4;

/**
 *
 * @author sshj1
 */
import java.util.Scanner;                                                  // JAVA의 "util"메서드의 "Scanner"메서드를 호출하여 사용할 수 있도록 함
import java.io.File;                                                       // JAVA의 "io"메서드의 "File"메서드를 호출하여 사용할 수 있도록 함

public class ScoreOop4 {                                                   // ScoreOop4라는 클래스를 정의함

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                               // public : 접근제어자 --> 접근권한의 범위를 설정
                                                                           // static : 자바가 컴파일 하는 순간 선언함
                                                                           // void : 반환값이 없어도 함수가 종료됨
                                                                           // main : java의 main메서드를 의미함(가장 먼저 실행되는 메서드)
                                                                           // String[] args : main메서드의 매개변수로 String자료형으로 args라는 변수가 선언된 상태이다(?)
                                                                           
        try {                                                              // 예외처리를 위한 try / catch(Exception e) 구문을 가장 상위에 배치     
            Scanner scn = new Scanner(new File("C:\\HyeonJun\\7777.dat")); // 파일을 통한 입력
            int count = scn.nextInt();                                     // 숫자 입력 후 변수로 저장
            Students4[] objli = new Students4[count];                      // Students4를 자료형(?)으로 하는 1차원 배열을 count의 값만큼 생성
            
            for (int i = 0; i < count; i++) {                              // 생성된 배열에 각 객체를 생성하고 그에 해당하는 메모리 주소를 입력 후 저장
                String inf = "";                                           // --> 추가로 입력 글자가 5글자 이하일 경우 생략 후 다시 반복진행
                try {
                    inf = scn.nextLine();
                    if (inf.length() < 5)   {
                        i--;
                        continue;
                    }
                } catch (Exception e) {
                    count = i;
                    break;
                }
                objli[i] = new Students4(inf);
            }
            
            for (int j = 0; j < count; j++) {                              // RANK 초기화를 진행한 후 합계에 따른 RANK 재지정
                objli[j].setRank(0);
                for (int k = 0; k < count; k++) {
                    objli[j].getRank(objli[k]);
                }
            }
            
            for (int l = 0; l < count; l++) {                              // 지정된 랭크에 따라 내림차순으로 각 객체 출력
                for (int m = 0; m < count; m++) {
                    if(objli[m].rank4 == l+1)    {
                        System.out.println(objli[m]);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
