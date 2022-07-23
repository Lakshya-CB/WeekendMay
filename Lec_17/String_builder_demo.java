package Lec_17;

public class String_builder_demo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("HELLO");
		System.out.println(sb);
		
		sb.setCharAt(0,'O');
		System.out.println(sb);
		sb.append("POPOPOP");

		System.out.println(sb);
		sb.insert(1,"LUL");

		System.out.println(sb);
		
	}
}
