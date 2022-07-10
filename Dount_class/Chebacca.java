package Dount_class;

import java.util.Scanner;

public class Chebacca {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		long num = scn.nextLong();
		long ans =0;
		long mult = 1;
		while(num>0) {
			
			int digit = (int)(num%10);
			if(num!=9 && 9-digit<digit) {
				digit = 9-digit;
			}
			num = num/10;
			ans = ans +digit*mult;
			mult = mult*10;
		}
		System.out.println(ans);
	}
}
