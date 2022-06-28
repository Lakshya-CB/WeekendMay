package Lec_13;

import java.util.Scanner;

public class Arrays_2D_demo2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] mat = new int[5][3];
		int count = 1;

		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[0].length; c++) {
//				mat[r][c] = 10 * count;
				mat[r][c] = scn.nextInt();
				count++;

			}
		}
		for (int[] row : mat) {
//			System.out.println(row);
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
	}

}
