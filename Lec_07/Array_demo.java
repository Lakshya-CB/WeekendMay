package Lec_07;

public class Array_demo {
	public static void main(String[] args) {
		int n = 10;
		int[] arr = new int[n];
		System.out.println(arr);
//		Size?!
		int s = arr.length;
		System.out.println(s);
//		Indexing!!
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("==========");
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("==========");

		System.out.println("AZAADI!" + arr[arr.length - 1]);
//		System.out.println(arr[arr.length]);

		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();

		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = 2 * (idx + 1);
			
		}
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
		System.out.println("===========");
//		ENHANCED , for each!

		for (int LALLU : arr) {
			System.out.print(LALLU + " ");
		}
		System.out.println();
	}
}
