import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Integer> d=new ArrayDeque<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int num=0;
		for(int i=0;i<n;i++) {
			String[] s=br.readLine().split(" ");
			String com=s[0];
			if(com.equals("push_front")) {
				num=Integer.parseInt(s[1]);
				d.addFirst(num);
			}
			else if(com.equals("push_back")) {
				num=Integer.parseInt(s[1]);
				d.addLast(num);
			}
			else if(com.equals("pop_front")) {
				System.out.println(d.isEmpty()? -1:d.pollFirst());
			}			
			else if(com.equals("pop_back")) {
				System.out.println(d.isEmpty()? -1:d.pollLast());
			}	
			else if(com.equals("size")) {
				System.out.println(d.size());
			}	
			else if(com.equals("empty")) {
				System.out.println(d.isEmpty()? 1:0);
			}	
			else if(com.equals("front")) {
				System.out.println(d.isEmpty()? -1:d.peek());
			}	
			else if(com.equals("back")) {
				System.out.println(d.isEmpty()? -1:d.peekLast());
			}	
		}
	}

}
