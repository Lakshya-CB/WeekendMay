package DP;

public class Min_steps {
	public static void main(String[] args) {
		System.out.println(solve(100000));
	}

	public static int solve(int num) {
		if(num==1) {
			return 0;
		}
		if (num % 2 == 0) {
			return solve(num / 2) + 1;
		} else {
			int sp1 = solve(num + 1);
			int sp2 = solve(num - 1);
			return Math.min(sp1, sp2) + 1;
		}
	}
}
