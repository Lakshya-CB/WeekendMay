package Doubt_class;

import java.util.Arrays;

public class Agg_Cows {
	public static void main(String[] args) {
		int[] barns = {1,2,4,8,9};
		int Cows = 3;
		Arrays.sort(barns);
		int max_dis = barns[barns.length-1]-barns[0];
		int min_dist = 1;
		int s = min_dist;
		int e = max_dis;
		int ans = 1;
		while(s<=e) {
			int d = (s+e)/2;
			if(isPoss(Cows, barns, d)) {
				ans = d;
				s = d+1;
			}else {
				e= d-1;
			}
		}
		System.out.println(ans);
//		for(int d = 1; d<=max_dis;d++) {
//			System.out.println(d+" "+isPoss(Cows, barns, d));
//		}
	}


	public static boolean isPoss(int C, int[] barns, int d) {
		int cows_placed = 1;
		int cow_loc = barns[0];
		for (int i = 1; i < barns.length; i++) {
			if (barns[i] - cow_loc >= d) {
				cows_placed++;
				cow_loc = barns[i];
			}
			if(cows_placed==C) {
				return true;
			}
		}
		return false;
	}
}
