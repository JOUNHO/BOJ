import java.util.Scanner;

public class _11720 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		String s=sc.next();
		for(int i=0;i<N;i++) {
			sum=sum+Integer.parseInt(s.substring(i,i+1));
		}
		System.out.println(sum);
	}
}
