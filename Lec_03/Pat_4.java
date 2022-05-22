package Lec_03;

public class Pat_4 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		while (row <= n) {
//			Step 2: 
			int csp = 0; // curr space!!
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 0; // curr *!!
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}

			System.out.println();
			row++;
			nst++;
			nsp--;
		}
	}
}
