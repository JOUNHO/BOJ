import java.util.Scanner;

public class _1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a*b/GCD(a,b));
		}
		
	}
	
	public static int GCD(int a,int b) {
		int gcd=0;
		for(int i=1;i<a+1;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}

}
