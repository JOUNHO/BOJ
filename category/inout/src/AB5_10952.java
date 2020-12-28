import java.util.Scanner;

public class AB5_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextInt()) {		
			int A=sc.nextInt();
			int B=sc.nextInt();
			if(A==0&&B==0) {
				break;
			}
			else
			System.out.println(A+B);
			
		}
	}

}
