import java.util.*;

class Point implements Comparable<Point> {
    int x, y;
    
    Point(int x,int y) {
    	this.x=x;
    	this.y=y;
    }
    @Override
    public int compareTo(Point p) {
        if(this.x > p.x) {
            return 1; // x에 대해서는 오름차순
        }
        else if(this.x == p.x) {
            if(this.y > p.y) { // y에 대해서도 오름차순
                return 1;
            }
        }
        return -1;
    }
    

}
public class _11650_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Point> pointList =new ArrayList<>();
		int x;
		int y;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			Point point=new Point(x,y);
			pointList.add(point);
		}
		Collections.sort(pointList);
		for(int i=0;i<n;i++) {
			System.out.println(pointList.get(i).x+" "+pointList.get(i).y);

		}
	}

}
