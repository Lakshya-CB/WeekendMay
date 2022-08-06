package Lec_20;

public class Climbing_stairs {
	public static void main(String[] args) {
		climb(0, 4, "");
	}

	public static void climb(int curr, int dest, String path) {
		if(curr==dest) {
			System.out.println(path);
			return;
		}
		if(curr>dest) {
			return;
		}
		for(int i=1;i<=3;i++) {
			climb(curr+i, dest, path+i);
		}
	}
}
