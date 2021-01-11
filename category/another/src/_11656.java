import java.util.Arrays;
import java.util.Scanner;

public class _11656 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String suff[]=new String[s.length()];
		for(int i=0;i<s.length();i++) {
			suff[i]=s.substring(i);
		}
		Arrays.sort(suff);
		for(int i=0;i<s.length();i++) {
			System.out.println(suff[i]);
		}
		
	}

}
