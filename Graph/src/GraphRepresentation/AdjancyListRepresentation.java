package GraphRepresentation;
import java.util.*;
public class AdjancyListRepresentation {

	public static void addEdge(ArrayList<ArrayList<Integer>> A,int v,int u) {
		A.get(u).add(v);
		 A.get(v).add(u);
	}
	
    
	public static void Print(ArrayList<ArrayList<Integer>> A) {
		
		for(int i=0;i<A.size();i++) {
			for(int j=0;j<A.get(i).size();j++) {
				
				System.out.print(i+" "+A.get(i).get(j)+" ");}
		
				System.out.println();
			
		}}
    
	public static void main(String[] args) {
		int v=8;
		ArrayList A=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++) {
			A.add(new ArrayList<Integer>());
		}
  
	   addEdge(A,0,1);
	   addEdge(A,0,2);
	   addEdge(A,1,2);
	   addEdge(A,1,3);
	   addEdge(A,3,4);
	   addEdge(A,7,2);
	   addEdge(A,6,4);
	   
	   Print(A);
	
	}

}
