import java.util.Scanner;

public class AB6_10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			String s=sc.next();
			String[] array=s.split(",");
			int A=Integer.parseInt(array[0]);
			int B=Integer.parseInt(array[1]);
			System.out.println(A+B);
		}
	}

}
