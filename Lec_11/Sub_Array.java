package Lec_11;

public class Sub_Array {
	public static void main(String[] args) {

		int[] arr = { 10, 20, -30, 40, 50 };
//		solve3(arr);
//		System.out.println("===============");
//		solve2(arr);
		int ans = Kadence(arr);
	}

	public static void solve3(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
				int sum = 0;
				for (int i = s; i <= e; i++) {
					sum = sum + arr[i];
					System.out.print(arr[i] + " ");
				}
				System.out.println("=>" + sum);
			}
		}
	}

	public static void solve2(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			int sum = 0;
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
				sum = sum + arr[e];
				System.out.println(sum);
			}

		}
	}

	public static int Kadence(int[] arr) {
		int sum = 0;
		int ans = 0;
		for (int ali : arr) {
			sum = sum + ali;
//			if (sum < 0) {
//				sum = 0;
//			}
			sum = Math.max(sum, 0);

//			if (ans < sum) {
//				ans = sum;
//			}
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
