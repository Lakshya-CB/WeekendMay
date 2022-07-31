package Lec_18_19;

import java.util.Arrays;

public class Array_Recursion {
	public static void main(String[] args) {
		int[] arr = { 100, 20, 30, 20, 20, 30, 40 };
//		print(arr, 0);
//		System.out.println(Max(arr, 0));
		System.out.println(Arrays.toString(AllOcc(arr, 0, 20, 0)));
	}

	
	public static void print(int[] arr, int s) {
		if (s == arr.length) {
			return;
		}
		// BP (arr, s)
//		SP (arr,s+1)
		System.out.println(arr[s]);
		print(arr, s + 1);
	}

	public static int Max(int[] arr, int s) {
//		if(s==arr.length-1) {
//			return arr[s];
//		}

		if (s == arr.length) {
			return Integer.MIN_VALUE;
		}
//		BP : Max(s)
//		SP : Max(s+1)
		int sp = Max(arr, s + 1);
//		return Math.max(arr[s], sp);
		if (sp > arr[s]) {
			return sp;
		} else {
			return arr[s];
		}
	}

	public static int FirstOcc(int[] arr, int s, int ali) {
		if (s == arr.length) {
			return -1;
		}
		int sp = FirstOcc(arr, s + 1, ali);
		if (arr[s] == ali) {
			return s;
		} else {
			return sp;
		}
	}

	public static int LastOcc(int[] arr, int s, int ali) {
		if (s == arr.length) {
			return -1;
		}
		int sp = LastOcc(arr, s + 1, ali);
		if (sp == -1 && arr[s] == ali) {
			return s;
		} else {
			return sp;
		}
	}

	public static int[] AllOcc(int[] arr, int s, int ali, int count) {
		if (s == arr.length) {
			return new int[count];
		}
		if (arr[s] == ali) {
			int[] sp = AllOcc(arr, s + 1, ali, count + 1);
//sp bharo!!
			sp[count] = s;
			return sp;
		} else {
			int[] sp = AllOcc(arr, s + 1, ali, count);

			return sp;
		}
	}
}
