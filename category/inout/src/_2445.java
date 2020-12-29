import java.util.Scanner;

public class _2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=1;i<N+1;i++) {
			System.out.print("*".repeat(i)+" ".repeat(N-i));
			System.out.println(" ".repeat(N-i)+"*".repeat(i));
		}
		for(int i=N-1;i>0;i--) {
			System.out.print("*".repeat(i)+" ".repeat(N-i));
			System.out.println(" ".repeat(N-i)+"*".repeat(i));
		}
	}
}
