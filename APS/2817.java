import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {

	static int count;
	static int k;
	static int n;
	static int[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test_case = Integer.parseInt(bf.readLine());
		for(int t=1; t<=test_case; t++) {
			
			String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str);
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr = new int[n];
			
			str = bf.readLine();
			st = new StringTokenizer(str);
			for(int i=0; i<n; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			
			count = 0;
			Combi(0, 0);
			
			bw.write("#" + t + " " + count + "\n");
			bw.flush();
		}
		bw.close();
	}
	
	static void Combi(int sum, int idx) {
		
		if(sum > k)
			return;
		if(sum == k) {
			count++;
			return;
		}
		if(idx == n)
			return;
		
		Combi(sum+arr[idx], idx+1);
		Combi(sum, idx+1);
	}
}