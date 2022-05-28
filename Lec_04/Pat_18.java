package Lec_04;

public class Pat_18 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int nsp = n / 2;
		int nst = 1;
		while (row <= n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 0;
			while (cst < nst) {
				if (cst == 0 || cst == nst - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cst++;
			}
			System.out.println();
			if (row >= n / 2 + 1) {
				nsp++;
				nst = nst - 2;

			} else {
				nsp--;
				nst = nst + 2;

			}

			row++;
		}
	}
}
