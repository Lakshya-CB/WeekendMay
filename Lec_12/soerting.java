package Lec_12;

import java.util.Arrays;

public class soerting {
	public static void main(String[] args) {
		int[] Arr = { 88, 66, 55, 44, 22 };
		System.out.println(Arrays.toString(Arr)+"org");
//		int[] Arr = { 10, 20, 30, 40, 50, 60, 22 };

		Insertion(Arr);
//		bubble(Arr);
//		selection(Arr);
//		System.out.println(Arrays.toString(Arr));

	}

	public static void bubble(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			for (int s = 0; s < arr.length - count; s++) {
//			 s and s+1
				if (arr[s] > arr[s + 1]) {
//				swap!! s and s+1
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
//			System.out.println(Arrays.toString(arr));

		}
	}

	public static void selection(int[] arr) {
		for (int last = arr.length - 1; last > 0; last--) {
			int maxi = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[maxi] < arr[i]) {
					maxi = i;
				}
			}
//		swap maxi and last!!
			int temp = arr[maxi];
			arr[maxi] = arr[last];
			arr[last] = temp;
			System.out.println(Arrays.toString(arr));

		}

	}

	public static void Insertion(int[] arr) {
		for (int last = 1; last < arr.length; last++) {
			int idx = last - 1;
			int ali = arr[last];
//		while (arr[idx] > ali && idx>=0) { //a
			while (idx >= 0 && arr[idx] > ali) { // b
				arr[idx + 1] = arr[idx];
				idx--;
			}
			arr[idx + 1] = ali;
			System.out.println(Arrays.toString(arr));
		}
	}
}
