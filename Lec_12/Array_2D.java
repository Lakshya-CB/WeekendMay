package Lec_12;

public class Array_2D {
	public static void main(String[] args) {
		int[][] mat = new int[4][3];// RxC
		System.out.println(mat);
		System.out.println(mat.length); // 4
		int[] r0 = mat[0];
		int[] r1 = mat[1];
		int[] r2 = mat[2];
		int[] r3 = mat[3];
		System.out.println(r0);
		System.out.println(r0.length);
		System.out.println(mat[0].length);// number of col

	}
}
