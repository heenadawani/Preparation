import java.io.*;
import java.util.*;
import java.math.*;
class Kadane{
	static void findMaxSum(int arr[]){
		int size=arr.length;
		int curMax,gMax;
    	curMax=arr[0];
    	gMax=arr[0];
    	for(int i=1;i<size;i++){
        	curMax=Math.max(arr[i],curMax+arr[i]);
        	gMax=Math.max(curMax,gMax);
    	}
    	System.out.println(gMax);
	}
	public static void main(String[] args)	 {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
			int a[]=new int[sc.nextInt()];
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			findMaxSum(a);
			t--;
		}
	}
}