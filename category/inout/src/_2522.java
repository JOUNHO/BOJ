import java.util.Scanner;

public class _2522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=1;i<N+1;i++) {
			System.out.println(" ".repeat(N-i)+"*".repeat(i));
		}
		for(int i=1;i<N;i++) {
			System.out.println(" ".repeat(i)+"*".repeat(N-i));
		}
	}

}
