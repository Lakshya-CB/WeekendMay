package Lec_03;

public class Pat_6 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = 0;
		int nst = n;
		while (row <= n) {
//			Step 2: 
			int csp = 0;

			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;

			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}

			row++;
			nst--;
			nsp=nsp+2;
			System.out.println();

		}
	}
}
