package LL;
import java.util.*;


public class Operations {
	public static void A(int n,int arr1[][],int arr[]) {
		Scanner sc=new Scanner(System.in);
				int t=sc.nextInt();
	   while(t-->0) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int e=-1;
		int w=-1;
		for(int i=0;i<arr.length;i++) {if(a==arr[i]) {e=i;}
		if(arr[i]==b) {w=i;}}
		if(w==-1||e==-1) {System.out.println("Element not found in array1");}
		else{B(e,w,n,arr1);}
	   }}
	
	public static void B(int e,int w,int n,int arr1[][]) {
	
		Scanner sc=new Scanner(System.in);
		
		arr1[e][w]=arr1[w][e]=1;
			
		
			
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[][]=new int[n][n];
		int arr[]=new int[n];
        int sts[]=new int[n];
		for(int i=0;i<arr.length;i++) {arr[i]=sc.nextInt();}
        int f=-1;
        int r=-1;
        int del[]=new int[20];
        
		A(n,arr1,arr);
		int o=sc.nextInt();
		int y=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==o) {y=i;}
		
		
		if(y!=-1) {
			sts[y]++;
			f++;
			r++;
			del[f]=arr[y];
		     
			
		}}
		for(int i=0;i<arr1.length;i++) {
			if(arr[i]!=0) {
				sts[i]++;
				r++;
				del[r]=arr[i];
				
			}
			
		}
		f++;
        
		for(int i=f;i<r;i++)
		{
			System.out.print(del[i]+" ");
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;i++) {
				System.out.println(arr1[i][j]);
			}
		}
		
		
		
	 
	   
	   
	   
     
	}

}
