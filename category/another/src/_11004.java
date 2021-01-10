import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class _11004 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		line = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(line[i]));
		}
		
		Collections.sort(list);
		System.out.println(list.get(K - 1));
	}

}
