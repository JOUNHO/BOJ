import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _10845 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q=new LinkedList<Integer>();
		int n=Integer.parseInt(br.readLine());
		int num=0;
		for(int i=0;i<n;i++) {
			String s[]=br.readLine().split(" ");
			if(s[0].equals("push")) {
				num=Integer.parseInt(s[1]);
				q.add(num);
			}
			else if(s[0].equals("pop")) {
				System.out.println(q.isEmpty()? -1:q.poll());
			}
			else if(s[0].equals("size")) {
				System.out.println(q.size());
			}
			else if(s[0].equals("empty")) {
				System.out.println(q.isEmpty()? 1:0);
			}
			else if(s[0].equals("front")) {
				System.out.println(q.isEmpty()? -1:q.peek());
			}
			else if(s[0].equals("back")) {
				System.out.println(q.isEmpty()? -1:num);
			}
		}
		
		
	}

}
