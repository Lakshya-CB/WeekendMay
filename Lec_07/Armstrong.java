package Lec_07;

public class Armstrong {
	public static void main(String[] args) {
		int n = 100000;
		PrintTill(n);
	}

	private static void PrintTill(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArmstrong(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isArmstrong(int num) {
		int NOD = NOD(num);
		int baaackup = num;
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			ans = ans + (int) Math.pow(digit, NOD);
		}
		boolean mila = ans == baaackup;
		return mila;
	}

	public static int NOD(int num) {
		int ans = 0;
		while (num > 0) {
			num = num / 10;
			ans++;
		}
		return ans;

	}
}
