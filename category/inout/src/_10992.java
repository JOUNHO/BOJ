import java.util.Scanner;

public class _10992 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int laststar=2*N-1;
		int count=1;
		for(int i=1;i<N+1;i++) {
			if(i==N) {
				System.out.println("*".repeat(laststar));
			}
			else if(i==1) {
				System.out.println(" ".repeat(N-i)+"* ".repeat(i));

			}
			else
				System.out.println(" ".repeat(N-i)+"*"+" ".repeat(2*(i-1)-1)+"* ");
				count++;
		}
	}
}


