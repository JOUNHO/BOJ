import java.util.Scanner;

public class _1924 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int x = in.nextInt();
		int y = in.nextInt();
		int sum = 0;
		for(int i=0; i<x-1; i++) {
			sum+=month[i];
		}
		System.out.println(day[(sum+y)%7]);
		
	}

}
