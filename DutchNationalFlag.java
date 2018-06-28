import java.io.*;
import java.util.*;
import java.math.*;
class DutchNationalFlag{
	public static void main(String[] args)	throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t!=0){
			int n=Integer.parseInt(br.readLine());
			int a[]=new int[n];
			String l[]=br.readLine().split(" ");
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(l[i]);
			}
			int low=0;
			int mid=0;
			int high=n-1;
			while(mid<=high){
				if(a[mid]==0){
					int temp=a[low];
					a[low]=a[mid];
					a[mid]=temp;
					low++;mid++;
				}
				if(a[mid]==1)mid++;
				if(a[mid]==2){
					int temp=a[high];
					a[high]=a[mid];
					a[mid]=temp;
					high--;
				}
			}
			for(int i=0;i<n;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
			t--;
		}
	}
}