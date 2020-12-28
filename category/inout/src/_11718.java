import java.util.Scanner;

public class _11718 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(sc.hasNextLine()) {
			String s=sc.nextLine();
			char[] ss=s.toCharArray();
			if(s.isEmpty()||ss[0]==' ' || ss[s.length()-1]==' ' ) {
				break;
			}
			System.out.println(s);
		}
	}
}


