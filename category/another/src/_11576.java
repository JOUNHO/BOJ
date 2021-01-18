import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		int m;
		a=sc.nextInt();
		b=sc.nextInt();
		m=sc.nextInt();
		int num[]=new int[m];
		
		for(int i=0;i<m;i++) {
			num[i]=sc.nextInt();
		}
		int d=0;
		for(int i=0;i<m;i++) {
			d=d+num[i]*(int)Math.pow(a, m-i-1);
		}
		List<Integer> result=new ArrayList<Integer>();
		while(d!=0) {
			result.add(d%b);
			d=d/b;
		}
		for(int i=result.size()-1;i>=0;i--) {
			System.out.print(result.get(i)+" ");
		}
	}

}
