package Dount_class;

import java.util.Scanner;

public class basic_cal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			char ch = scn.next().charAt(0);
			if(ch=='+') {
				int a = scn.nextInt();
				int b = scn.nextInt();
				System.out.println(a+b);
				
			}else if(ch=='-') {
				
				int a = scn.nextInt();
				int b = scn.nextInt();
				System.out.println(a-b);
				
			}else if(ch=='*') {

				int a = scn.nextInt();
				int b = scn.nextInt();
				System.out.println(a*b);
				
			}else if(ch=='/') {

				int a = scn.nextInt();
				int b = scn.nextInt();
				System.out.println(a/b);
			}else if(ch=='%') {

				int a = scn.nextInt();
				int b = scn.nextInt();
				System.out.println(a%b);
			}else if(ch=='x'||ch=='X') {
				break;
			}else {
				System.out.println("Invalid operation. Try again.");
			}
		}
	}
}
