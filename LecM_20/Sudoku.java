package LecM_20;

public class Sudoku {
	
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		System.out.println((char)0+"=");
		solve(0, 0, board);
		print(board);
	}
	static boolean ans = false;
	public static void solve(int r, int c, char[][] board) {
		if (c == 9) {
			c = 0;
			r++;
		}
		if (r == 9) {
//			board!!
//			print(board);
//			System.out.println("==============");
			ans = true;
			return;
		}
		if (board[r][c] != '.') {
			solve(r, c + 1, board);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (isSafe(board, r, c, i)) {
					board[r][c] = (char) ('0' + i);
					solve(r, c + 1, board);
//					if(ans) {
//						return;
//					}
				}

			}
			board[r][c] = '.';
		}
	}

	public static boolean isSafe(char[][] board, int r, int c, int i) {
		// TODO Auto-generated method stub
		char ch = (char)('0'+i);
		for(int R =0;R<9;R++){
			if(board[R][c]==ch) {
				return false;
			}
		}
		for(int C =0;C<9;C++){
			if(board[r][C]==ch) {
				return false;
			}
		}
		int box_r = r/3;
		int box_c = c/3;
		for(int R = box_r*3;R<box_r*3+3;R++) {
			for(int C = box_c*3;C<box_c*3+3;C++) {
				if(board[R][C]==ch) {
					return false;
				}
			}
		}
		return true;
	}

	public static void print(char[][] board) {
		for (char[] row : board) {
			for (char b : row) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
