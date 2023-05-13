package Prac;

public class minstepsto1 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
       System.out.println(minS(n));
       System.out.println(minDP(n));
       
	}

	private static int minDP(int n) {
		// TODO Auto-generated method stub
		int dp[]=new int [n+1];
		dp[1]=0;
		for(int i=2;i<dp.length;i++) {
			int min=dp[i-1];
			if(i%3==0) {
				if(dp[i/3]<min) {
					min=dp[i/2];
					}
			}
			if(i%2==0) {
				if(dp[i/2]<min) {
					min=dp[i/2];
					}
			}
			dp[i]=min+1;
		}
		
		
		
		return dp[n];
	}
private static int minS(int n) {
		// TODO Auto-generated method stub
		if(n==1) {return 0;}
		int op1=minS(n-1);
		int ans=op1;
		if(n%3==0) {
			int op2=minS(n/3);
			if(op2<ans) {
				ans=op2;
			}
		}
		if(n%2==0) {
			int op3=minS(n/2);
			if(op3<ans) {
				ans=op3;
			}
		}
		return 1+ans;
		
		
	}
	
	

}
