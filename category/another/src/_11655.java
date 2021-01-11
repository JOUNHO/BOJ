import java.util.Scanner;

public class _11655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char s[]=sc.nextLine().toCharArray();
		char a='a';
		for(int i=0;i<s.length;i++) {
			int num = s[i];
			if(num>='a'&&num<='z'||num>='A'&&num<='Z') {
				num=num+13;
				if(num>='z'+1&&num<='z'+13||num>='Z'+1&&num<='Z'+13) {
					s[i]=(char)(num-26);
				}
				else {
					s[i]=(char)(num);
				}
			}
			System.out.print(s[i]);
		}
		
	}

}
