import java.util.Scanner;

public class _1373 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder sb = new StringBuilder();
		int zero=(3-s.length()%3)==3? 0:(3-s.length()%3);
		int a[]=new int[s.length()+zero];
		for(int i=0;i<s.length();i++) {
			a[zero+i]=s.charAt(i)-'0';
		}
		int temp=0;
		int count=0;
		String result="";
		for(int i=a.length-1;i>0;i=i-3) {
			int j=i;
			while(count<3) {
				temp=temp+(int) (a[j]*Math.pow(2, count));
				j--;
				count++;
			}
			sb.append(temp);
			temp=0;
			count=0;
		}
		
		System.out.print(sb.reverse());

	}

}
