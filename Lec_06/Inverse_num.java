package Lec_06;

public class Inverse_num {
	public static void main(String[] args) {
		int num = 23145;
		int pos = 0;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			pos++;
//			System.out.println(digit + " , " + pos);
//			System.out.println(pos*Math.pow(10, digit-1));
			sum = sum + (int) (pos * Math.pow(10, digit - 1));
//			System.out.println(digit * Math.pow(10, pos - 1)); // expanded form!!

		}
		System.out.println(sum);
	}
}
