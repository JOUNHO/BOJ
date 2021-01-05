import java.util.Scanner;

public class _2011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long a[]=new long[s.length()];
		long dp[]=new long[s.length()];
		for(int i=0;i<s.length();i++) {
			a[i]=Integer.parseInt(s.substring(i,i+1));
		}
		int count=0;
		if(a[0]==0) {
			dp[0]=0;
		}
		else {
		dp[0]=1;
		}
		for(int i=1;i<s.length();i++) {
			
				if(a[i-1]*10+a[i]<=26&&a[i-1]*10+a[i]>0) {
					count=1;
					for(int j=0;j<i-2;j=j+2) {
						if(a[j]*10+a[j+1]<=26&&a[j]*10+a[j+1]>0) {
							count++;
						}
					}

				}
				else {
					System.out.println(0);
					return ;
				}
				if(dp[i]==0) {
					count=count-1;
				}
			dp[i]=(dp[i-1]+count)%1000000;
			count=0;
		}
		System.out.println(dp[s.length()-1]);		
		
	}

}
