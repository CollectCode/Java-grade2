import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Note2 {

	public static void main(String[] args)	throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = br.readLine();
		
		int Num = Integer.parseInt(a);
		int[] sum = new int [Num];
		int[][] Nums = new int [Num][2];
		
		for (int i = 0; i < Nums.length; i++)	{
			String b = br.readLine();
			StringTokenizer st = new StringTokenizer(b, " ");
			for (int j = 0; j < Nums[i].length; j++)	{
				while(st.hasMoreTokens())	{
					Nums[i][0] = Integer.parseInt(st.nextToken());
					Nums[i][1] = Integer.parseInt(st.nextToken());
				}
			sum[i] = Nums[i][0] + Nums[i][1];
			}
		}
		
		for (int k = 0; k < sum.length; k++)	{
			bw.write(sum[k] + "");
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}