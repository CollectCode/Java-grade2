/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreoop6;

/**
 *
 * @author sshj1
 */
public class Students6 {
    String[] li6;
    String name6;
    int[] scores6;
    int rank6;
    
    public Students6()  {
    }
    
    public Students6(String inp)    {
        li6 = inp.split("\\s+");
        name6 = li6[0];
        scores6 = new int[li6.length - 1];
        
        for (int i = 0; i < scores6.length; i++)    {
            scores6[i] = Integer.parseInt(li6[i+1]);
        }
    }
    
    public int getSum6()    {
        int sum = 0;
        for (int j = 0; j < scores6.length; j++)    {
            sum += scores6[j];
        }
        return sum;
    }
    
    public double getAvg6()  {
        return (double)getSum6() / scores6.length;
    }
    
    public void setRank6(int ranking)    {
        this.rank6 = ranking; 
    }
    
    public int getRank6(Students6 rank) {
        if(this.rank6 <= rank.rank6)    {
            rank6++;
        }
        return rank6;
    }
    
    @Override
    public String toString()    {
        String result = name6 + " ";
        for (int k = 0; k < scores6.length; k++)    {
            result += scores6[k] + " ";
        }
        result += getSum6() + " " + getAvg6() + " " + rank6;
        
        return result;
    }
}
