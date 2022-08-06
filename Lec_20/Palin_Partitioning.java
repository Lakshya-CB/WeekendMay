package Lec_20;

public class Palin_Partitioning {
	public static void main(String[] args) {
		partition("aab","");
	}

	public static void partition(String table, String bag) {
		if(table.isEmpty()) {
			System.out.println(bag);
			
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = 	table.substring(0,chakku);
			if(isPalin(piece)) {
				String remain = table.substring(chakku);
	//			System.out.println(piece+" - "+remain);
				partition(remain, bag+"||"+piece);
			}
		}
	}

	private static boolean isPalin(String piece) {
		int s =0;int e = piece.length()-1;
		while(s<e) {
				if(piece.charAt(s)!=piece.charAt(e)) {
					return false;
				}
				s++;e--;
		}
		return true;
	}
	

}
