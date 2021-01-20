import java.math.BigInteger;
import java.util.Scanner;

public class _1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger result=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			result=result.multiply(BigInteger.valueOf(i));
		}
		String s=result.toString();
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!='0') {
				System.out.println(s.length()-1-i);
				break;
			}
		}
	}

}
