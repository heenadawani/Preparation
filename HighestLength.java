import java.io.*;
import java.util.*;
class Solution{
	static void makeZero(int a[][],int i,int j){
		for(int k=0;k<a[0].length;k++){
			a[i][k]=0;
		}
		for(int k=0;k<a.length;k++){
			a[k][j]=0;
		}
		for(int k=0;k<a.length;k++){
			for(int l=0;l<a[0].length;l++){
				System.out.print(a[k][l]);
			}
			System.out.println();
		}
	}
	static void findZero(int a[][]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]==0){
					makeZero(a,i,j);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[][]={
			{1,2,3,4,0},
			{5,4,3,2,1},
			{5,6,2,0,1}
		};
		findZero(a);
	}
}