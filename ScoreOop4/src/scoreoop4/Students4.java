/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreoop4;

/**
 *
 * @author sshj1
 */
public class Students4 {                                                    // Ŭ���� �� Ŭ������ �ʿ��� ������� ����
    String[] stuli4;
    String name4;
    int[] scores4;
    int rank4;
    
    public Students4()  {                                                   // Defalut ������ ���� --> �ش� �����ڴ� �Ű������� �Է��� ������� ������
    }
    
    public Students4(String info)   {                                       // �Ű������� ���� ��� �����ϴ� ������ ����
        stuli4 = info.split("\\s+");                                        // �Է¹��� �Ű������� ����(" ")[1ĭ�̻�]�� �����ڷ� �Ͽ� �迭�� ����
        name4 = stuli4[0];                                                  // �Է��� ó���� �̸��� �ð����� �ν��Ͻ������� name����
        scores4 = new int[stuli4.length - 1];                               // �Է¹��� ���������� ������ŭ �迭ũ�⼳��
        for (int i = 0; i < scores4.length; i++)  {                         // �Է¹��� ������ ���� ���ڿ��̹Ƿ� ���������� ��ȯ�Ͽ� �����迭�� ����
            scores4[i] = Integer.parseInt(stuli4[i+1]);
        }
    }
    
    public int getSum4()    {                                               // Ŭ���� ������ �հ踦 ��ȯ�ϴ� ����޼��� ����
        int sum = 0;
        for (int j = 0; j < scores4.length; j++)    {
            sum += scores4[j];
        }
        return sum;
    }
    
    public double getAvg4() {                                               // Ŭ���� ������ ����� ��ȯ�ϴ� ����޼��� ����
        return (double)getSum4() / scores4.length;
    }
    
    public int getRank(Students4 value)    {                                // �Ű����� value�� ���� ��ũ�� ��ȯ�ϴ� ����޼��� ����
        if(this.getSum4() <= value.getSum4())   {
            rank4++;
        }
        return rank4;
    }
    
    public void setRank(int rankValue)  {                                   // �Ű����� rankValue�� ���� ��ũ�� set�ϴ� ����޼��� ����
        this.rank4 = rankValue;                                             // void ���� return�� ���� �ʾƵ� �޼��尡 �����(��ü�� set��忡�� ���ֻ��Ǵµ���)
    }
    
    @Override
    public String toString()    {                                           // JAVA ������ "String"Ŭ������ ����޼��� "toString"��
        String result = name4 + " ";                                        // Override�Ͽ� ��������� �������� 
        for (int k = 0; k < scores4.length; k++)    {
            result += scores4[k] + " ";
        }
        result += getSum4() + " " + getAvg4() + " " + rank4;
        
        return result;
    }
}
