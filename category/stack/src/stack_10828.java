import java.util.Scanner;

public class stack_10828 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i=sc.nextInt(); //¸í·É ¼ö
		int top=-1;
		int[] stack=new int[i];
		for(int j=0;j<i;j++) {
			String s=sc.next();
			
			switch (s) {
			case "push":
				top++;
				stack[top]=sc.nextInt();
				break;
			
			case "pop":
				if(top==-1) {
					System.out.println("-1");
				}
				else {
					System.out.println(stack[top]);
					top--;
				};
				break;
			case "size":
				System.out.println(top+1);
				break;
			
			case "empty":
				if(top==-1) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
				break;
			case "top":
				if(top==-1) {
					System.out.println("-1");
				}
				else {
				System.out.println(stack[top]);
				}
				break;
			}
			}
		}
		
	}

