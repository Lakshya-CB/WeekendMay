package LecM_21;

import java.util.ArrayList;
import java.util.List;

public class GenrateParen {
	public static void main(String[] args) {
		List<String> AL = new ArrayList<>();
		gen(3, 3, "",AL);
		System.out.println(AL);
	}

	public static void gen(int op, int cl, String path,List<String>AL) {
		if (op == cl && op == 0) {
//			System.out.println(path);
			AL.add(path);
		}
		if (op > cl) {
			return;
		}
		if (op > 0) {
			gen(op - 1, cl, path + "(",AL);
		}
		if (cl > 0) {
//		if(cl>0 && cl>op) {
			gen(op, cl - 1, path + ")",AL);
		}
	}
}
