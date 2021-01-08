import java.io.*;
import java.util.*;

public class _10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] cnt = new int[10001];
		
		for(int i=0; i<n; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=10000; i++) {
			while(cnt[i]>0) {
				sb.append(i+"\n");
				cnt[i]--;
			}
		}
		System.out.println(sb);
	}

}