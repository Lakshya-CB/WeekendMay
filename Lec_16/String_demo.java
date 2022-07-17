package Lec_16;

public class String_demo {
	public static void main(String[] args) {
		int n = 100000;
		long start = System.currentTimeMillis();
		String ans = "";
		for(int i=0;i<n;i++) {
			ans = ans +i; // O(n)
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start)/1000.0);
		
	}
}
