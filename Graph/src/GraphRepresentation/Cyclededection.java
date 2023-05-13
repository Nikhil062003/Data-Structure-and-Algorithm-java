  package GraphRepresentation;

import java.util.Scanner;

public class Cyclededection {
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
	
	
	public static void say(int v,int arr[]) {
		if(v>=arr.length) {System.out.println("Yes Cyclic");}
		else {System.out.println("NON Cyclic");}
	}
	public static void Upper(int arr1[][],int arr[],int v) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(i==j) {if(arr1[i][j]!=0) {System.out.println("Cyclic");return;}}
				
				if(j>i) {
					
					 if(arr1[i][j]==1) {
						 if(arr1[i][j]!=0) {System.out.println("Cyclic ");return;}
						 v++;}}
				
				
			}
		}
		say(v,arr);
	}
	
	public static void B(int e,int w,int n,int weight,int arr1[][]) {
		arr1[e][w]=arr1[w][e]=1;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[][]=new int[n][n];
		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++) {arr[i]=sc.nextInt();}

		A(n,arr1,arr);
		int v=0;
		Upper(arr1,arr,v);
		
	}

}
