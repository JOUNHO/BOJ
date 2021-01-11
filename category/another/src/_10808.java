import java.util.Scanner;

public class _10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int result[]=new int[26];
		for(int i=0;i<s.length();i++) {
			int in=(int)s.charAt(i)-97;
			result[in]++;
		}
		for(int i=0;i<26;i++) {
			System.out.print(result[i]+" ");	
		}
		
	}

}
