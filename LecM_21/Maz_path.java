package LecM_21;

public class Maz_path {
	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		maze(0, 0, maze, "", new boolean[maze.length][maze[0].length]);
	}

	public static void maze(int r, int c, int[][] maze, String path, boolean[][] visited) {
		if (r < 0 || r == maze.length || c < 0 || c == maze[0].length || visited[r][c] || maze[r][c] == 1) {
//			if(maze[r][c]==1||r<0||r==maze.length||c<0||c==maze[0].length) {

			return;
		}
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(path);
			return;
		}
		visited[r][c] = true;

		maze(r - 1, c, maze, path + "U", visited);
		maze(r + 1, c, maze, path + "D", visited);
		maze(r, c - 1, maze, path + "L", visited);
		maze(r, c + 1, maze, path + "R", visited);

		visited[r][c] = false;
	}
}
