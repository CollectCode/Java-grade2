
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class StudentVO3 implements Serializable{
    String name;
    int kor;
    int eng;
    int math;
    int rank;
    double avg;
    
    public StudentVO3() {
        
    }
    
    public StudentVO3(String value) {
        String[] li = value.split("\\s+");
        name = li[0];
        kor = Integer.parseInt(li[1]);
        eng = Integer.parseInt(li[2]);
        math = Integer.parseInt(li[3]);
        setAvg(getAvg());
    }
    
    public StudentVO3(String name, double avg, int rank)    {
        this.name = name;
        this.avg = avg;
        this.rank = rank;
    }
    
    public StudentVO3(String name, int kor, int eng, int math)  {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        setAvg(getAvg());
    }
    
    public String getName()    {
        return name;
    }
    
    public void setName(String name)   {
        this.name = name;
    }
    
    public int getKor() {
        return kor;
    }
    
    public void setKor(int kor)    {
        this.kor = kor;
    }
    
    public int getEng() {
        return eng;
    }
    
    public void setEng(int eng)    {
        this.eng = eng;
    }
    
    public int getMath() {
        return math;
    }
    
    public void setMath(int math)    {
        this.math = math;
    }
    
    public void setAvg(double savg) {
        this.avg = savg;
    }
    
    public double getAvg()    {
        double avg1 = (kor + eng + math) / 3;
        avg1 *= 100;
        avg = avg1 / 100.;
        return avg;
    }
    
    public int getRank()    {
        return rank;
    }
    
    public void setRank(double average) {
        if (this.avg < average)    {
            rank++;
        }
    }
    
    @Override
    public String toString()    {
        return "이름 :  " +  name + "   평균 :  " + avg + "   석차 :  " + rank;
    }
}
