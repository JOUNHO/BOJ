import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		List<Integer> result=new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=2;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
				if(count==2) {
					break;
				}
			}
			if(count==1) {
				result.add(a[i]);
			}
			count=0;
		}
		System.out.print(result.size());
	}

}
