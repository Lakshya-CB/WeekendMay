package Lec_03;

public class Pat_2 {
	public static void main(String[] args) {

		int n = 7;
		int row = 1;
		int nst = 1;

		while (row <= n) {
//			Step 2, ** print karo
			int cst = 0;
			while (cst < nst) { // nst is number of star in each row
				System.out.print("* ");
				cst++;
			}
			nst++;


			System.out.println();
			row++;
		}
	}
}
