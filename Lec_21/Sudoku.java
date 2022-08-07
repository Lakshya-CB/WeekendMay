package Lec_21;

public class Sudoku {
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '.', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		solve(0, 0, board);
	}

	public static void solve(int r, int c, char[][] board) {

		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
//			System.out.println();
			Disp(board);
			return;
		}
		if (board[r][c] != '.') {
			solve(r, c + 1, board);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (isSafe(i, r, c, board)) {
					board[r][c] = (char) ('0' + i);
					solve(r, c + 1, board);
				}
			}
			board[r][c] = '.';
		}
	}

	private static boolean isSafe(int i, int r, int c, char[][] board) {
		for(int C = 0;C<9;C++) {
			if(board[r][C]==(char)(i+'0')) {
				return false;
			}
		}
		for(int R = 0;R<9;R++) {
			if(board[R][c]==(char)(i+'0')) {
				return false;
			}
		}
		int boxr = r/3;
		int boxc = c/3;
		for(int R = boxr*3;R<boxr*3+3;R++) {
			for(int C = boxc*3;C<boxc*3+3;C++) {
				if(board[R][C]==(char)(i+'0')) {
					return false;
				}
			}
		}
		return true;
	}

	public static void Disp(char[][] board) {
		for (char[] row : board) {
			for (char ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		System.out.println("=================");
	}
}
