import java.util.Scanner;

public class _9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int left=0;
		int right=0;
		String[] s=new String[t];
		for(int i=0;i<t;i++) {
			s[i]=sc.next();
		}
		for(int i=0;i<t;i++) {
			for(int j=0;j<s[i].length();j++) {
				if(s[i].charAt(j)=='(') {
					left++;
				}
				else if(s[i].charAt(j)==')') {
					right++;
				}
				if(right>left) {
					System.out.println("NO");
					break;
				}
			}
			if(left==right) {
				System.out.println("YES");
			}
			else if(left>right){
				System.out.println("NO");
			}
			left=0;
			right=0;
		}
	}

}
