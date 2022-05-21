package Lec_02;

import java.util.Scanner;

public class Counting {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 5;
		int sum = 0;
		int count = 1;
		while (count <= n) {
			sum = sum + count;
			count++;
		}
		System.out.println(sum);
	}
}
