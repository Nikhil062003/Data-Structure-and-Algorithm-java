package GraphRepresentation;

import java.util.*;

public class BFS {
	public static void addEdge(ArrayList<ArrayList<Integer>> A,int v,int u) {
		A.get(u).add(v);
		A.get(v).add(u);
	}
	public static void BFS(ArrayList<ArrayList<Integer>> A,int v,int s,boolean N[]) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		N[s]=true;
		q.add(s);
	
		while(q.isEmpty()==false) {
			int u=q.poll();
			System.out.print(u+" ");
			for(int i:A.get(u)) {
				if(N[i]==false) {N[i]=true;q.add(i);}
				
			}
		}
		
		
	}
	
public static void BFSDIR(ArrayList<ArrayList<Integer>> A,int v,int s)
{boolean N[]=new boolean[v+1];
	for(int i=0;i<v;i++) {
		if(N[i]==false) {BFS(A,v,s,N);}
	}

}
	

	public static void main(String[] args) {
		int v=8;
		ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++) {
			A.add(new ArrayList<Integer>());
		}                                                   
	  
		  addEdge(A,0,1);                                                                                                 
		   addEdge(A,0,2);
		   addEdge(A,1,2);
		   addEdge(A,1,3);
		   addEdge(A,3,4);
		   addEdge(A,2,4);
		   addEdge(A,2,3);
		   BFSDIR(A,v,0);
	  
	}

}
