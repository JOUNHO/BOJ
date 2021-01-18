import java.util.Scanner;

public class _6588 {
	public static boolean isprime(int c) {
		int count=0;
		for(int i=1;i<=Math.sqrt(c);i++) {
			if(c%i==0) {
				count++;
			}
			if(count==2) {
				break;
			}
		}
		if(count==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int exit=sc.nextInt();
		int prime=0;
		while(exit!=0) {
			int n=exit;
			int a[]=new int[n];

			for(int i=2;i<=n/2;i++) {
				if(isprime(i)&&isprime(n-i)) {
					prime=1;
					System.out.println(n+" = "+i+" + "+(n-i));
					break;
			}
			}
			if(prime==0) {
				System.out.println("Goldbach's conjecture is wrong.");
			}
			prime=0;
			exit=sc.nextInt();
	}

 }
}
