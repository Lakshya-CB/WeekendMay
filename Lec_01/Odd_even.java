package Lec_01;

import java.util.Scanner;

public class Odd_even {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int var = scn.nextInt();
		int ans = var % 2;
//		System.out.println(var + 2 == var - 1);

//		System.out.println(ans);

		if (ans == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");

		}

	}
}
