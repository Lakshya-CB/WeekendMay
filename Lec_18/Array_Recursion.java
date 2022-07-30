package Lec_18;

public class Array_Recursion {
	public static void main(String[] args) {
		int[] arr = { 100, 20, 30, 40 };
//		print(arr, 0);
		System.out.println(Max(arr, 0));

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
}
