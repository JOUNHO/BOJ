import java.util.Scanner;

public class _2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int max=0,min=0;
		int c=a<b? a:b;
		for(int i=1;i<c+1;i++) {
			if(a%i==0&&b%i==0)
				max=i;
		}
		min=a*b/max;
		System.out.println(max);
		System.out.println(min);
	}

}
