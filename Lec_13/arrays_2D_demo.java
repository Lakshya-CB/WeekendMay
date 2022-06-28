package Lec_13;

import java.util.Iterator;

public class arrays_2D_demo {
	public static void main(String[] args) {
		int[][] mat = new int[5][3];

		for (int[] row : mat) {
//			System.out.println(row);
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
		System.out.println("==========");
//		int[] second_row = mat[2];
//		second_row[1] = 10;
		mat[2][1] = 10;
		for (int[] row : mat) {
//			System.out.println(row);
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}

		System.out.println("==========");
		for(int r =0;r<mat.length;r++) {
			for(int c =0;c<mat[0].length;c++) {
				System.out.print(mat[r][c]+ " ");
				
			}
			System.out.println();
		}
		
	}
}
