package Prac;

public class FabonaciiDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=40;
        System.out.println(FibDp(n));
        System.out.println(FibM(n));
        System.out.println(Fib(n));
        
        
	}
	
	private static int FibDp(int n) {
		int dp[]=new int [n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}

	private static int Fib(int n) {
		// TODO Auto-generated method stub
		if(n==0||n==1) {
			return n;
		}
		
		return Fib(n-1)+Fib(n-2);
	}

	private static int FibM(int n) {
		int storage[]=new int[n+1];
		
		return FibMH(n,storage);
		
		// TODO Auto-generated method stub
		
	}
	

	private static int FibMH(int n, int[] storage) {
		// TODO Auto-generated method stub
		if(n==1||n==0) {
			storage[n]=n;
			return storage[n];
		}
		if(storage[n]!=0) {
			return storage[n];
		}
		storage[n]=FibMH(n-1,storage)+FibMH(n-2,storage);
		return storage[n];
	}

}
