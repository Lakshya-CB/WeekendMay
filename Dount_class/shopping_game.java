package Dount_class;

import java.util.Scanner;

public class shopping_game {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {
			T--;
			int A = scn.nextInt();
			int H = scn.nextInt();
			int mobile = 1;
			while (true) {
				A = A - mobile;
				if (A < 0) {
					System.out.println("Harshit");
					break;
				}
				mobile++;
				H = H - mobile;
				if (H < 0) {
					System.out.println("Aayush");
					break;
				}

				mobile++;
			}
		}
	}
}
