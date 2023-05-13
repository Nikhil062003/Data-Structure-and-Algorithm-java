package Graphr;

import java.util.*;

public class matriximplmtn {
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
			//arr[fe][fv]=1;
		}
      boolean visited[]= new boolean[arr.length];
	     int sv=0;
	    System.out.println(sv);
	     visited[sv]=true;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(arr[sv][j]==1&&visited[j]==false) {
				System.out.println(j);
				visited[j]=true;
			}
			
		}
			sv++;
		}
		
	}
	

}
//5
//5
//0
//1
//0
//2
//1
//3
//2
//4
//3
//4