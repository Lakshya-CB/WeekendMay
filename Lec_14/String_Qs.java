package Lec_14;

public class String_Qs {
	public static void main(String[] args) {
		String str = "nitin";

		// for(int s =0;s<str.length();s++){
		// for(int e = s+1;e<=str.length();e++){
		// String part = str.substring(s,e);
		// if(isPalin(part)){
		// System.out.println(part);
		// }
		// }
		// }
		// printPalin("nittin");
		str = "the sky is blue";
		ReverseSen(str);
	}

	public static void printPalin(String str) {
		for (int c = 0; c < str.length(); c++) {
			for (int r = 0; r + c < str.length() && c - r >= 0; r++) {
				char L = str.charAt(c - r);
				char R = str.charAt(r + c);
				if (R == L) {
					System.out.println(str.substring(c - r, c + r + 1));
				} else {
					break;
				}
			}
		}
		for (double c = 0.5; c < str.length(); c++) {
			for (double r = 0.5; r + c < str.length() && c - r >= 0; r++) {
				char L = str.charAt((int) (c - r));
				char R = str.charAt((int) (r + c));
				if (R == L) {
					System.out.println(str.substring((int) (c - r), (int) (c + r + 1)));
				} else {
					break;
				}
			}
		}
	}

	public static boolean isPalin(String str) {
		int s = 0;
		int e = str.length() - 1;

		while (s < e) {
			if (str.charAt(s) == str.charAt(e)) {
				s++;
				e--;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void ReverseSen(String str) {
		while (true) {
			int idx = str.lastIndexOf(" ");
			String word = str.substring(idx + 1);
			System.out.print(word + " ");
			if (idx == -1) {
				break;
			}
			str = str.substring(0, idx);

		}
	}
}
