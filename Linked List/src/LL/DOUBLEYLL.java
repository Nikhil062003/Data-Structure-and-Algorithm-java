package LL;

import java.util.*;

class Node{
	Node Node;
	int data;
	Node next;
	Node prev;
	Node(int x){
		data=x;
		
	}
	
 }
 
 





public class DOUBLEYLL {
	 
	 public static void print(Node head) {
		 if(head==null) {return;}
		 Node cur=head;
		 while(cur!=null) {
			 System.out.println(cur.data);
			 cur=cur.next;
		 }
		 
	 }
	 public static Node reverseList(Node head) {
	        Node cur=head;
	        Node prev=null;
	        Node curr=null;
	        while(cur!=null){
	            curr=cur.next;
	            cur.next=prev;
	            prev=cur;
	            cur=curr;
	        }
	        cur=prev;
	        return cur;
	        
	    }public static boolean isPalindrome(Node head) {
	        ArrayList<Integer>A=new ArrayList<>();
	        Node cur=head;
	        while(cur!=null){
	            A.add(cur.data);
	            cur=cur.next;
	        }
	        head=reverseList(head);
	        ArrayList<Integer>B=new ArrayList<>();
	        Node curr=head;
	        while(curr!=null){
	            A.add(curr.data);
	            curr=curr.next;
	        }
	        System.out.println(A+" "+B);
	        if(A.size()!=B.size()){return false;}
	        for(int i=0;i<A.size();i++){
	            if(A.get(i)!=B.get(i)){
	                return false;
	            }
	        }
	        return true;
	    }
	 public static Node removeNthFromEnd(Node head, int n) {
		    if(head==null){return null;}
		    if(head.next==null&&n==1) {
		    	System.out.println("gsn");
		    	return null ;
		    }
		   // System.out.println("j");
		   
		    int l=0;
		    Node cur=head;
		    while(cur!=null){
		        l++;
		        cur=cur.next;
		    }
		    System.out.println("l"+l);
		    if(l==2&&n==2) {
		    	//System.out.println("en");
		    	head=head.next;
		    	System.out.println("jjj"+head.data);
		    	return head;
		    }
		    if(l==n) {
		    	
		    }
		    
		    if(n>l){return head;}
		    int c=(l-n)-1;
		    //System.out.println(c);
		   Node curr=head;
		    while(c>=0){
		        curr=curr.next;
		        c--;
		    }
		    //System.out.println(curr.data);
		    
		    curr.next=curr.next.next;
		    return head;
		}
	 public static Node deleteMiddle(Node head) {
	        if(head==null){return null;}
	        Node cur=head;
	        Node cur1=head;
	        Node pre=null;
	        while(cur!=null&&cur1!=null&&cur1.next!=null){
	        	pre=cur;
	             cur=cur.next;
	             cur1=cur1.next.next;
	             //System.out.println(cur.data+" "+cur1.data);
	        }
	        pre.next=cur.next;
	        
	        //System.out.println(pre.data);
	       
			return head;
	        

	    }
	 public static Node reverseBetween(Node head, int left, int right) {
         if(left==right){return head;}
        Node cur=head;
        ArrayList<Integer>A=new ArrayList<>();
        ArrayList<Integer>B=new ArrayList<>();
        
        while(cur!=null){
            A.add(cur.data);
            B.add(cur.data);
            cur=cur.next;
        }
        int k=left-1;
        int f=right-1;
        
        for(int i=right-1;i>left;i--){
         A.set(i,B.get(k));
          k++;
          f--;
        }
        int q=k;
        System.out.println(A);
        
       A.set(f-1,B.get((q+1)));
       System.out.println(A);
               Node g=head;
        int l=0;
        while(g!=null){
            g.data=A.get(l);
            l++;
            g=g.next;
        }
        print(head);
        return head;
        
	 }
	 public static Node deleteDuplicates(Node head) {
	        HashMap<Integer,Integer>H=new HashMap<>();
	        ArrayList<Integer>A=new ArrayList<>();
	       Node cur=head;
	        while(cur!=null){
	            A.add(cur.data);
	            cur=cur.next;
	        }
	        for(int i=0;i<A.size();i++){
	            if(H.containsKey(A.get(i))){
	                int y=H.get(A.get(i));
	                H.put(A.get(i),y+1);
	            }
	            else{
	                H.put(A.get(i),1);
	            }
	        }
	        boolean flag=false;
	        for(int i=0;i<A.size();i++){
	          if(H.get(A.get(i))>1){
	        	  flag=true;
	          A.remove(A.get(i));
	          }
	        }
	        System.out.println(A);
	        if(!flag) {
	        	return head;
	        }
	        Node a=head;
	        int l=A.size();
	        int i=0;
	        while(l-->0) {
	        	a.data=A.get(i);
	        	a=a.next;
	        	
	        	System.out.println("A+"+A.get(i));
	        	i++;
	        }
	        System.out.println(a.data);
	        a.next=null;
	        
	        return a;
	        

	    }
	 public static Node removeElements(Node head, int val) {
	        if(head==null){return null;}
	        if(head.data==val&&head.next==null){return null;}
	        ArrayList<Integer>A=new ArrayList<>();
	       Node h=head;
	        while(h!=null){
	            if(h.data!=val){
	            A.add(h.data);}
	            h=h.next;

	        }
	        if(A.size()==0){return null;}
	        Node p=head;
	        System.out.println(A);
	        int i=0;
	        int s=A.size()-1;
	        while(s-->=0){
	        	System.out.println(i+"=");
	            p.data=A.get(i);
                 p =p.next;
	            i++;
	            
	        }
	       	p.next=null;
	       
	        return head;
	    }
	 
	
	 public static int tel(int arr[],int j){
	        int a=1;
	      for(int i=0;i<arr.length;i++){
	           if(i!=j){
	          a=a*arr[i];}
	      }
	      return a;
	    }
	 public static int[] productExceptSelf(int[] nums) {
	        int arr[]=new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	            arr[i]=tel(nums,i);
	        }
	        return arr;
	    }
	    public static int maxProfit(int[] prices) {
	        int p=0;
	        int min=prices[0];
	        for(int i=0;i<prices.length;i++){
	        if(min>prices[i]){
	            min=prices[i];
	        }
	        
	        }
	        System.out.println(min);
	        int ind=-1;
	        for(int i=0;i<prices.length;i++){
	        if(min==prices[i]){
	            ind=i;
	            break;
	        } }

	        if(ind==prices.length-1){return 0;}

	        int max=-1;
	        for(int i=ind;i<prices.length;i++){
	        {
	            if(max<prices.length){
	                max=prices[i];
	            }
	        }
	        
	        
	       }
	       return max-min;
	    }
	   
	 
	    public static boolean isPalindrome(String s) {
	        String st="";
	        
	        for(int i=0;i<s.length();i++){
	            char l=s.charAt(i);
	            if(Character.isLetter(l)){
	            st=st+(l+"");
	            }
	        }
	        if(st==s){return true;}
	        
	        
	        return false;
	    }
	    
	public static void main(String[] args) {
		Node head =new Node(1);
		head.next=new Node(2);
       head.next.next=new Node(2);
      head.next.next.next=new Node(1);
//	    head.next.next.next.next=new Node(5);
//	    head.next.next.next.next.next=new Node(6);
//		//removeNthFromEnd(head,3);
	   //reverseBetween(head,1,2);
		//removeElements(head,6);
   //deleteDuplicates(head);
		//print(head);
      
      System.out.println(isPalindrome());
	    
//	    
//		int arr[]=mergeKLists(nums);
//		for(int i=0;i<arr.length;i++) {
			System.out.print(isPalindrome(head));
//		}
		
		
		
	}

}
