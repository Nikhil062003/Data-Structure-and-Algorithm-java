package revise;
import java.util.*;
public class insertfromuser {
  
	///dfs 
	
	public static void print(int e[][],int sv,boolean v[]) {
		System.out.println(sv);
		v[sv]=true;
		
		int n=e.length;
		for(int i=0;i<n;i++) {
			if(e[sv][i]==1&&v[i]==false) {  
				print(e,i,v);
			}
		}
	}
	
	public static void DFS(int e[][]) {
	boolean  v[]=new boolean[e.length];
	for(int i=0;i<e.length;i++) {
		if(!v[i]) {
	print(e,i,v);}
	}
	
	}
	
	
	public static  boolean printt(int e[][],int sv,boolean v[],int end) {
		Queue<Integer>L=new LinkedList<>();
		L.add(sv);
		v[sv]=true;
		int n=e.length;
		while(!L.isEmpty()) {
			int a=L.poll();
			if(a==end) {
				return true;
			}
					//System.out.println(a);;
			for(int i=0;i<n;i++) {
				if(e[sv][i]==1&&!v[i]) {
				L.add(i);
				v[i]=true;}
			}
			
		}
		return false;
		
		
	}
	
	public static boolean BFS(int e[][],int s,int end) {
		boolean  v[]=new boolean[e.length];
		for(int i=s;i<e.length;i++) {
			if(!v[i]) {
		printt(e,i,v,end);}}
		
	return false;
	}
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		int edege[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			int sv=sc.nextInt();
			int ev=sc.nextInt();
			edege[sv][ev]=1;
			edege[ev][sv]=1;
			}
		
		System.out.println(BFS(edege,0 ,3));
//		System.out.println("ji");
//		DFS(edege);
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(edege[i][j]+" ");
//		
//			}
//			System.out.println();}
//		
//		

	}

}
