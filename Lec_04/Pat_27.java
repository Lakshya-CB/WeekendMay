package Lec_04;

public class Pat_27 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		while (row <= n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("\t");
				csp++;
			}

			int ntp = 1;
			int cst = 0;
			while (cst < nst) {
				System.out.print(ntp + "\t");
				if (cst <= nst / 2 + 1) {
					ntp++;
				} else {
					ntp--;
				}
				cst++;
			}
			nsp--;
			nst = nst + 2;
			System.out.println();
			row++;
		}
	}
}
