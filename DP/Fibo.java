package DP;

public class Fibo {
	public static void main(String[] args) {
//	System.out.println(fib(45));
		int n = 5;
//		System.out.println(fib_TD(n, new Integer[n + 1]));
		System.out.println(fib_BUSE(n));
	}

	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = fib(n - 1);
		int sp2 = fib(n - 2);
		return sp1 + sp2;

	}

	public static int fib_TD(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = fib_TD(n - 1, dp);
		int sp2 = fib_TD(n - 2, dp);
		dp[n] = sp1 + sp2;// memorization
		return sp1 + sp2;
	}

	public static int fib_BU(int nth) {
		int[] dp = new int[nth + 1];
		dp[1] = 1;
		for (int n = 2; n <= nth; n++) {
//			Fibo(n)!!

			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2;// memorization
		}
		return dp[nth];
	}
	public static int fib_BUSE(int nth) {
		int[] dp = new int[2];
		
		dp[1] = 1;
		for (int n = 2; n <= nth; n++) {
//			Fibo(n)!!

			int sp1 = dp[1];
			int sp2 = dp[0];
			int curr = sp1 + sp2;// memorization
			dp[0]=dp[1];
			dp[1]=curr;
		}
		return dp[1];
	}
}
