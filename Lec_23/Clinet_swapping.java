package Lec_23;

public class Clinet_swapping {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Age = 10;
		s1.Name = "A";

		Student s2 = new Student();
		s2.Age = 20;
		s2.Name = "B";

		System.out.println(s1.Name + " " + s1.Age);
		System.out.println(s2.Name + " " + s2.Age);
//		Test2(s1, s2);
		String myName = "HI";int myAge = 100;
		Test3(s1, s1.Name, s2.Age, myAge, myName);
		System.out.println(s1.Name + " " + s1.Age);
		System.out.println(s2.Name + " " + s2.Age);
	}
	public static void Test3(Student s1, String Name, 
			int Age, int myAge, String myName) {
        s1.Name = "";
        s1.Age = 0;

        Name = "";
        Age = 0;

        myName = "";
        myAge = 0;
    }

	public static void Test2(Student s1, Student s2) {
		s1 = new Student();
		String temp_s = s1.Name;
		s1.Name = s2.Name;
		s2.Name = temp_s;

		int temp_i = s1.Age;
		s1.Age = s2.Age;
		s2.Age = temp_i;
	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}

}
