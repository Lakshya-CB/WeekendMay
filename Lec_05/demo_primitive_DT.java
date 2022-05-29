package Lec_05;

public class demo_primitive_DT {
	public static void main(String[] args) {
		byte b = (byte) 1024;
		System.out.println(b);
		short s = -32768;
		System.out.println(s);
		System.out.println(Integer.MAX_VALUE);
		long l = 10000000000000l;
		System.out.println(l);

		double d = 12.4;
		float f = 12.4f;

//		int i = f;
		int i = 100;
//		System.out.println(i);
		f = i;
//		System.out.println(f);
//		
		char ch = 'a';
		System.out.println((int) ch);
		System.out.println((int) '1' + "=>");
		System.out.println((int) 'c');
		System.out.println((int) 'd');
		System.out.println((int) 'A');

		int i1 = 1;
		System.out.println((char) i1 + "====");
		System.out.println(ch + 10);
		ch = (char)(ch + 10);
		System.out.println(ch);
		
		System.out.println("=========");
		boolean bb = true;
		System.out.println(bb);
		if(bb==true) {
			System.out.println("hawan");
		}
		while(bb) {
			System.out.println("Sfda");
		}

	}
}
