package Lec_02;

public class GCD {
	public static void main(String[] args) {
		int a = 18;
		int b = 32;
		int divisor = b;
		int dividend = a;
//		int remainder = -1;
//		while (remainder != 0) {
		while (divisor != 0) {

			int remainder = dividend % divisor;
////			A -> Ye kaam nahi karta !
//			divisor = remainder;
//			dividend = divisor;
//			B
			dividend = divisor;
			divisor = remainder;

		}
		System.out.println(dividend);
	}
}
