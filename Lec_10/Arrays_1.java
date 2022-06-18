package Lec_09;

public class Arrays_1 {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 13, 555, 5 };
//		print(arr);
//		System.out.println(Max(arr));
//		int[] rev = rev1(arr);
//		print(rev);
		rev(arr);
		print(arr);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void print2(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static int Max(int[] arr) {
//		int jeb = Integer.MIN_VALUE;
		int jeb = arr[0];
		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int Find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ali) {
				return i;
			}
		}
		return -1;
	}

	public static int[] rev1(int[] arr) {
		int idx1 = 0;
		int idx2 = arr.length - 1;
		int[] narr = new int[arr.length];
		while (idx2 >= 0) {
			narr[idx1] = arr[idx2];
			idx1++;
			idx2--;
		}
		return narr;
	}

	public static void rev(int[] arr) {
		int idx1 = 0;
		int idx2 = arr.length - 1;

		while (idx1 < idx2) {
			int temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;

			idx1++;
			idx2--;
		}
	}
}
