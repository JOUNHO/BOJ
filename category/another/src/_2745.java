import java.util.Scanner;

public class _2745 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int b=sc.nextInt();
		long result=0;
		int num=0;
		int j=0;
		for(int i=n.length()-1;i>=0;i--) {
			if(n.charAt(i)>='0'&&n.charAt(i)<='9') {
				num=n.charAt(i)-'0';
			}
			else {
				num=n.charAt(i)-'A'+10;
			}
			result=result+num*(long)Math.pow(b, j++);
		}
		System.out.println(result);

	}

}
