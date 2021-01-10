import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class stack_10828 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=Integer.parseInt(br.readLine()); //¸í·É ¼ö
		int top=-1;
		String[] stack=new String[i];
		for(int j=0;j<i;j++) {
			String[] s=br.readLine().split(" ");;
			
			switch (s[0]) {
			case "push":
				top++;
				stack[top]=s[1];
				break;
			
			case "pop":
				if(top==-1) {
					System.out.println("-1");
				}
				else {
					System.out.println(stack[top]);
					top--;
				};
				break;
			case "size":
				System.out.println(top+1);
				break;
			
			case "empty":
				if(top==-1) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
				break;
			case "top":
				if(top==-1) {
					System.out.println("-1");
				}
				else {
				System.out.println(stack[top]);
				}
				break;
			}
			}
		}
		
	}

