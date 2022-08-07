package Lec_21;

public class Queen_N {
	public static void main(String[] args) {
//		QueenComb2_2D(int r, int c, int Q_tp, int total_r, int total_c, String path, boolean[][] board) {

		QueenComb2_2D(0, 0, 2, 3, 3, "", new boolean[3][3]);
	}

	public static void QueenComb2_2D(int r, int c, int Q_tp, int total_r, int total_c, String path, boolean[][] board) {
		if (Q_tp == 0) {
			System.out.println(path);
			DIsp(board);
			return;
		}
		if (c == total_c) {
			c = 0;
			r++;
		}
		if (r == total_r) {
			return;
		}
		if (isSafe(board, r, c)) {
			board[r][c] = true;
			QueenComb2_2D(r, c + 1, Q_tp - 1, total_r, total_c, path + "{" + r + "," + c + "}", board);
			board[r][c] = false;
		}
		QueenComb2_2D(r, c + 1, Q_tp, total_r, total_c, path, board);

	}

	private static boolean isSafe(boolean[][] board, int r, int c) {
//		left to right in row
		for (int C = 0; C < c; C++) {
			if (board[r][C]) {
//				System.out.println("lol"+r+" , "+ C);
				return false;
			}
		}
//		upar se neeche in col
		for (int R = 0; R < r; R++) {
			if (board[R][c]) {
//				System.out.println("lol"+r+" , "+ C);
				return false;
			}
		}
//		left dia
		int R = r;
		int C = c;
		while (R >= 0 && C >= 0) {
			if (board[R][C]) {
				return false;
			}
			R--;
			C--;
		}
		R = r;
		C = c;
		while (R >= 0 && C <board[0].length) {
			if (board[R][C]) {
				return false;
			}
			R--;
			C++;
		}
		return true;
	}

	public static void DIsp(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean l : row) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		System.out.println("===================");
	}
}
