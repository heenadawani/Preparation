import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
		char a[]={'a','b','b','c','d','e','f','g','h','i','a'};
		int b[]=new int[26];
		b[0]=0;
		for(char k : a){
			int l=(k-'a');
			b[l]++;
		}
		int k=b[0],j=0;
		for(int i=0;i<b.length;i++){
			if(k<b[i]){
				k=b[i];
				j=i;
			}
		}
		System.out.println((char)(j+'a'));
	}
}