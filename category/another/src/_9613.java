import java.util.Scanner;

public class _9613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int t=sc.nextInt();
			int a[]=new int[t];
			int sum=0;
			for(int p=0;p<t;p++) {
				a[p]=sc.nextInt();
			}
			for(int j=0;j<t-1;j++) {
				for(int k=j+1;k<t;k++) {
					sum=sum+GCD(a[j],a[k]);
				}
			}
			System.out.println(sum);
		}
	}

	static int GCD(int a,int b) {
		int r=1;
		while(r>0) {
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
