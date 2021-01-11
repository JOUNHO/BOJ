import java.util.Arrays;
import java.util.Scanner;

public class _10820 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		int num[]=new int[4];
		try {
		for(int i=0;i<100;i++) {
			s=sc.nextLine();
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)>='a'&&s.charAt(j)<='z') {
					num[0]++;
				}
				else if(s.charAt(j)>='A'&&s.charAt(j)<='Z') {
					num[1]++;
				}
				else if(s.charAt(j)>='0'&&s.charAt(j)<='9') {
					num[2]++;
				}
				else if(s.charAt(j)==' ') {
					num[3]++;
				}
			}
			System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]);
			Arrays.fill(num, 0);
		}
	}
	catch (Exception e) {
		return;
	}
	}
}

