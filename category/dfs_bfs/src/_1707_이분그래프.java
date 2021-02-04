import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//1.dfs
public class _1707_이분그래프 {
	static List<Integer> graph[];
	static int Bip[];
	static String result="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int i=0;
		while(i++<k) {
			result="";
			int v=sc.nextInt();
			int e=sc.nextInt();
			Bip=new int[v+1];
			graph=new ArrayList[v+1];
			for(int j=1;j<=v;j++) {
				graph[j]=new ArrayList<Integer>();
			}
			for(int p=1;p<=e;p++) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				graph[a].add(b);
				graph[b].add(a);
			}
			for(int q=1;q<=v;q++) {
				if(Bip[q]==0) {
					Bip[q]=1;
					boolean re=dfs(q);
					if(re==false) {
						break;
					}
				}
			}
			System.out.println(result);
		}
	}
	static boolean dfs(int x) {

		for(int a:graph[x]) {
			if(Bip[a]==0) {
				Bip[a]=Bip[x]*-1;
				dfs(a);
			}
			else if(Bip[a]==Bip[x]) {
				result="NO";
				return false;
			}
		}
		if(result.equals("NO")) {
			return false;
		}
		result="YES";
		return true;
		
	}

}


/*2.bfs
public class _1707_이분그래프 {
	static List<Integer> graph[];
	static int Bip[];
	static String result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int i=0;
		while(i++<k) {
			int v=sc.nextInt();
			int e=sc.nextInt();
			Bip=new int[v+1];
			graph=new ArrayList[v+1];
			for(int j=1;j<=v;j++) {
				graph[j]=new ArrayList<Integer>();
			}
			for(int p=1;p<=e;p++) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				graph[a].add(b);
				graph[b].add(a);
			}
			for(int q=1;q<=v;q++) {
				if(Bip[q]==0) {
					bfs(q);
				}
			}
			System.out.println(result);
		}
	}
	static void bfs(int x) {
		Queue<Integer> q=new LinkedList<Integer>();
		Bip[x]=1;
		q.offer(x);
		while(q.isEmpty()==false) {
			int value=q.poll();
			for(int a:graph[value]) {
				int color=Bip[value];
				if(Bip[a]==0) {
					q.offer(a);
					Bip[a]=color*-1;
				}
				else if(Bip[a]==color) {
					result="NO";
					return ;
				}
			}
		}
		result="YES";
		return ;
	}

}
*/
