/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class StudentVO {
    String name;
    int kor;
    int eng;
    int math;
    double avg;
    int rank;

    public StudentVO()    {
    }
    
    public StudentVO(String value)  {
        String[] info = value.split("\\s+");
        name = info[0];
        kor = Integer.parseInt(info[1]);
        eng = Integer.parseInt(info[2]);
        math = Integer.parseInt(info[3]);
    }
    
    public StudentVO(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
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
        avg = (int)((kor + math + eng) / 3) * 100;
        avg /= 100.;
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(double ranks) {
        if(this.getAvg() < ranks)   {
            rank++;
        }
    }

    @Override
    public String toString() {
        return "이름 : " + name + " 평균 : " + avg + "\n 석차 : " + rank;
    }
    
    
}
