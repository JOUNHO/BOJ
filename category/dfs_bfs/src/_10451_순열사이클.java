import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _10451_순열사이클 {
	static boolean visit[];
	static List<Integer> graph[];
	static int result=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int T=0;
		while(T++<t) {
			int n=sc.nextInt();
			visit=new boolean[n+1];
			graph=new ArrayList[n+1];
			for(int i=1;i<n+1;i++) {
				graph[i]=new ArrayList<Integer>();
			}
			for(int i=1;i<n+1;i++) {
				int a=sc.nextInt();
				if(i==a) {
					continue;
				}
				else {
					graph[i].add(a);
					graph[a].add(i);
				}
			}
			for(int i=1;i<n+1;i++) {
				if(visit[i]==false) {
					dfs(i);
					result++;
				}
				else {
					continue;
				}
			}
			System.out.println(result);
			result=0;
		}
		
	}

	static void dfs(int x) {
		visit[x]=true;
		if(graph[x].size()==0) {
			return ;
		}
		for(int a:graph[x]) {
			if(visit[a]==false) {
				dfs(a);
			}
		}
		
	}
}
