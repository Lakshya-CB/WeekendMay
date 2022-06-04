package Lec_06;

public class rotate_2 {
	public static void main(String[] args) {
		int num = 123456;
		int rot = 4;

		int baaackup = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = baaackup;

//		rot = rot % nod; //???
		int div = (int) Math.pow(10, rot);
		int part1 = num / div;
		int part2 = num % div;

		System.out.println(part1 + "=" + part2);
		int mult = (int)Math.pow(10, nod - rot);
		System.out.println(mult*part2+part1);
	}
}
