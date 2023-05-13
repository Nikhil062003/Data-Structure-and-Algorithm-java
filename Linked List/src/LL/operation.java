package LL;

import java.util.ArrayList;
import java.util.Collections;

class node{
	node next;
	int data;
	node(int x){
		data=x;
		
	}
}

public class operation {

	 public static node removeNthFromEnd1(node head, int n) {
	        if(head==null){return null;}
	        
	        int l=0;
	        node cur=head;
	        while(cur!=null){
	            l++;
	            cur=cur.next;
	        }
	     if(n>l){return head;}
	     
	        int c=(l-n)-2;
	       node curr=head;
	        while(c>0){
	            curr=curr.next;
	            c--;
	        }
	        
	        return head;
	 }
	 
	 
	 
	 
	 
	public static node Print(node head) {
		if(head==null) {return null;}
		node cur=head;
		while(cur!=null) {
			System.out.println(cur.data);
			cur=cur.next;
		}
		
		return head;
		
	}
	public static node Insert(node head,int x) {
		if(head==null) {return new node(x);}
		node cur=head;
		while(cur.next!=null) {
			cur=cur.next;
			
		}
		node temp=new node(x);
		cur.next=temp;
		return head;
		
	}
	public static node Insertioninnposition(node head,int x) {
		if(head==null) {return null;}
		node cur=head;
		node temp=new node(85);
	    int c=0;
	    //it is not working for 1st position
		if(x==0) {
		temp.next=head;
		return temp;
      
		}
		 int l=0;
        node cut=head;
        while(cut.next!=null){
            
            l++;cut=cut.next;
            
        }
        if(l<x){return head;}
		
		else{
			while(c!=x-1) {
			c++;
			cur=cur.next;
		}
		node f=cur.next;
		cur.next=temp;
		temp.next=f;
	
	    return head;
	}
		
		
	}
	
	
	public static node delete(node head,int x) {
		if(head==null) {return null;}
		node cur=head;
		//also not working for 1st
		if(head.data==x) {
			head=head.next;
		    return head;
		}
	
	while(cur.next.data!=x) {
			cur=cur.next;}
		 
		cur.next=cur.next.next;
		return head;
	}
	
public static node printIthNode(node head, int i,int pos){
        
	  if(head==null){return null;}
   node temp=new  node (i);
 
     if(pos==0){temp.next=head;
               return temp;}
     int l=0;
     node cut=head;
     while(cut.next.data!=-1){
         cut=cut.next;
         l++;
         
     }
     if(l<pos){
    	 return head;
     }
     
     
     
    else{
      node cur=head;
         int j=0;
    
        
     while(j!=pos-1){
         
         cur=cur.next;
     j++;}
        
   node m=cur.next;
     cur.next=temp;
     temp.next=m;
    return head;
    
    }	}

public static void appendLastNToFirst(node head, int n) {
	if(head==null) {return ;}
	node cur=head;
    int length=0;
    while(cur.next!=null) {cur=cur.next;length++;}
    int l=length-n;
    node curr=head;
    while(l-->0)
    {
    curr=curr.next;	
    }
    node temp=curr.next;
    
    cur.next=head;
    head=curr.next;
    curr.next=null;
    //System.out.println(head.data);
    node g=head;
    
    while(g!=null) {System.out.println(g.data);g=g.next;}
  // System.out.println(head.data);
  
 	
	
}

public static void removeDuplicates(node head) {
	if(head==null) {return ;}
	node cur=head;
	node t1=cur;
	node t2=cur.next;
	//System.out.println(t1.data);
	while(t1.next!=null||t2.next!=null)
	{
		if(t1.data==t2.data&&t2.next!=null) {
			
			t2=t2.next;}
		else {
		
			
			
			t1=t2;
		
		}
		
		
	}
	while(t1.next!=null) {System.out.println(t1.data);t1=t1.next;}
	
   }





public static void printReverse(node head) {
  if(head==null) {return ;}
  printReverse(head.next);
  System.out.println(head.data+" ");
  
}


//1 2 3 
static int findMiddle(node head) 
{
  if(head==null){return -1;}
  int count=0;
  node cur=head;
  while(cur!=null){
    cur=cur.next;
    count++;
}
 count=count/2;
   

node curr=head;
int h=0;
while(h!=count) {

	//System.out.println(h);
	h++;
	curr=curr.next;
	
}

return curr.data;

}

static int findNLast(node head, int n)
{
  if(head==null){return -1;}
  
  int count=0;
  node cur=head;
  node prev=head;
  while(cur!=null){
	prev=cur;
    cur=cur.next;
    count++;
   
}
  if(count<n){return prev.data;}
  int h=count-n;
  int l=0;
  node hi=head;
  System.out.println(h);
  while(l!=h){
    hi=hi.next;
    l++;
  }
  return hi.data;

}

static int findMiddleFast(node head) 
{
	node cur=head;
	node curr=head;
while(curr.next!=null&&curr!=null) {
	cur=cur.next;
	curr=curr.next.next;
}
return cur.data;

}

//staring point as well
static int LoopinLL(node head)
{
	node fast=head;
	node slow=head;
	while(fast!=null&&fast.next!=null) {
		fast=fast.next.next;
		slow=slow.next;
		if(slow==fast) {break;}
		
	}
	//System.out.println(slow.data);
	if(fast.next==null||fast==null) {return -1;}
	slow=head;
	int count=0;
	while(slow!=fast) {
		slow=slow.next;
		fast=fast.next;
		
		if(slow==fast) {
				
			return slow.data;
		}
	}
	
	return 0;
	
	
}
  
static int LoopinLL1(node head)
{
	node fast=head;
	node slow=head;
	while(fast!=null&&fast.next!=null) {
		fast=fast.next.next;
		slow=slow.next;
		if(slow==fast) {break;}
		
	}
	//System.out.println(slow.data);
	
	int c=0;
	if(fast.next==null||fast==null) {return -1;}
	System.out.println(slow.data);
//	while(slow.next!=head) {
//		//System.out.println(slow.data);
//		c++;slow=slow.next;
//	}
//	
	
	
	return c;
	
	
}
//Circular LL
//if loop is there or not if yes than ,they should cross each other at head
  static boolean  isCircularLINKEDLIST(node head) {
	node fast=head;
	node slow=head;
	while(fast!=null&&fast.next!=null) {
		fast=fast.next.next;
		slow=slow.next;
		if(slow==fast) {break;}
		
	}
	int count=0;
   if(fast==null||fast.next==null)	
   {return false;}
   if(slow==head)
   {return true;}
   return false;

}



public static node delete(node head)
{
	if(head==null) {return null ;}
	
	head=head.next;
	
	return head;
}

public static node deleteI(node head, int t)
{
	node cur=head;
	if(head.data==t) {return delete(head);}
	while(cur.next.data!=t) {
		cur=cur.next;
	}

	cur.next=cur.next.next;
	
	return head;
	
	
}


public static node I(node head, int p)
{
	node temp=new node(13);
if(head==null) {return temp;}
int count=1;
node cur=head;
while(count!=p-1) {
	cur=cur.next;
	count++;
}
node h=cur.next;
cur.next=temp;
temp.next=h;
return head;
	
	
	
}



int findWinner(int arr[], int N) {
	  // Write Your Code 
	  int h=N/2;
	  int count=0;
	  for(int i=0;i<arr.length;i++){
	    if(h==arr[i]){count++;}
	  }
	  if(count>h){
	    return h;
	  }
	  return -1;
	 
	  
	  
	}




public node mergeTwoLists(node list1, node list2) {
    ArrayList<Integer>A=new ArrayList<>();
   node cur=list1;
   node cur1=list2;
   node p=list1;

    while(cur!=null){
        A.add(cur.data);
        cur=cur.next;
    }
    while(cur1!=null){
        A.add(cur1.data);
        cur1=cur1.next;
    }
    Collections.sort(A);
    System.out.println();
    while(p.next!=null){
        p=p.next;
    }
    p.next=list2;
    node curr=list1;
    int j=0;
    while(curr!=null){
        curr.data=A.get(j);
        j++;
        curr=curr.next;
    }
   return list1;
}


public static void swap(int a,int b)
{
 int temp=a;
 a=b;
 b=temp;

}

 public static node swapPairs(node head) {
    node cur=head;
     if(head==null){return null;}
     if(head.next==null){return head;}
     while(cur!=null){
         swap(cur.data,cur.next.data);
         cur=cur.next.next;
     }
     return head;
     
 }


	public static void main(String[] args) {
		node head=new node(5);
		head.next=new node(4);//5 4 9 3 10 2
		head.next.next=new node(9);
		head.next.next.next=new node(3);
		head.next.next.next.next=new node(10);
		head.next.next.next.next.next=new node(2);
		//removeNthFromEnd1(head,2);
		head=swapPairs(head);
		//head.next.next.next.next.next.next=head.next.next;
//		Insert(head,12);
		//5 4 9 ﻿3 10 2 19 29 8 15
//		Insert(head,13);
//		Insert(head,14);
//		Insert(head,15); 
//		
//		Insert(head,16);

	//head=I(head,8);
	//head=REVERSE(head);
//		Insert(head,7);
//		Insert(head,7);
//		Insertioninnposition(head,80);
//		appendLastNToFirst(head,3);
//        delete(head,89);
//		printIthNode(head,1,5);
	//	removeDuplicates(head);
//		appendLastNToFirst(head,3);
		//printReverse(head);
		///shiftSmallLarge(head);
	Print(head);
	//	System.out.println(findMiddleFast(head));
	}

}
