import java.io.*;
import java.util.*;
import java.math.*;
class SubArrayGivenSum{
	public static void main(String[] args)	throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t!=0){
			String k[]=br.readLine().split(" ");
			int n=Integer.parseInt(k[0]);
			int actual_sum=Integer.parseInt(k[1]);
			int a[]=new int[n];
			String l[]=br.readLine().split(" ");
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(l[i]);
			}
			boolean move=true;
			for(int i=0;i<n;i++){
				int sum=0;
				for(int j=i;j<n;j++){
					sum+=a[j];
					if(sum==actual_sum){
						System.out.println((i+1)+" "+(j+1));
						move=false;
						break;
					}
					if(move==false)break;
				}
				if(move==false)break;
			}
			if(move==true){
				System.out.println("-1");
			}
			t--;
		}
	}
}