
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class StudentInfo implements Serializable {
    String name;
    int kor;
    int eng;
    int math;
    int rank;
    double avg;
    
    public StudentInfo()    {
        
    }
    
    public StudentInfo(String values)   {
        String[] lis = values.split("\\s+");
        name = lis[0];
        kor = Integer.parseInt(lis[1]);
        eng = Integer.parseInt(lis[2]);
        math = Integer.parseInt(lis[3]);
        setAvg();
    }
    
    public StudentInfo(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        setAvg();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public double getAvg() {
        return avg;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(double avg) {
        if (this.avg < avg) {
            rank++;
        }
    }

    public void setAvg() {
        int savg = (kor + eng + math) / 3;
        savg *= 100;
        savg /= 100.;
        avg = savg;
    }

    @Override
    public String toString() {
        return "이름 :   " + name + "  평균 :   " + avg + "  석차 :   " + rank;
    }
}
