import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;


public class _1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		LinkedList<String> editor=new LinkedList<String>();
		ListIterator<String>itr=editor.listIterator();
		
		String s[]=br.readLine().split("");
		for(int i=0;i<s.length;i++) {
			itr.add(s[i]);
		}
		String com[];
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			
			com=br.readLine().split(" ");
			if(com[0].equals("L")) {
				if(itr.hasPrevious()) {
					itr.previous();
				}

				
			}
			else if(com[0].equals("D")) {
				if(itr.hasNext()) {
					itr.next();
				}
				
			}
			else if(com[0].equals("B")) {
				if(itr.hasPrevious()) {
					itr.previous();
					itr.remove();
				};
				
				
			}
			else if(com[0].equals("P")) {
				itr.add(com[1]);
			}
		}
		for(String str : editor) {
			bw.write(str);
		}
		bw.flush();
		bw.close();
	}

}
