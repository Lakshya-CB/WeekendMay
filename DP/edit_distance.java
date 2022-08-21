package DP;

public class edit_distance {

	public static int solve(String w1, int i1, String w2, int i2) {
		if (i1 == w1.length() || i2 == w2.length()) {
			int ans1 = w1.length() - i1;
			int ans2 = w2.length() - i2;
			return Math.max(ans2, ans1);
		}
		if (w1.charAt(i1) == w2.charAt(i2)) {
			return solve(w1, i1 + 1, w2, i2 + 1);
		} else {
			int rep = 1 + solve(w1, i1 + 1, w2, i2 + 1);
			int del = 1 + solve(w1, i1 + 1, w2, i2);
			int ins = 1 + solve(w1, i1, w2, i2 + 1);
			return Math.min(rep, Math.min(del, ins));
		}
	}

	public static int solve_TD(String w1, int i1, String w2, int i2, Integer[][] dp) {
		if (i1 == w1.length() || i2 == w2.length()) {
			int ans1 = w1.length() - i1;
			int ans2 = w2.length() - i2;
			return Math.max(ans2, ans1);
		}
		if (dp[i1][i2] != null) {
			return dp[i1][i2];
		}
		if (w1.charAt(i1) == w2.charAt(i2)) {
			int ans = solve(w1, i1 + 1, w2, i2 + 1);
			dp[i1][i2] = ans;
			return ans;
		} else {
			int rep = 1 + solve_TD(w1, i1 + 1, w2, i2 + 1, dp);
			int del = 1 + solve_TD(w1, i1 + 1, w2, i2, dp);
			int ins = 1 + solve_TD(w1, i1, w2, i2 + 1, dp);
			dp[i1][i2] = Math.min(rep, Math.min(del, ins));
			return Math.min(rep, Math.min(del, ins));
		}
	}

	public static int solve_BU(String w1, String w2) {
		int[][] dp = new int[w1.length()+1][w2.length()+1];
		for (int i1 = w1.length(); i1 >= 0; i1--) {
			for (int i2 = w2.length(); i2 >= 0; i2--) {
//				solve(i1,i2)
				if (i1 == w1.length() || i2 == w2.length()) {
					int ans1 = w1.length() - i1;
					int ans2 = w2.length() - i2;
					dp[i1][i2]= Math.max(ans2, ans1);
					continue;
				}
				if (w1.charAt(i1) == w2.charAt(i2)) {
					int ans = solve(w1, i1 + 1, w2, i2 + 1);
					dp[i1][i2] = ans;

				} else {
					int rep = 1 + dp[i1 + 1][i2 + 1];
					int del = 1 + dp[i1 + 1][i2];
					int ins = 1 + dp[i1][i2 + 1];
					dp[i1][i2] = Math.min(rep, Math.min(del, ins));
				}
			}
		}
		return dp[0][0];
	}

}
