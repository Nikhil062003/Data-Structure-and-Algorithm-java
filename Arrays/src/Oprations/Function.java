package Oprations;

import java.util.Arrays;
import java.util.Scanner;

public class Function {
	public static void insertion(int arr[],int x) {
		   int[] temp=new int [arr.length+1];
		   for(int i=0;i<arr.length;i++) {temp[i]=arr[i];}
		   temp[temp.length-1]=x;
		  
		   for(int j=0;j<temp.length;j++) {System.out.print(temp[j]+" ");}
	   }
	   
	   
	   public static void del(int arr[],int x) {
		   int f=0;
		  int temp[]=new int [arr.length-1];
		   for(int i=0;i<arr.length;i++) {
			   if(arr[i]==x) {
				   f=i;
			   }
		   }
		   int j=0;
		   //if element is in first position
		   if(f==0) {
			   for(int i=1;i<arr.length;i++) {
				   temp[j]=arr[i];
				   j++;
			   }
		   }
		   //if element is in last position
		   else if(f==arr.length-1) {
			   for(int i=0;i<arr.length-1;i++) {
				   temp[j]=arr[i];
				   j++;
			   }
		   }
		   //if element is in different position other than first and last
		   else {
			   for(int i=0;i<=f-1;i++) {
				   temp[j]=arr[i];
				   j++;
			   }
			   for(int i=f+1;i<arr.length;i++) {
				   temp[j]=arr[i];
				   j++;
			   }
		   }
		   for(int l=0;l<temp.length;l++) {System.out.print(temp[l]+" ");}
	   }
	   public static int Largest(int arr[]) {
		   int l=arr[0];
		   for(int i=0;i<arr.length;i++) {
			   if(arr[i]>l) {l=arr[i];}
			   
		   }
		   return l;
	   }
	   public static void Freq(int arr[],int freq[]) {
		   
		    for(int i=0;i<arr.length;i++) {
		    	freq[arr[i]]++;
		    }
	//   for(int i=0;i<freq.length;i++) {System.out.print(freq[i]+" ");}
	   }
	public static void removeduplicate(int arr[],int freq[]) {
	  Freq(arr,freq);
	  
		   for(int i=0;i<freq.length;i++) {if(freq[i]!=0) {
			  System.out.print(i+" ");
			  
			 }}
	   }
		public static void movezerotoend(int arr[])
		{
			int temp[]=new int[arr.length];
			int j=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {temp[j]=arr[i];j++;}
			}
			for(int i=0;i<arr.length;i++) {
				arr[i]=0;
			}
			for(int i=0;i<arr.length;i++) {
				arr[i]=temp[i];
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	public static void nlargest(int arr[],int n) {
		Arrays.sort(arr);
		int temp[]=new int[arr.length+1];
	    int j=1;
	    for(int i=arr.length-1;i>0;i--) {
	    	temp[j]=arr[i];
	    	j++;
	    }
	   System.out.println(temp[n]);
	}

	 public static void rotate(int arr[],int k) {
			int temp[]=new int [arr.length];
//			k=2;
			int j=0;
			for(int i=k;i<arr.length;i++) {
			temp[j]=arr[i];
			j++;
			}
			for(int i=0;i<k;i++) {
				temp[j]=arr[i];
				j++;
				
			}
			for(int l=0;l<temp.length;l++) {System.out.print(temp[l]+" ");}
		 
		}
	   public static void FindMiddle(int arr[]) {
		   
	 }
	
	   
	   public static void linearsearch(int arr[],int c) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==c) {
				System.out.println("Yes, "+c+" is present in array at index "+i);
			}
			
		}
		
	}
	public static void pairwithsumK(int arr[],int k) {
		int l=0;
		Arrays.sort(arr);
		int r=arr.length-1;
		while(l<r) {
			if(arr[l]+arr[r]>k) {
				r--;
			}
			else if(arr[l]+arr[r]<k) {
				l++;
			}
			else {
				System.out.println("Pair "+arr[l]+" "+arr[r]);
				l++;//or r--;
				
			}
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		    int arr[]= {1,2,3,4,5,6,7,8,9,10};
		    int f=Largest(arr);
		    int freq[]=new int[f+1];
		//insertion(arr,x);
		//del(arr,45);
//			System.out.println(L(arr));
		//removeduplicate(arr,freq);
		//Freq(arr,freq);
		//movezerotoend(arr);
//		    nlargest(arr,3);
//		    rotate(arr,3);
//		    linearsearch(arr,62);
//		    pairwithsumK(arr,5);
	}

}
