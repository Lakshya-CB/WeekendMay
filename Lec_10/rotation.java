package Lec_09;

public class rotation {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		rotate(arr, 3000000);
//		print2(arr);
		System.out.println(-14 % 5);
	}

	public static void print2(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		if (rot < 0) {
			rot = rot + arr.length;
		}
		for (int r = 0; r < rot; r++) {

			int ali = arr[arr.length - 1];
			int i = arr.length - 2;
			while (i >= 0) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[0] = ali;
		}
	}

	public static void rev(int[] arr, int idx1, int idx2) {
//		int idx1 = 0;
//		int idx2 = arr.length - 1;

		while (idx1 < idx2) {
			int temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;

			idx1++;
			idx2--;
		}
	}

	public static void rotate2(int[] arr, int rot) {
		rot = rot % arr.length;
		if (rot < 0) {
			rot = rot + arr.length;
		}
//		reverse full arrray!!
		rev(arr, 0, arr.length - 1);
//		reverse part 1!! from 0 to rot-1;
		rev(arr, 0, rot - 1);
//		reverse part 2!! from rot to end!!
		rev(arr, rot, arr.length - 1);
	}
}
