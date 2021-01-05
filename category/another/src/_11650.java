import java.util.Arrays;
import java.util.Scanner;

public class _11650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[][]=new int[n][2];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i][0]>a[j][0]) {
					int temp_x=a[i][0];
					int temp_y=a[i][1];
					a[i][0]=a[j][0];
					a[j][0]=temp_x;
					a[i][1]=a[j][1];
					a[j][1]=temp_y;
				}
				else if(a[i][0]==a[j][0]&&a[i][1]>a[j][1]) {
					int temp_y=a[i][1];
					a[i][1]=a[j][1];
					a[j][1]=temp_y;
				}
			}
				
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i][0]+" "+a[i][1]);
		}
	}

}
