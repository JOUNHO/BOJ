import java.util.Scanner;

public class _11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=2;
		while(n!=1) {
			if(n%i==0) {
				n=n/i;
				System.out.println(i);
			}
			else {
				i++;
			}
		}
	}
}