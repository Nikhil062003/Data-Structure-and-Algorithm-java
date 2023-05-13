package GraphRepresentation;

import java.util.ArrayList;

public class DFS {
	public static void addEdge(ArrayList<ArrayList<Integer>> A,int v,int u) {
		A.get(u).add(v);
		A.get(v).add(u);
	}
	public static void DFS(ArrayList<ArrayList<Integer>> A,int s,boolean C[]) {
		C[s]=true;
		System.out.print(s+" ");
		for(int i:A.get(s)) {
			if(C[i]==false) {DFS(A,i,C);}
		}
		
	}
	
	
	public static void DFSDIR(ArrayList<ArrayList<Integer>> A,int s,int v) {
		boolean C[]=new boolean[v];
		DFS(A,s,C);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=5;
		
	    ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++) {
			A.add(new ArrayList<Integer>());
		}                                                   
	  
		  addEdge(A,0,1);                                                                                                 
		   addEdge(A,0,2);
		   addEdge(A,1,2);
		   addEdge(A,1,3);
		   addEdge(A,3,4);
//		   addEdge(A,2,4);
		   addEdge(A,2,3);
		   DFSDIR(A,0,v);
	}

}
