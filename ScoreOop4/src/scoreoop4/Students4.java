/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreoop4;

/**
 *
 * @author sshj1
 */
public class Students4 {                                                    // 클래스 및 클래스에 필요한 멤버변수 선언
    String[] stuli4;
    String name4;
    int[] scores4;
    int rank4;
    
    public Students4()  {                                                   // Defalut 생성자 생성 --> 해당 생성자는 매개변수에 입력이 없을경우 동작함
    }
    
    public Students4(String info)   {                                       // 매개변수가 있을 경우 동작하는 생성자 만듦
        stuli4 = info.split("\\s+");                                        // 입력받은 매개변수를 공백(" ")[1칸이상]을 구분자로 하여 배열에 저장
        name4 = stuli4[0];                                                  // 입력의 처음은 이름이 올것으로 인스턴스변수에 name저장
        scores4 = new int[stuli4.length - 1];                               // 입력받은 과목점수의 개수만큼 배열크기설정
        for (int i = 0; i < scores4.length; i++)  {                         // 입력받은 점수는 현재 문자열이므로 정수형으로 변환하여 점수배열에 저장
            scores4[i] = Integer.parseInt(stuli4[i+1]);
        }
    }
    
    public int getSum4()    {                                               // 클래스 내에서 합계를 반환하는 멤버메서드 선언
        int sum = 0;
        for (int j = 0; j < scores4.length; j++)    {
            sum += scores4[j];
        }
        return sum;
    }
    
    public double getAvg4() {                                               // 클래스 내에서 평균을 반환하는 멤버메서드 선언
        return (double)getSum4() / scores4.length;
    }
    
    public int getRank(Students4 value)    {                                // 매개변수 value에 따른 랭크를 반환하는 멤버메서드 선언
        if(this.getSum4() <= value.getSum4())   {
            rank4++;
        }
        return rank4;
    }
    
    public void setRank(int rankValue)  {                                   // 매개변수 rankValue에 따른 랭크를 set하는 멤버메서드 선언
        this.rank4 = rankValue;                                             // void 사용시 return을 하지 않아도 메서드가 종료됨(대체로 set모드에서 자주사용되는듯함)
    }
    
    @Override
    public String toString()    {                                           // JAVA 내부의 "String"클래스의 멤버메서드 "toString"을
        String result = name4 + " ";                                        // Override하여 출력형식을 재정의함 
        for (int k = 0; k < scores4.length; k++)    {
            result += scores4[k] + " ";
        }
        result += getSum4() + " " + getAvg4() + " " + rank4;
        
        return result;
    }
}
