package DP;

import java.util.ArrayList;

public class LIS {

	public int lengthOfLIS(int[] nums) {
		return 0;
	}

//	public int solve(int idx, int prev, int[] arr) {
//		if (idx == arr.length) {
//			return 0;
//		}
//		int sp1 = 0;
//		if (arr[idx] > arr[prev]) {
//			sp1 = 1 + solve(idx + 1, idx, arr);
//		}
//		int sp2 = solve(idx + 1, prev, arr);
//		return Math.max(sp1, sp2);
//	}
	public int solve(int idx, int prev, int[] arr, Integer[][] dp) {
		if (idx == arr.length) {
			return 0;
		}
		if (dp[idx][prev + 1] != null) {
			return dp[idx][prev + 1];
		}

		int sp1 = 0;
		if (prev == -1 || arr[idx] > arr[prev]) {
			sp1 = 1 + solve(idx + 1, idx, arr, dp);
		}
		int sp2 = solve(idx + 1, prev, arr, dp);
		dp[idx][prev + 1] = Math.max(sp1, sp2);

		return Math.max(sp1, sp2);
	}

	public int solve(int[] nums) {
		ArrayList<Integer> AL = new ArrayList<>();
		for (int ali : nums) {
			if (AL.isEmpty() || AL.get(AL.size() - 1) < ali) {
				AL.add(ali);
			} else {
//				AL[i]>ali
				int s = 0;
				int e = AL.size() - 1;
				int ans = e;
				while (s<=e) {
					int mid = (s + e) / 2;
					if (AL.get(mid) >= ali) {
						ans = mid;
						e = mid - 1;
					} else {
						s = mid + 1;
					}
				}
				AL.set(ans, ali);
			}
		}
		return AL.size();
	}
}
