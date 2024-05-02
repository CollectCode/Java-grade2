
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class StudentVO4 implements Serializable{
    String name;
    int kor;
    int eng;
    int math;
    int rank;
    double avg;
    
    public StudentVO4() {
        
    }
    
    public StudentVO4(String values)    {
        String[] li = values.split("\\s+");
        name = li[0];
        kor = Integer.parseInt(li[1]);
        eng = Integer.parseInt(li[2]);
        math = Integer.parseInt(li[3]);
        setAvg(getAvg());
    }
    
    public StudentVO4(String name, int kor, int eng, int math)  {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        setAvg(getAvg());
    }
    
    public void setName(String sname)    {
        this.name = sname;
    }
    
    public String getName() {
        return name;
    }
    
    public void setKor(int skor)    {
        this.kor = skor;
    }
    
    public int getKor() {
        return kor;
    }
    
    public void setEng(int seng)    {
        this.eng = seng;
    }
    
    public int getEng() {
        return eng;
    }
    
    public void setMath(int smath)  {
        this.math = smath;
    }
    
    public int getMath()    {
        return math;
    }
    
    public double getAvg()    {
        int sum = (int)(kor + eng + math) / 3;
        sum *= 100;
        avg = sum / 100.;
        return avg;
    }
    
    public void setAvg(double savg)  {
        this.avg = savg;
    }
    
    public void setRank(double oavg)   {
        if(this.getAvg() < oavg)   {
            rank++;
        }
    }
    
    public int getRank()    {
        return rank;
    }
    
    @Override
    public String toString()    {
        return "이름 :   " + name + "   평균 :   " + avg + "   석차 :   " + rank;
    }
}
