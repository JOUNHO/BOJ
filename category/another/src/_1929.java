import java.util.Scanner;

public class _1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int count=0;
		for(int i=m;i<n+1;i++) {
			for(int k=1;k<=Math.sqrt(i);k++) {
				if(i%k==0) {
					count++;
				}
				if(count==2) {
					break;
				}
			}
			if(count==1 && i!=1) {
				System.out.println(i);
			}
			count=0;
		}
	}

}
