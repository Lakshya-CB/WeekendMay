package Lec_04;

public class pat_33 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;

		int nsp = n - 1;
		int nst = 1;
		int num = 10;

		while (row <= n) {
			int series = num;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
//				if (series == 10) {
//					System.out.print("0 ");
//				} else {
					System.out.print(series%10 + " ");
//				}
				if (cst <= nst / 2) {
					series++;
				} else {
					series--;

				}
				cst++;
			}
			nst = nst + 2;
			nsp--;
			row++;
			num--;
			System.out.println();
		}
	}
}
