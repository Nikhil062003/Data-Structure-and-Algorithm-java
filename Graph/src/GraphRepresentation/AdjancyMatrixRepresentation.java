package GraphRepresentation;

import java.util.Scanner;

public class AdjancyMatrixRepresentation {

	
	//if n nodes than (n-1)edges are therre if than than cycles
	//n nodes than nC2 eges that is n*(n-1)/2
	
	
	public static void A(int n,int arr1[][],int arr[]) {
		Scanner sc=new Scanner(System.in);
				int t=sc.nextInt();
	   while(t-->0) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int weight=sc.nextInt();
		int e=-1;
		int w=-1;
		for(int i=0;i<arr.length;i++) {if(a==arr[i]) {e=i;}
		if(arr[i]==b) {w=i;}}
		if(w==-1||e==-1) {System.out.println("Element not found in array1");}
		else{B(e,w,n,weight,arr1);}
		
	   }}
	
	public static void B(int e,int w,int n,int weight,int arr1[][]) {
		arr1[e][w]=arr1[w][e]=weight;
			
		
			
		}
	public static void Degree(int arr1[][],int c) {
		int g=0;
		int h=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[c][h]==1) {g++;}
				
				
				h++;
			}
			
		
		System.out.println("Degree of "+c +" is "+g);
	}
	

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[][]=new int[n][n];
		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++) {arr[i]=sc.nextInt();}

		A(n,arr1,arr);
		int k=0;
		for(int i=0;i<arr1.length;i++) {
			System.out.print(k+"  ");
			k++;
			for(int j=0;j<arr1.length;j++) {
				
				System.out.print(arr1[i][j]+" ");
				
			}
			
			
			System.out.println();}
		

		int c=sc.nextInt();
	    while(c-->0) {
		int x=sc.nextInt();
		Degree(arr1,x);
	}
	
	}

}
