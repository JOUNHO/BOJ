import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class _2751 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			a.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(a);
		
		for(Integer i:a) {
			System.out.println(i);
		}		
	}

}
