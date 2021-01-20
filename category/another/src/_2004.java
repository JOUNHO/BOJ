import java.util.Scanner;

public class _2004 {

	static long two(long a) {
		long cnt2=0;
		for(long i=2;i<=a;i=i*2) {
			cnt2+=a/i;
		}
		return cnt2;
	}
	static long five(long a) {
		long cnt5=0;
		for(long i=5;i<=a;i=i*5) {
			cnt5+=a/i;
		}
		return cnt5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long underfive=five(n-m)+five(m);
		long upfive=five(n);
		long undertwo=two(n-m)+two(m);
		long uptwo=two(n);		
		System.out.println((int)Math.min(upfive-underfive,uptwo-undertwo));
	}

}
