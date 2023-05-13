package OOPS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exception {
	static void ar(int arr[]) {
		arr[6]=7;
	}

	public static int power(int x, int n) {
		
        int c=1;
		for(int i=1;i<=n;i++){
         c=c*x;
        }
        return c;
	}
	public static int count(int n){
	
        int c=0;
    while(n!=0){
       
        n/=10;
        c++;
//        System.out.println(n);
    }
        return c;
    }
	
	
	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);
	    System.out.print(n+" ");
	}
	public static int firstIndex(int input[], int x) {
		
        int c=0;
        for(int i=0;i<input.length;i++){
            if(input[i]==x){c=i;}
            
            
        }
        return -1;
    
		
	}
	
	public static int lastIndex(int input[], int x) {
		int c=-1;
		for(int i=0;i<input.length;i++) {
			if(input[i]==x) {c=i;}
			
		}
		return c;
		
	
	
	}
	public static String removeX(String input){
		
	char []arr=new char[input.length()];
		for(int i=0;i<input.length();i++) {
			arr[i]=input.charAt(i);
		}
		String c="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='x') {
				arr[i]=0;
				
			}
			
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0) {
				System.out.print(arr[i]);
			}
		}
		return "";}
	     
		
		public static void intersection(int[] arr1, int[] arr2) {
	        
			   
			
			
			
	        
		}
		
		
	public static void  findUnique(int[] arr) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			int r=arr[i];
			for(int j=i;j<arr.length;j++) {
				if(r!=arr[j]) {
			
					
				}}}
       
			
			
	}
	

	
	
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
//		int arr[]=new int[5];
//		for(int i=0;i<arr.length;i++) {arr[i]=sc.nextInt();}

		int arr1[]= {1,9,7,9,7};
		int arr2[]= {1,9,3};
//		intersection(arr1,arr2);
//		System.out.println();
//		
//		System.out.println(power(3,4 ));
//		System.out.println(count(0));
//	  print(3);
//		System.out.println(lastIndex(arr,0));
//		String c="abacd";
//		intersection(arr1,arr2);	
//		findUnique(arr1);
//	System.out.println(v("abcdefghijkl","cde"));
		
		ArrayList<String> list = new ArrayList<String>() ;
		list.add( "Ant" );
		list.add( "Bat" );
		list.add( "Car" );
		list.add( "Door" );
		list.add( "Euro" );
		list.set(2, "null");
		
		System.out.println(list.size());
		
		
	}

}
