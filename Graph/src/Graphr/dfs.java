package Graphr;

import java.util.*;

public class dfs {
    public static void print(int arr[][],int sv,boolean visit[],ArrayList<Integer>A) {
    	A.add(sv);
    	visit[sv]=true;
    	for(int i=0;i<arr.length;i++) {
    		if(visit[i]==false&&arr[sv][i]==1) {
    			print(arr,i,visit,A);
    			
    		}
    	}
    }
    
    public static void printhelper(int arr[][],int sv,	ArrayList<Integer>A) {
    	boolean visit[]=new boolean[arr.length];
    System.out.println(sv);
    	for(int i=sv;i<arr.length;i++) {
    		if(!visit[i]) {
    		print(arr,i,visit,A);}
    	}
    }
      
	
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
			
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
		ArrayList<Integer>A=new ArrayList<>();
	 printhelper(arr,a,A);
		System.out.println(A);
		
	}

}
