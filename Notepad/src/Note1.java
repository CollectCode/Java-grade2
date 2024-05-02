import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Note1 {

    public static void main(String args[]) throws IOException   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strli = br.readLine().split(" ");
        int[] numli = new int[strli.length];
        int min = 1001;
        
        for (int i = 0; i < numli.length; i++) {
            numli[i] = Integer.parseInt(strli[i]);
            if (numli[i] < min) {
                min = numli[i];
            }
        }
        
        int x = numli[2] - numli[0];
        int y = numli[3] - numli[1];
        
        if  (y < min)   {
            min = y;
        } 
        
        if (x < min) {
            min = x;
        }
        
        bw.write(min+"");
        bw.flush();
        bw.close();
    }
}