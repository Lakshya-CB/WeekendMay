package Lec_15;

import java.util.ArrayList;

public class ArrayList_Q {
	public static void main(String[] args) {
		int[] arr1 = { 9, 8, 7, 5 };
		int[] two = { 9, 6, 7 };
		ArrayList<Integer> AL = add(arr1, two);
	
		System.out.println(AL);

	}

	public static ArrayList<Integer> add(int[] arr1, int arr2[]) {
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		ArrayList<Integer> AL = new ArrayList<Integer>();
		int carry = 0;
		while (idx1 >= 0 || idx2 >= 0) {
			int sum = carry;
			if (idx1 >= 0) {
				sum = sum + arr1[idx1];
			}
			if (idx2 >= 0) {
				sum = sum + arr2[idx2];
			}
			int digit = sum % 10;
			AL.add(0, digit);
			carry = sum / 10;
			idx1--;
			idx2--;
		}
		if(carry>0) {
			AL.add(0,carry);
		}
		return AL;
	}
}
