package DP;

public class HOuseRobber2 {

	public int rob(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int c1 = rob(0, nums.length - 2, nums);
		int c2 = rob(1, nums.length - 1, nums);
		return Math.max(c1, c2);
	}

	public int rob(int s, int e, int[] nums) {
		// return rob(0,nums,new Integer[nums.length]);
		int[] dp = new int[nums.length + 2];
		for (int idx = e; idx >= s; idx--) {
//	             dp[idx]
			int sp1 = dp[idx + 1];
			int sp2 = nums[idx] + dp[idx + 2];
			dp[idx] = Math.max(sp1, sp2);
		}
		return dp[s];
	}

}
