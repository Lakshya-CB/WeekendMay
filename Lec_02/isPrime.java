package Lec_02;

public class isPrime {
	public static void main(String[] args) {
		int n = 6;
		int div = 1;
		int numFac = 0;
		while(n>=div) {
			int rem = n % div;
			if(rem==0) {
				numFac++;
			}
//			System.out.println(div+" = "+rem );
			div++;
		}
		System.out.println(numFac);
		if(numFac == 2) {
			System.out.println("Prime");
		}else {
			System.out.println("Nahi hein prime");
		}
	}
}
