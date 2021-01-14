import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class _1850 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long a=sc.nextLong();
		long b=sc.nextLong();
		long r =1;
	         while(r>0){
	             r = a % b;
	             a = b;
	             b = r;
	          }


		for(long i=0;i<a;i++) {
			bw.append("1");
		}
		bw.flush();
		bw.close();
	}

}
