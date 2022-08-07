package Lec_21;

public class Blocked_Maze {
	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		solve(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);
	}

	public static void solve(int[][] board, int r, int c, String path, boolean[][] visited) {
		if (r == board.length - 1 && c == board[0].length - 1) {
			System.out.println(path);
			return;
		}
		if (r < 0 || r == board.length || c < 0 || c == board[0].length || board[r][c] == 1 || visited[r][c]) {
//		if (board[r][c] == 1 || r < 0 || r == board.length || c < 0 || c == board[0].length) {

			return;
		}
		visited[r][c] = true;
		solve(board, r - 1, c, path + "U", visited);
		solve(board, r + 1, c, path + "D", visited);
		solve(board, r, c - 1, path + "L", visited);
		solve(board, r, c + 1, path + "R", visited);
		visited[r][c] = false;
	}
}
