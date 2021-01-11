import java.util.Arrays;
import java.util.Scanner;

public class _10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int result[]=new int[26];
		char c = 0;
		Arrays.fill(result, -1);
		for(int i=0;i<s.length();i++) {
			int in=(int)s.charAt(i)-97;
			result[in]=1;;
		}
		for(int i=0;i<26;i++) {
			if(result[i]!=0) {
				c=(char)(i+97);
				result[i]=s.indexOf(c);
			}
			
			System.out.print(result[i]+" ");
			
		}
	}

}
