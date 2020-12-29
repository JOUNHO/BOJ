import java.util.Scanner;

public class _11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		for(int i=0;i<n;i++) {
			System.out.print(s.charAt(i));
			if(i%10==9) System.out.println();
		}
	}
}
