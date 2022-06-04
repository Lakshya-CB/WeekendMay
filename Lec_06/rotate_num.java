package Lec_06;

public class rotate_num {
	public static void main(String[] args) {
		int num = 123456;
		int rot = 60000;

		
		int baaackup = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = baaackup;

		rot = rot%nod;

		for (int r = 0; r < rot; r++) {
			int digit = num % 10;
			int part = num / 10;

			int mult = (int) Math.pow(10, nod - 1);
			num = digit * mult + part;
		}

		System.out.println(num);
	}
}
