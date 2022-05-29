package Lec_05;

public class Decimal_to_binary {
	public static void main(String[] args) {

		int n = 13;
		int mult = 1;
		int ans = 0;
		while (n>0) {
			int digit = n % 2; // divide by dest
			n = n / 2;
			ans = ans + mult * digit; // mult by src
			
			mult = mult * 10;
		}
		System.out.println(ans);
	}
}
