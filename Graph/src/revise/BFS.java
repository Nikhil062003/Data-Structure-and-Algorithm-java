package revise;

import java.util.*;
import java.util.Scanner;

public class BFS {
	
	public static void print(int e[][],int sv,boolean v[],Queue q) {
		
		q.add(sv);
		v[sv]=true;
		for(int i=0;i<e.length;i++) {
			if(e[sv][i]==1&&!v[sv]) {
				q.add(e[sv][i]);
			}
		}
		int w=(int) q.poll();
		System.out.println(w);
		
		
		
				
		
	}
	
	
	
     
	public static void print1(int e[][]) {
		boolean  v[]=new boolean[e.length];
		Queue<Integer> Q = new LinkedList<Integer>();
		for(int i=0;i<e.length;i++) {
			if(!v[i]) {
		print(e,i,v,Q);}
		}
		
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
		print1(edege);
		
	}

}
