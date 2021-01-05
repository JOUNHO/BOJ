import java.util.Arrays;
import java.util.Scanner;

public class _2750 {
	public static int[] a;
	public static int[] result;
	
	public static void merge(int left,int mid,int right) {
		int i,j,k,l;
		i=left;
		j=mid+1;
		k=left;
		
		while(i<=mid && j<=right) {
			if(a[i]<=a[j]) {
				result[k++]=a[i++];
			}
			else {
				result[k++]=a[j++];
			}
		}
			//남아있는 값들을 일괄 복사
			
			if(i>mid) {
				for(l=j;l<right+1;l++) {
					result[k++]=a[l];
				}
			}
			else {
				for(l=i;l<mid+1;l++) {
					result[k++]=a[l];
				}
			}
			
			for(l=left;l<=right;l++) {
				a[l]=result[l];
			}
		
		
	}
	public static void partition(int left,int right) {
		int mid;
		result=new int[a.length];
		if(left<right) {
			mid=(left+right)/2;
			partition(left,mid);
			partition(mid+1,right);
			merge(left,mid,right);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
		}
		
		partition(0,n-1);
		for(int i=0; i<n; i++){
		    System.out.println(a[i]);
		  }
	}

}
