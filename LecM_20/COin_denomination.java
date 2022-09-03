package LecM_20;

public class COin_denomination {
	public static void main(String[] args) {
		int[] coins = { 1, 1, 2, 2, 3, 4, 5, 5 };
//		Type1PermU(coins, 4, "");
//		Type1CombU(coins, 4,0, "");
//		Type2CombC(coins, 0, 6, "");
		Type3CombU(coins, 6, 0, "");

	}

//	Type -1 
//	Infinite , coins are unique!!
//	wrt user!!
	public static void Type1PermU(int[] coins, int A, String path) {
		if (A == 0) {
			System.out.println(path);
		}
		if (A < 0) {
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			Type1PermU(coins, A - coins[i], path + coins[i]);
		}
	}

	public static void Type1CombU(int[] coins, int A, int prev, String path) {
		if (A == 0) {
			System.out.println(path);
		}
		if (A < 0) {
			return;
		}

		for (int i = prev; i < coins.length; i++) {
			Type1CombU(coins, A - coins[i], i, path + coins[i]);
		}
	}

//	wrt Coin
	public static void Type1CombC(int[] coins, int curr, int A, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0 || curr == coins.length) {
			return;
		}
		Type1CombC(coins, curr, A - coins[curr], path + coins[curr]);
		Type1CombC(coins, curr + 1, A, path);

	}

//	Type 2: Finite supply!!
//	Permutation wrt User T2 HW
	public static void Type2CombU(int[] coins, int A, int prev, String path) {
		if (A == 0) {
			System.out.println(path);
		}
		if (A < 0) {
			return;
		}

		for (int i = prev; i < coins.length; i++) {
			Type2CombU(coins, A - coins[i], i + 1, path + coins[i]);
		}
	}

//	wrt Coin
	public static void Type2CombC(int[] coins, int curr, int A, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0 || curr == coins.length) {
			return;
		}
		Type2CombC(coins, curr + 1, A - coins[curr], path + coins[curr]);
		Type2CombC(coins, curr + 1, A, path);

	}

//	Type 3: finite supply duplicates!! 
//	comb wrt U
	public static void Type3CombU(int[] coins, int A, int prev, String path) {
		if (A == 0) {
			System.out.println(path);
		}
		if (A < 0) {
			return;
		}

		for (int i = prev; i < coins.length; i++) {
			if (i == prev || coins[i - 1] != coins[i]) {
				Type3CombU(coins, A - coins[i], i + 1, path + coins[i]);
			}
		}
	}

//	wrt Coin
	public static void Type3CombC(int[] coins, int curr, int A, boolean include, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0 || curr == coins.length) {
			return;
		}
		if (!include && coins[curr] == coins[curr - 1]) {
			Type3CombC(coins, curr + 1, A, false, path);
		} else {
			Type3CombC(coins, curr + 1, A - coins[curr], true, path + coins[curr]);
			Type3CombC(coins, curr + 1, A, false, path);

		}
	}
}
