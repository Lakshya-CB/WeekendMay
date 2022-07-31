package Lec_18_19;

public class Rec_3 {
	public static void main(String[] args) {
//		CoinToss(3, "");
//		SubSeq("abc", "");
		LKC("22", "");
	}

	public static void CoinToss(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return;
		}
		CoinToss(n - 1, path + "H"); // Head
		CoinToss(n - 1, path + "T"); // Tail

	}

	public static void SubSeq(String word, String ans) {
		if (word.isEmpty()) {
			System.out.println(ans + "-");
			return;
		}
		char ch = word.charAt(0);
		SubSeq(word.substring(1), ans + ch); // Include
		SubSeq(word.substring(1), ans); // Exclude
	}

	public static String Options(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {
			return "def";
		} else if (ch == '4') {
			return "ghi";
		} else if (ch == '5') {
			return "jkl";
		} else if (ch == '6') {
			return "mno";
		} else if (ch == '7') {
			return "pqrs";
		} else if (ch == '8') {
			return "tuv";
		} else if (ch == '9') {
			return "wxyz";
		} else {
			return "";
		}
	}
	public static void LKC(String digits , String ans) {
		if(digits.isEmpty()) {
			System.out.println(ans);
			return;
		}
//		digits = 23
		char ch = digits.charAt(0); // 2
		String options = Options(ch);
		for(int i =0;i<options.length();i++) {
			char ch_toAdd = options.charAt(i);
			LKC(digits.substring(1), ans+ch_toAdd);
		}
	}
	public List<String> letterCombinations(String digits) {
        List<String> AL = new ArrayList<String>();
        LKC(digits, "", AL);
        return AL;
    }
    public static String Options(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {
			return "def";
		} else if (ch == '4') {
			return "ghi";
		} else if (ch == '5') {
			return "jkl";
		} else if (ch == '6') {
			return "mno";
		} else if (ch == '7') {
			return "pqrs";
		} else if (ch == '8') {
			return "tuv";
		} else if (ch == '9') {
			return "wxyz";
		} else {
			return "";
		}
	}
	public static void LKC(String digits , String ans,List<String> AL) {
		if(digits.isEmpty()) {
			// System.out.println(ans);
            if(ans.length()>0){
            AL.add(ans);
            }
			return;
		}
//		digits = 23
		char ch = digits.charAt(0); // 2
		String options = Options(ch);
		for(int i =0;i<options.length();i++) {
			char ch_toAdd = options.charAt(i);
			LKC(digits.substring(1), ans+ch_toAdd,AL);
		}
	}

}
