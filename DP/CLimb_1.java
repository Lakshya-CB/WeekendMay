package DP;

public class CLimb_1 {
	public static void main(String[] args) {

	}

	public static int climb(int curr, int n) {
		if (curr > n) {
			return 0;
		}
		if (curr == n) {
			return 1;
		}
		int sp1 = climb(curr + 1, n);
		int sp2 = climb(curr + 2, n);
		return sp1 + sp2;
	}

	public static int climb_TD(int curr, int n, Integer[] dp) {
		if (curr > n) {
			return 0;
		}
		if (curr == n) {
			return 1;
		}
		if (dp[curr] != null) {
			return dp[curr];
		}
		int sp1 = climb(curr + 1, n);
		int sp2 = climb(curr + 2, n);
		dp[curr] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int climb_BU(int n) {
		int[] dp = new int[n+2];
		dp[n]=1;
		for (int curr = n-1; curr >= 0; curr--) {
	//	climb(curr)
			int sp1 = dp[curr + 1];
			int sp2 = dp[curr + 2];
			dp[curr] = sp1 + sp2;
		}
		return dp[0];
	}

}
