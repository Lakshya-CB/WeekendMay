package Lec_18_19;

public class Basics_2 {
	public static void main(String[] args) {
//		PID(1,4);
		System.out.println(Fac(3));
	}

	public static void PID(int s, int e) {
		if (s > e) {
			return;
		}
//		BP : PID(s,e)
//		SP : PID(s+1,e)
		System.out.println(s);
		PID(s + 1, e);
		System.out.println(s);
	}

	public static int Fac(int n) {
		if (n == 0) {
			return 1;
		}
//		BP : Fac(n)
//		SP : Fac(n-1)
		int sp = Fac(n - 1);
		return sp * n;
	}

	public static int Fibo(int n) {
		if(n<=1) {
			return n;
		}
//		BP : Fibo(n)
//		SP : Fib(n-1) and FIbo(n-2)
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}
	
}
