import java.util.Scanner;
import java.util.Stack;

public class _10799 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> stack=new Stack<Character>();
		int result=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.push('(');
			}
			else {
				if(s.charAt(i-1)=='(') {
					stack.pop();
					result=result+stack.size();
				}
				else {
					result=result+1;
					stack.pop();
				}															
			}
		}
		System.out.println(result);
	}
	

}
