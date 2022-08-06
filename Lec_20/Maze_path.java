package Lec_20;

public class Maze_path {
	public static void main(String[] args) {
		path(0, 0, "", 2, 2);
	}

	public static void path(int r, int c, String path, int dest_r, int dest_c) {
		if (r == dest_r && c == dest_c) {
			System.out.println(path);
			return;
		}
		if (r > dest_r || c > dest_c) {
			return;
		}

		path(r, c + 1, path + "R", dest_r, dest_c);
		path(r + 1, c, path + "D", dest_r, dest_c);

	}
	

}
