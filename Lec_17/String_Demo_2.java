package Lec_17;

public class String_Demo_2 {
	public static void main(String[] args) {
		String str1 = "abcdefg";
		String str2 = "ab";
		String ss= str1.substring(0,2);
		System.out.println(ss+" "+str2+" "+ (str2==ss));
	}
}
