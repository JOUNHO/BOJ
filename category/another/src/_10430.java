import java.util.Scanner;

public class _10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int A,B,C;
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		int r1,r2,r3,r4;
		r1=(A+B)%C;
		r2=((A%C)+(B%C))%C;
		r3=(A*B)%C;
		r4=((A%C)*(B%C))%C;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

}
