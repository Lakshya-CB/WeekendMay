package Doubt_class;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_Roses {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while(T>0) {
			T--;
			int size = scn.nextInt();
			int[] arr =new int[size];
			for(int i=0;i<size;i++) {
				arr[i] = scn.nextInt();
			}
			int A = scn.nextInt();
			PairOfRoses(arr, A);	
				
		}
		

	}

	public static void PairOfRoses(int[] arr, int A) {
		Arrays.sort(arr);
		int L = 0;
		int R = 0;
		int exsiting_diff = Integer.MAX_VALUE;
		int idx1 = 0;
		int idx2 = arr.length - 1;
		while (idx1 < idx2) {
			int sum = arr[idx1] + arr[idx2];
			if (sum == A) {

//				System.out.println(arr[idx1] + " , " + arr[idx2]);
				int diff = arr[idx2] - arr[idx1];
				if (diff < exsiting_diff) {
//					curr pair is the possible solution
					L = arr[idx1];
					R = arr[idx2];
					exsiting_diff = diff;
				}
				idx1++;
				idx2--;
			} else if (sum > A) {
				idx2--;
			} else {
				idx1++;
			}
		}
		System.out.println("Deepak should buy roses whose prices are "+L + " and " + R + ".");

	}
}
