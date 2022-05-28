package Lec_04;

public class Pat_07 {
	public static void main(String[] args) {
		int n =8;
		int row = 1;
		int nst = n;
		while (row <= n) {

			int cst = 0;
			while (cst < nst) {
//				if (cst == 0 || cst == nst - 1 || row == n || row == 1) {
				if (cst + 1 == row || row + cst == n) {

					System.out.print("* ");
				} else {
					System.out.print("  ");

				}
				cst++;
			}
			System.out.println();
			row++;
		}
	}
}
