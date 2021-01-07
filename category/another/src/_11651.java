import java.util.*;

class soint implements Comparable<soint>{
	int x;
	int y;
	
	soint(int x,int y){
		this.x=x;
		this.y=y;
	}

	@Override
	public int compareTo(soint point) {
		if(this.y>point.y) {
			return 1;
		}
		else if(this.y==point.y) {
			if(this.x>point.x) {
				return 1;
			}
		}
		// TODO Auto-generated method stub
		return -1;
	}
	
}


public class _11651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x,y;
		ArrayList<soint> plist=new ArrayList<>();
		for(int i=0;i<n;i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			soint point=new soint(x,y);
			plist.add(point);
		}
		Collections.sort(plist);
		
		for(int i=0;i<n;i++) {
			System.out.println(plist.get(i).x+" "+plist.get(i).y);
		}
	}

}
