/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoreoop4;

/**
 *
 * @author sshj1
 */
import java.util.Scanner;                                                  // JAVA�� "util"�޼����� "Scanner"�޼��带 ȣ���Ͽ� ����� �� �ֵ��� ��
import java.io.File;                                                       // JAVA�� "io"�޼����� "File"�޼��带 ȣ���Ͽ� ����� �� �ֵ��� ��

public class ScoreOop4 {                                                   // ScoreOop4��� Ŭ������ ������

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                               // public : ���������� --> ���ٱ����� ������ ����
                                                                           // static : �ڹٰ� ������ �ϴ� ���� ������
                                                                           // void : ��ȯ���� ��� �Լ��� �����
                                                                           // main : java�� main�޼��带 �ǹ���(���� ���� ����Ǵ� �޼���)
                                                                           // String[] args : main�޼����� �Ű������� String�ڷ������� args��� ������ ����� �����̴�(?)
                                                                           
        try {                                                              // ����ó���� ���� try / catch(Exception e) ������ ���� ������ ��ġ     
            Scanner scn = new Scanner(new File("C:\\HyeonJun\\7777.dat")); // ������ ���� �Է�
            int count = scn.nextInt();                                     // ���� �Է� �� ������ ����
            Students4[] objli = new Students4[count];                      // Students4�� �ڷ���(?)���� �ϴ� 1���� �迭�� count�� ����ŭ ����
            
            for (int i = 0; i < count; i++) {                              // ������ �迭�� �� ��ü�� �����ϰ� �׿� �ش��ϴ� �޸� �ּҸ� �Է� �� ����
                String inf = "";                                           // --> �߰��� �Է� ���ڰ� 5���� ������ ��� ���� �� �ٽ� �ݺ�����
                try {
                    inf = scn.nextLine();
                    if (inf.length() < 5)   {
                        i--;
                        continue;
                    }
                } catch (Exception e) {
                    count = i;
                    break;
                }
                objli[i] = new Students4(inf);
            }
            
            for (int j = 0; j < count; j++) {                              // RANK �ʱ�ȭ�� ������ �� �հ迡 ���� RANK ������
                objli[j].setRank(0);
                for (int k = 0; k < count; k++) {
                    objli[j].getRank(objli[k]);
                }
            }
            
            for (int l = 0; l < count; l++) {                              // ������ ��ũ�� ���� ������������ �� ��ü ���
                for (int m = 0; m < count; m++) {
                    if(objli[m].rank4 == l+1)    {
                        System.out.println(objli[m]);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
