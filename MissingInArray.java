import java.util.*;
import java.math.*;
class MissingInArray{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t!=0){
		    int n=Integer.parseInt(br.readLine());
			String k[]=br.readLine().split(" ");
			int sum=0;
			for(int i=0;i<n-1;i++){
				sum+=Integer.parseInt(k[i]);
			}
			int actual_sum=0;
			for(int i=1;i<=n;i++){
			    actual_sum+=i;
			}
			System.out.println(actual_sum-sum);
			t--;
		}
	}
}