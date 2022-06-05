package Lec_07;

public class Array_demo_2 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = arr1;
		
		arr2[0] =10;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		arr1 = null;
		System.out.println(arr1);
		arr2 = arr1;
		System.out.println(arr2);
		
		
	}
}
