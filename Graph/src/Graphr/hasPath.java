package Graphr;

import java.util.*;

public class hasPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			int fv=sc.nextInt();
			int fe=sc.nextInt();
			arr[fv][fe]=1;
			arr[fe][fv]=1;
		}
		int s=sc.nextInt();
		int ei=sc.nextInt();
		boolean v[]=new boolean[n];
			
		v[s]=true;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==1&&v[s]==false) {
					if(j==e) {
						
					}
				}
			}
		}
		
		
		
		
	}

}
