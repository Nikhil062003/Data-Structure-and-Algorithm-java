package LL;

import java.util.ArrayList;
import java.util.HashMap;

class LL{
	LL next;
	int data;
	LL(int x){
		data=x;
	}
}



public class prac {
	   public static void swap(int a,int b)
	   {
	       int temp=a;
	       a=b;
	       b=temp;

	   }

	       public static LL swapPairs(LL head) {
	           LL cur=head;
	           if(head==null){return null;}
	           if(head.next==null){return head;}
	           while(cur!=null&&cur.next!=null){
	        	   //System.out.println(cur.data);
	               swap(cur.data,cur.next.data);
	                cur=cur.next.next;
	           }
	           return head;
	           
	       }
	       public static LL Print(LL head) {
	   		if(head==null) {return null;}
	   		LL cur=head;
	   		while(cur!=null) {
	   			System.out.print(cur.data+" ");
	   			cur=cur.next;
	   		}
	   		
	   		return head;
	   		
	   	}
	       
	       public static LL deleteDuplicates(LL head) {
	           LL cur=head;
	           while(cur!=null&&cur.next!=null){
	             if(cur.data==cur.next.data){
	            	 
	                 cur=cur.next.next;
	                 
	             }
	            else{
	             cur=cur.next;}
	            
	           }
	           return head;
	       }
	       public static LL removeZeroSumSublists(LL head) {
	           ArrayList<Integer>A=new ArrayList<>();
	           HashMap<Integer,Boolean>H=new HashMap<>();
	           LL cur=head;
	           while(cur!=null){
	               H.put(cur.data,false);
	               A.add(cur.data);
	               cur=cur.next;
	           }
	          
	            LL cur1=head;
	           while(cur1!=null){
	               int a=0-cur1.data;
	               if(H.containsKey(a)&&!H.get(a)){
	            	 
	            	    int del=A.remove(A.indexOf(a));
	                    H.put(a,true);
	               }
	               cur1=cur1.next;

	           } 
	         
	          LL cur3=head;
	          LL prev=null;
	         for(int i=0;i<A.size();i++) {
	        	 
	          cur3.data=A.get(i);
	          prev=cur3;
	          cur3=cur3.next;
	          
	         }
	        prev.next=null;
	          
	           return head;

	       }
	       public static LL removeNodes(LL head) {
	           ArrayList<Integer>A=new ArrayList<>();
	          LL cur=head;
	          while(cur!=null) {
	        	  A.add(cur.data);
	        	  cur=cur.next;
	          }
	          int max=A.get(A.size()-1);
	          for(int i=A.size()-2;i>=0;i--) {
	        	  if(max<=A.get(i)) {
	        		  max=A.get(i);
	        		  continue;
	        	  }
	        	  A.remove(i);
	          }
	          
	         LL cur1=head;
	         LL prev=null;
	         for(int i=0;i<A.size();i++) {
	        	 cur1.data=A.get(i);
	        	 prev=cur1;
	        	 cur1=cur1.next;
	         }
	         prev.next=null;
			return head;
	          
	           
	       }
	       public static LL removeElements(LL head, int val) {
	    	    HashMap<Integer,Integer>H=new HashMap<>();
	    	    LL cur=head;
	    	    ArrayList<Integer>A=new ArrayList<>();
	    	    while(cur!=null){
	    	        A.add(cur.data);
	    	        cur=cur.next;
	    	       
	    	    }
	    	    while(A.indexOf(val)!=-1) {
	    	    	A.remove(A.indexOf(val));
	    	    }
	    	    System.out.println(A);
	    	    
	    	    LL cur1=head;
	    	    LL prev=null;
	    	   for(int i=0;i<A.size();i++)
	    	   {
	    		   cur1.data=A.get(i);
	    		   prev=cur1;
	    		   cur1=cur1.next;
	    	   }
	    	   prev.next=null;
	    	   return head;
	    	    
	       }
	       
	       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL head=new LL(1);
		head.next=new LL(2);//5,2,13,3,8
		head.next.next=new LL(3);
		head.next.next.next=new LL(3);
		head.next.next.next.next=new LL(1);
		//head.next.next.next.next.next=new LL(2);
	 head= removeElements(head,1);
		Print(head);
		
		

	}

}
