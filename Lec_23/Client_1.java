package Lec_23;

public class Client_1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		System.out.println(s1.Age);
		System.out.println(s1.Name);
		
		Student s2 = s1;
		s1.Name = "apna baccha";
		s1.Age = 101;
		
		
		System.out.println(s2.Name);
		
	}
}
