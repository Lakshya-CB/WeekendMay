package Lec_16;

public class Poly {
	public static void solve(int n, int x) {

		int c = n;
		int pow = x;
		int ans = 0;
		while (c > 0) {
			ans = ans + pow * c;

			pow = pow * x;
			c--;
		}
	}
}
