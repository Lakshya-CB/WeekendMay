package Dount_class;

public class Pat_09 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int cnt_sp = n - 1;
		int cnt_st = 1;
		while (row <= n) {
			int space = 0;
			while (space < cnt_sp) {
				System.out.print("  ");
				space++;
			}
			int star = 0;
			while (star < cnt_st) {
				if (star % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				star++;
			}
			cnt_st = cnt_st + 2;
			cnt_sp--;
			row++;
			System.out.println();
		}
	}
}
