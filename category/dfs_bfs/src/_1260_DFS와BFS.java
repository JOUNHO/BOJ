import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class _1260_DFS¿ÍBFS {
	static boolean visit[];
	static List<Integer> graph[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int v=sc.nextInt();
		visit=new boolean[n+1];
		graph=new ArrayList[n+1];
		for(int i=0;i<=n;i++) {
			graph[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		for(int i=1;i<=n;i++) {
			Collections.sort(graph[i]);
		}
		
		dfs(v);
		for(int i=0;i<visit.length;i++) {
			visit[i]=false;
		}
		System.out.println();
		bfs(v);

	}
	
	static void dfs(int x) {
		visit[x]=true;
		System.out.print(x+" ");
		
		for(int a:graph[x]) {
			if(visit[a]==false) {
				dfs(a);
			}
		}
		
	}
	static void bfs(int x) {
		Queue<Integer> q=new LinkedList<>();
		q.offer(x);
		visit[x]=true;
		while(q.isEmpty()==false) {
			int value=q.poll();
			System.out.print(value+" ");
			for(int a:graph[value]) {
				if(visit[a]==false) {
					visit[a]=true;
					q.offer(a);

				}
			}
		}
	}
}
