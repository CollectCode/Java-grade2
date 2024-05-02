/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreoop;

/**
 *
 * @author sshj1
 */
public class StuObj {
    String[] li;
    String name;
    int[] scores;
    int rank;

    public StuObj() {
    }
    
    public StuObj(String a)    {
        li = a.split("\\s+");
        scores = new int[li.length - 1];
        name = li[0];
        for (int i = 0; i < li.length-1; i++) {
            scores[i] = Integer.parseInt(li[i+1]);
        }
    }
    
    public int getSum() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
    
    public double getAvg() {
        return (double)getSum() / scores.length;
    }
    
    public void setRank(int rank)    {
        this.rank = rank;
    }

    public int RefreshRank(StuObj subject)    {
        if(this.getSum() <= subject.getSum())   {
            rank++;
        }
        return rank;
    }
    
    @Override
    public String toString() {
        String value = "";
        
        value = name + " ";
        for (int i = 0; i < scores.length; i++) {
            value += scores[i] + " ";
        }
        value += getSum() + " " + getAvg() + " " + rank;
        
        return value;
    }
}
