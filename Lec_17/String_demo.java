package Lec_17;

public class String_demo {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str12 = "Hello";
		String str13 = "Hello";
		System.out.println(str1==str12);
		System.out.println(str1);
		String str2 = new String("Hello");
		String str21 = new String("Hello");
		String str22 = new String("Hello");
		String str23 = new String("Hello");
		System.out.println(str2==str21);
		System.out.println(str21==str22);
		
		str13 = str13.substring(0,5);

		System.out.println(str13==str12);
		System.out.println(str12);
//		System.out.println(str2);
//		System.out.println(str1==str2);
//		System.out.println(str1.equals(str2));
	}
}
