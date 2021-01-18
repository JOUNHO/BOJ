import java.util.Scanner;

public class _2089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String result="";
		if(n==0) {
			System.out.println(0);
			return ;
		}
		while(n!=0) {
			if(n%-2==-1) {
				result=((n%-2)+2)+result;
				n=(n/-2)+1;
				
			}
			else {
				result=(n%-2)+result;
				n=n/-2;
			}
		}
		System.out.println(result);
	}

}
