/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreoop2;

/**
 *
 * @author sshj1
 */
public class Students2 {
    String[] stuli;
    String name;
    int[] scores;
    int rank;
    
    public Students2()  {
    }
    
    public Students2(String inp)    {
        stuli = inp.split("\\s+");
        scores = new int[stuli.length - 1];
        name = stuli[0];
        
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(stuli[i+1]);
        }
    }
    
    public int getSum() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
    
    public double getAvg()  {
        return (double)getSum() / scores.length;
    }
    
    public void setRank(int rank)    {
        this.rank = rank;
    }
    
    public int getRank(Students2 Obj)    {
        if(this.getSum() <= Obj.getSum())   {
            rank++;
        }
        return rank;
    }

    @Override
    public String toString() {
        String value = name + " ";
        for (int i = 0; i < scores.length; i++) {
            value += scores[i] + " ";
        }
        value += getSum() + " " + getAvg() + " " + rank;
        return value;
    }
}
