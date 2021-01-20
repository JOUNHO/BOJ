import java.util.Scanner;

public class _10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=1;
		for(int i=1;i<=n;i++) {
			result=result*i;
		}
		System.out.println(result);
	}

}
