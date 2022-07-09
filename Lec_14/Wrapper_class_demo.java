package Lec_14;

public class Wrapper_class_demo {
public static void main(String[] args) {
	int i = 10;
	Integer I = 99;
	I = i;// auto-boxing
	i=I;// unboxing
	I = null;
}
}
