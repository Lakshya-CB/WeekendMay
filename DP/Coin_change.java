package DP;

public class Coin_change {
	public static void main(String[] args) {
		int[] coins = { 2, 4, 3 };
		int A = 5;

	}

	public static int solve(int idx, int A, int[] Coins) {
		if(A==0) {
			return 1;
		}
		if(A<0||idx==Coins.length) {
			return 0;
		}
		int sp1 = solve(idx, A - Coins[idx], Coins);
		int sp2 = solve(idx + 1, A, Coins);
		return sp1 + sp2;
	}
}
