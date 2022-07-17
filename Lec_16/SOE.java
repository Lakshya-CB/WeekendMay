package Lec_16;

public class SOE {
	public static void main(String[] args) {
		solve(1000);
	}

	public static void solve(int n) {
		boolean[] isComp = new boolean[n + 1];
		for (int div = 2; div * div <= n; div++) {
//		div ka table
			if (isComp[div] == false) {
				for (int table = div * 2; table <= n; table = table + div) {
					isComp[table] = true;
				}
			}
		}
		for(int prime = 2;prime<=n;prime++) {
			if(isComp[prime]==false) {
				System.out.println(prime);
			}
		}
	}
}
