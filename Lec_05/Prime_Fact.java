package Lec_05;

public class Prime_Fact {
	public static void main(String[] args) {
		int n = 34;
		int div = 2;
		while (n > 1) {
			if (n % div == 0) {
//			div is factor!
				System.out.println(div);
				n = n / div;
			} else {
				div++;
			}
		}
	}
}
