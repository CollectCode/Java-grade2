/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class StudentSwings2 {
    String name;
    int kor;
    int math;
    int eng;
    
    public StudentSwings2()   {
        
    }
    
    public StudentSwings2(String value)   {
        String[] values = value.split("\\s+");
        name = values[0];
        kor = Integer.parseInt(values[1]);
        math = Integer.parseInt(values[2]);
        eng = Integer.parseInt(values[3]);
        
    }
    
    public StudentSwings2(String name, int kor, int math, int eng)   {
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name)   {
        this.name = name;
    }
    
    public int getKor() {
        return kor;
    }
    
    public void setKor(int kscore) {
        this.kor = kscore;
    }
    
    public int getMath() {
        return math;
    }
    
    public void setMath(int mscore) {
        this.math = mscore;
    }
    
    public int getEng() {
        return kor;
    }
    
    public void setEng(int escore) {
        this.kor = escore;
    }
    
    @Override
    public String toString()    {
        return name + " " + kor + " " + math + " " + eng;
    }
}
