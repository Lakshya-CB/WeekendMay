package DP;

public class Wine {
	public static void main(String[] args) {
		int[] wine = { 2, 3, 5, 1, 4 };
		System.out.println(Wine(wine, 0, wine.length - 1));
	}

	public static int Wine(int[] cost, int s, int e) {
		if (s > e) {
			return 0;
		}
		int day = cost.length - (e - s + 1) + 1;
		int sp1 = cost[s] * day + Wine(cost, s + 1, e);
		int sp2 = cost[e] * day + Wine(cost, s, e - 1);
		return Math.max(sp1, sp2);
	}

	public static int Wine_TD(int[] cost, int s, int e, int[][] dp) {
		if (s > e) {
			return 0;
		}
		if (dp[s][e] != 0) {
			return dp[s][e];
		}
		int day = cost.length - (e - s + 1) + 1;
		int sp1 = cost[s] * day + Wine_TD(cost, s + 1, e, dp);
		int sp2 = cost[e] * day + Wine_TD(cost, s, e - 1, dp);
		dp[s][e] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public static int Wine_BU(int[] cost) {
		int[][] dp = new int[cost.length + 1][cost.length];
		for (int s = cost.length - 1; s >= 0; s--) {
			for (int e = 0; e < cost.length; e++) {
//				solve(s,e)
				if (s > e) {

					continue;
				}
				int day = cost.length - (e - s + 1) + 1;
				int sp1 = cost[s] * day + dp[s + 1][e];
				int sp2 = 0;
				if (e > 0) {
					sp2 = cost[e] * day + dp[s][e - 1];
				}
				dp[s][e] = Math.max(sp1, sp2);

			}
		}
		return dp[0][cost.length - 1];
	}
}
