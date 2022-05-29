package Lec_05;

public class Binary_to_decimal {
	public static void main(String[] args) {
		int bin = 1101;
		int mult = 1;
		int ans = 0;
		while (bin > 0) {
			int digit = bin % 10; // divide by src
			bin = bin / 10;
//			System.out.println(digit);
			ans = ans + digit * mult; // mult by destination
			mult = mult * 2; 
		}
		System.out.println(ans);
	}
}
