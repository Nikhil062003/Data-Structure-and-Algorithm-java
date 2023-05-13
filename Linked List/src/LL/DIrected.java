package LL;
import java.util.*;

public class DIrected {
	public static void search(char arr[],int y,char f){
		int j=1;
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]==f) {
	    		y=y+i*j;
	    		j++;
	    	}
	    }
	    System.out.println(y);
	      }
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		      char arr[]={'0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','w','x','y','z'};
		      String str=sc.next();
		      char charArray[] = str.toCharArray();
                  Arrays.sort(charArray);
                  String h=new String(charArray);
                  int y=0;
                  for(int i=0;i<h.length();i++) {
                	  char f=h.charAt(i);
                	  search(arr,y,f);
                  }
              
		}
}
}

	

	

