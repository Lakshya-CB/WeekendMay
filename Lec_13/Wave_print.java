package Lec_13;

public class Wave_print {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 } };
//		wave(arr);
		spiral(arr);
	}

	public static void wave(int[][] mat) {
		for (int c = 0; c < mat[0].length; c++) {
			for (int r = 0; r < mat.length; r++) {
				int row_idx = r;
				if (c % 2 == 1) {
					row_idx = mat.length - 1 - r;
				}
				System.out.print(mat[row_idx][c] + " ");
			}
			System.out.println();
		}
	}

	public static void spiral(int[][] mat) {
		int cs = 0;
		int ce = mat[0].length - 1;
		int rs = 0;
		int re = mat.length - 1;
		int count = 0;
		int product = mat.length * mat[0].length;
		while (rs <= re && cs <= ce) {
			for (int r = rs; r <= re && count < product; r++) {
				System.out.print(mat[r][cs] + " ");
				count++;

			}
			System.out.println();

			for (int c = cs + 1; c <= ce && count < product; c++) {
				System.out.print(mat[re][c] + " ");
				count++;

			}
			System.out.println();

			for (int r = re - 1; r >= rs && count < product; r--) {
				System.out.print(mat[r][ce] + " ");
				count++;

			}
			System.out.println();

			for (int c = ce - 1; c >= cs + 1 && count < product; c--) {
				System.out.print(mat[rs][c] + " ");
				count++;

			}
			System.out.println();
			rs++;
			cs++;
			re--;
			ce--;
		}

	}
}
