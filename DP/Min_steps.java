package DP;

public class Min_steps {
	public static void main(String[] args) {
		System.out.println(solve(100000));
	}

	public static int solve(int num, Integer[] dp) {
		if (num == 1) {
			return 0;
		}
		if (dp[num] != null) {
			return dp[num];
		}
		if (num % 2 == 0) {
			int ans = solve(num / 2, dp) + 1;
			dp[num] = ans;
			return ans;
		} else {
			int sp1 = solve(num + 1, dp);
			int sp2 = solve(num - 1, dp);

			int ans = Math.min(sp1, sp2) + 1;
			dp[num] = ans;
			return ans;
		}
	}

	public static int solve_BU(int n) {
		int[] dp = new int[n+1];
		
		for (int num = 2; num <= n; num++) {
//			solve(num)
			if (num % 2 == 0) {
				int ans = dp[num / 2] + 1;
				dp[num] = ans;
			
			} else {
				int sp1 = dp[(num + 1)/2]+1;
				int sp2 = dp[num - 1];

				int ans = Math.min(sp1, sp2) + 1;
				dp[num] = ans;
			}
		}
		return dp[n];
	}

}
