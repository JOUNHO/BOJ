import java.util.Scanner;

public class _10824 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		String ab=s[0]+s[1];
		String cd=s[2]+s[3];	
		long result=Long.parseLong(ab)+Long.parseLong(cd);
		System.out.println(result);
	}
}