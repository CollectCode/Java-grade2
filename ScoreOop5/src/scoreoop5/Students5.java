/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreoop5;

/**
 *
 * @author sshj1
 */
public class Students5 {
    String[] li5;
    String name;
    int[] scores5;
    int rank5;
    
    public Students5()  {
    }
    
    public Students5(String inpu)   {
        li5 = inpu.split("\\s+");
        name = li5[0];
        scores5 = new int[li5.length - 1];
        for (int i = 0; i < scores5.length; i++)    {
            scores5[i] = Integer.parseInt(li5[i+1]);
        }
    }
    
    public int getSum5()    {
        int sum = 0;
        for (int j = 0; j < scores5.length; j++)    {
            sum += scores5[j];
        }
        return sum;
    }
    
    public double getAvg5() {
        return (double)getSum5() / scores5.length;
    }
    
    public int getRank5(Students5 ranking)   {
        if(this.getSum5() <= ranking.getSum5()) {
            rank5++;
        }
        return rank5;
    }
    
    public void setRank5(int setrank)   {
        this.rank5 = setrank;
    }
    
    public String toString()    {
        String result = name + " ";
        for (int k = 0; k < scores5.length; k++)    {
            result += scores5[k] + " ";
        }
        result += getSum5() + " " + getAvg5() + " " + rank5;
        return result;
    }
}
