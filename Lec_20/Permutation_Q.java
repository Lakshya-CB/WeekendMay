package Lec_20;

public class Permutation_Q {
	public static void main(String[] args) {
//		Queen_Perm(2, "", 3, new boolean[3]);
//		Queen_Comb(2, "", -1, 4);
//		QueenComb2(0, 2, 3, "");
		QueenComb2_2D(0, 0, 2, 3, 3, "");
	}

	public static void Queen_Perm(int Q_tp, String path, int total, boolean[] seats) {
		if (Q_tp == 0) {
			System.out.println(path);
			return;
		}
		for (int i = 0; i < total; i++) {
//			i!!
			if (seats[i] == false) {
				seats[i] = true; // prep!!
				Queen_Perm(Q_tp - 1, path + "q" + i, total, seats);
				seats[i] = false; // undo

			}
		}
	}

	public static void Queen_Comb(int Q_tp, String path, int last, int total) {
		if (Q_tp == 0) {
			System.out.println(path);
			return;
		}
		for (int i = last + 1; i < total; i++) {
//			ith!!
			Queen_Comb(Q_tp - 1, path + "q" + i, i, total);
		}
	}

	public static void QueenComb2(int c, int Q_tp, int total_c, String path) {
		if (Q_tp == 0) {// +ve BC
			System.out.println(path);
			return;
		}
		if (c == total_c) { // -ve BC
			return;
		}
		QueenComb2(c + 1, Q_tp - 1, total_c, path + "{" + c + "}");
		QueenComb2(c + 1, Q_tp, total_c, path);

	}

	public static void QueenComb2_2D(int r, int c, int Q_tp, int total_r, int total_c, String path) {
		if(Q_tp==0) {
			System.out.println(path);
			return;
		}
		if (c == total_c) {
			c = 0;
			r++;
		}
		if(r==total_r) {
			return;
		}
		QueenComb2_2D(r, c + 1, Q_tp - 1, total_r, total_c, path + "{" + r + "," + c + "}");
		QueenComb2_2D(r, c + 1, Q_tp, total_r, total_c, path);

	}
}
