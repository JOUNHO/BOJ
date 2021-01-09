import java.util.Arrays;
import java.util.Scanner;

public class _11652 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long cnt=1;
		long max=0;
		long ans;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		ans=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]==a[i-1]) {
				cnt=cnt+1;
				
				if(max<cnt) {					
					max=cnt;
					ans=a[i];
					
				}
			}
			else {
				cnt=1;
			}
			
		}
		System.out.println(ans);
	}

}
