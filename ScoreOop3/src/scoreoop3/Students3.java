/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreoop3;

/**
 *
 * @author sshj1
 */
public class Students3 {
    String[] li;
    String name;
    int[] subj;
    int rank;
    
    public Students3(){
    }
    
    public Students3(String info)   {
        li = info.split("\\s+");
        subj = new int[li.length - 1];
        name = li[0];
        
        for (int i = 0; i < subj.length; i++)   {
            subj[i] = Integer.parseInt(li[i+1]);
        }
    }
    
    public int getSum() {
        int sum = 0;
        for (int j = 0; j < subj.length; j++)   {
            sum += subj[j];
        }
        return sum;
    }
    
    public double getAvg() {
        return (double)getSum() / subj.length;
    }
    
    public void setRank(int value)    {
        this.rank = value;
    }
    
    public int getRank(Students3 num)    {
        if(this.getSum() <= num.getSum())   {
            rank++;
        }
        return rank;
    }

    @Override
    public String toString()    {
        String result = name + " ";
        for (int k = 0; k < subj.length; k++)   {
            result += subj[k] + " ";
        }
        result += getSum() + " " + getAvg() + " " + rank;
        return result;
    }
}


