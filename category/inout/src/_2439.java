import java.util.Scanner;

public class _2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=1;i<N+1;i++) {
			System.out.printf("%"+N+"s" ,"*".repeat(i));
			System.out.println();
		}
	}
}
