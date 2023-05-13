package BackTrack;
import java.util.*;
public class RatInMaze {
	public static void RIM(int arr[][]) {
		int n=arr.length;
		int path[][]=new int[n][n];
		
	   print(arr,0,0,path);
		
		
	}

	private static boolean helper(int[][] arr, int i, int j, int[][] path) {
		int n=arr.length;
		if(i<0||i>=n||j<0||j>=n||arr[i][j]==0||path[i][j]==1) {
			//System.out.println("n");
			return false;
		}
		
		path[i][j]=1;
		 
		if(i==n-1&&j==n-1) {
			for(int k=0;k<arr.length;k++) {
				for(int l=0;l<arr.length;l++) {
					System.out.print(path[k][l]+" ");
				}
				System.out.println();
				
			}
			
			
			return true;}
		//right
		if(helper(arr,i,j+1,path)) {
		 return true;
		}
		//down
		if(helper(arr,i+1,j,path)) {
			return true;
		}
		//top
	   if(helper(arr,i-1,j,path)) {
		return true;
		}
	   //left
	   if(helper(arr,i,j-1,path)) {
			return true;
		}
		
		return false;
	}
	private static void print(int[][] arr, int i, int j, int[][] path) {
		int n=arr.length;
		if(i<0||i>=n||j<0||j>=n||arr[i][j]==-1||path[i][j]==1) {
			//System.out.println("n");
			return;
		}
		
		path[i][j]=1;
		 
		if(i==n-1&&j==n-1) {
			
				
			}
			System.out.println();
			path[i][j]=0;
			return;
			}
		//right
		print(arr,i,j+1,path);
		//down
		print(arr,i+1,j,path);
		//top
	  // print(arr,i-1,j,path);
	   //left
	   //print(arr,i,j-1,path);
	   path[i][j]=0;
	  
	}
	public static int solveMaze(int maze[][], int size) {
	    // Write your code here
	    int n=maze.length;
	    int path[][]=new int[n][n];
	    return helper(maze,0,0,path,0);
	  }
	
	
	  public static int helper(int maze[][],int i,int j,int path[][],int count){
	    int n=maze.length;
	    if(i<0||i>=n||j<0||j>=n||maze[i][j]==-1||path[i][j]==1){
	       
	    }
	    
	    path[i][j]=1;
	    if(i==n-1&&j==n-1){
	      count++;
	    }
	    count=helper(maze,i,j+1,path,count);
	    count= helper(maze,i+1,j,path,count);
	    return count;
	    
	    
	  }
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	   int n=3;
	   int arr[][]= {{0,-1,-1,-1},{0,0,-1,-1},{-1,0,0,-1},{-1,0,0,0}};
	RIM(arr);
	}

	}


