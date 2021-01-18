import java.math.BigInteger;
import java.util.Scanner;

public class _1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		BigInteger n=new BigInteger(s,8);
		
		System.out.print(n.toString(2));
	}

}
