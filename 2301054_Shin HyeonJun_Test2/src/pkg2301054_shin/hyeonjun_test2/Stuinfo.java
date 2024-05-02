/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2301054_shin.hyeonjun_test2;

/**
 *
 * @author sshj1
 */
public class Stuinfo {
    String[] stuli;
    String names;
    int sco[];
    int ranking;
    
    public Stuinfo()    {
    }
    
    public Stuinfo(String inf)  {
        stuli = inf.split("\\s+");
        names = stuli[0];
        sco = new int[stuli.length - 1];
        for (int i = 0; i < sco.length; i++)    {
            sco[i] = Integer.parseInt(stuli[i+1]);
        }
    }
    
    public int getSummary() {
        int sum = 0;
        for (int j = 0; j < sco.length; j++)    {
            sum += sco[j];
        }
        return sum;
    }
    
    public double getAverage()  {
        return (double)getSummary() / sco.length;
    }
    
    public int getRanking(Stuinfo rank) {
        if(this.getSummary() <= rank.getSummary())    {
            ranking++;
        }
        return ranking;
    }
    
    public void setRanking(int reset)   {
        this.ranking = reset;
    }
    
    public String toString()    {
        String result = names + " ";
        for (int k = 0; k < sco.length; k++)    {
            result += sco[k] + " ";
        }
        result += getSummary() + " " + getAverage() + " " + ranking;
        
        return result;
    }
}
