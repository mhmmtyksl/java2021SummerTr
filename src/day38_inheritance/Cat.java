package day38_inheritance;

public class Cat extends Mammal{

	public void mC() {
		System.out.println("cat");
	}
	int c=9;
	int d=5;
	
	public Cat() {
		System.out.println("parametresiz cat constructor");
	}
	public Cat (String str) {
		this();
		System.out.println(super.c);
		System.out.println("string parametreli cat constructor");
	}
}
