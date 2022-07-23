package Lec_17;

public class Recursion_1 {
	public static void main(String[] args) {
		PI(4);
	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
//		BP PD(n)
//		SP PD(n-1)
		System.out.println(n);
		PD(n - 1);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
//		BP PI(n)
//		SP PI(n-1)

		PI(n - 1);
		System.out.println(n);
	}
	
	public static void PDI(int n) {
		if(n==0) {
			return;
		}
//		BP : PDI(n)
//		SP : PDI(n-1)
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
		
	}
}
