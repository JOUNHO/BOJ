import java.util.*;

class human implements Comparable<human>{
	int age;
	String name;
	human(int age,String name){
		this.age=age;
		this.name=name;
	}
	@Override
	public int compareTo(human human) {
		// TODO Auto-generated method stub
		if(this.age>human.age) {
			return 1;
		}
		else if(this.age==human.age) {
			return 0;
		}
		return -1;
	}

}

public class _10814 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int age;
		String name;
		List<human> hlist =new ArrayList<>();
		for(int i=0;i<n;i++) {
			age=sc.nextInt();
			name=sc.next();
			human human=new human(age,name);
			hlist.add(human);
		}
		Collections.sort(hlist);
		for(int i=0;i<n;i++) {
			System.out.println(hlist.get(i).age+" "+hlist.get(i).name);
		}
		

	}


}
