import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.OutputStreamWriter;
public class _1168 {

	public static void main(String[] args)   {
		long start = System.currentTimeMillis();

		// TODO Auto-generated method stub
		LinkedList<Integer> ys=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
		int result[]=new int[n];
		int count=0;
		for(int i=1;i<n+1;i++) {
			ys.add(i);
		}
		
		ListIterator<Integer> itr=ys.listIterator();
		System.out.print("<");

		while(ys.isEmpty()==false) {
			if(ys.size()==1) {
				System.out.print(ys.get(0));
				break;
			}
			for(int i=0;i<k;i++) {
				if(itr.hasNext()!=true) {
					itr=ys.listIterator();
				}
				
				if(i==k-1) {
					System.out.print(itr.next()+",");
				}
				else
			
					itr.next();

			}
			itr.remove();
		}
		System.out.print(">");
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );

	}

}

