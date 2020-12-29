import java.util.Scanner;

public class _2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=N;i>0;i--) {
			int starnum= 2*i-1;
			int spacenum= (2*N-1)-starnum;
			System.out.println(" ".repeat(spacenum/2)+"*".repeat(starnum));
		}
		for(int i=2;i<N+1;i++) {
			int starnum= 2*i-1;
			int spacenum= (2*N-1)-starnum;
			System.out.println(" ".repeat(spacenum/2)+"*".repeat(starnum));
		}
	
	}

}
