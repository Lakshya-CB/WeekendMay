package Lec_05;

import java.util.Scanner;

public class Lower_Upper {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		char ch = scn.next().charAt(0);
		String word = scn.next();
		char ch = word.charAt(0);
//		System.out.println(ch);
		if (ch <= 'Z' && ch >= 'A') {
			System.out.println("Biggy");
		} else if(ch>='a' && ch<='z'){
			System.out.println("Lower");
		}else {
			System.out.println("mat chero");
		}
	}
}
