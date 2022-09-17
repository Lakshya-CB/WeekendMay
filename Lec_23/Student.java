package Lec_23;

public class Student {
	String Name;
	int Age;

	public void Intro() {
		System.out.println(this);
		System.out.println(this.Name + " " + this.Age);
	}
	public void Slap(String Name) {
		System.out.println(this.Name+" slaped "+Name);
	}
}
