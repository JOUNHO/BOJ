import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class _1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s=br.readLine();
		int n=Integer.parseInt(br.readLine());

		List<Character> editor=new ArrayList<Character>();
		
		
		for(int i=0;i<s.length();i++) {
			editor.add(s.charAt(i));
		}
		ListIterator<Character>itr=editor.listIterator();
		while(itr.hasNext()) {
			itr.next();
		}
		String command;
		for(int i=0;i<n;i++) {
			
			command=br.readLine();
			char com=command.charAt(0);
			if(com=='L') {
				if(itr.hasPrevious()) {
					itr.previous();
				}

				
			}
			else if(com=='D') {
				if(itr.hasNext()) {
					itr.next();
				}
				
			}
			else if(com=='B') {
				if(itr.hasPrevious()) {
					itr.previous();
					itr.remove();;
				};
				
				
			}
			else if(com=='P') {
				char text=command.charAt(2);
				itr.add(text);
			}
		}
		for(char str : editor) {
			bw.write(str);
		}
		bw.flush();
		bw.close();
	}

}
