package DP;

public class Coin_change {
	public static void main(String[] args) {
		int[] coins = { 2, 4, 3 };
		int A = 5;
		System.out.println(solve(0, A, coins));
	}

	public static int solve(int idx, int A, int[] Coins) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == Coins.length) {
			return 0;
		}
		int sp1 = solve(idx, A - Coins[idx], Coins);
		int sp2 = solve(idx + 1, A, Coins);
		return sp1 + sp2;
	}

	public static int solve(int idx, int A, int[] Coins, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == Coins.length) {
			return 0;
		}
		if (dp[idx][A] != null) {
			return dp[idx][A];
		}
		int sp1 = solve(idx, A - Coins[idx], Coins, dp);
		int sp2 = solve(idx + 1, A, Coins, dp);
		dp[idx][A] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int solveBU(int[] Coins, int Amount) {
		int[][] dp = new int[Coins.length + 1][Amount + 1];
		for (int idx = Coins.length - 1; idx >= 0; idx--) {
			for (int A = 0; A <= Amount; A++) {
//				sol(idx, A)
//				coins = {10,3,5,8,11};
				if (A == 0) {
					dp[idx][A] = 1;
					continue;
				}
				int sp1 = 0;
				if (A - Coins[idx] >= 0) {
					sp1 = dp[idx][A - Coins[idx]];
				}
				int sp2 = dp[idx + 1][A];
				dp[idx][A] = sp1 + sp2;
			}
		}
		return dp[0][Amount];
	}

	public static int solveBUSE(int[] Coins, int Amount) {
		int[][] dp = new int[2][Amount + 1];
		for (int idx = Coins.length - 1; idx >= 0; idx--) {
			for (int A = 0; A <= Amount; A++) {
//				sol(idx, A)
//				coins = {10,3,5,8,11};
				if (A == 0) {
					dp[0][A] = 1;
					continue;
				}
				int sp1 = 0;
				if (A - Coins[idx] >= 0) {
					sp1 = dp[0][A - Coins[idx]];
				}
				int sp2 = dp[1][A];
				dp[0][A] = sp1 + sp2;
			}
			dp[1]= dp[0];
			dp[0] = new int[Amount+1];
		}
		return dp[0][Amount];
	}
}
