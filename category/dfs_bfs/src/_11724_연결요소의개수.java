import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _11724_연결요소의개수 {
	static boolean visit[];
	static List<Integer> graph[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int result=0;
		visit=new boolean[n+1];
		graph=new ArrayList[n+1];
		for(int i=1;i<=n;i++) {
			graph[i]=new ArrayList<Integer>();
		}
		for(int i=1;i<=m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		for(int i=1;i<=n;i++) {
			if(visit[i]==false) {
				result++;
				dfs(i);
			}
		}
		System.out.println(result);
	}
	static void dfs(int x) {
		visit[x]=true;
		
		for(int a:graph[x]) {
			if(visit[a]==false) {
				dfs(a);
			}
		}
		
	}

}
