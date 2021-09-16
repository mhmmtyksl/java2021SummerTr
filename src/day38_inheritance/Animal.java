package day38_inheritance;

public class Animal {

	public void mA() {
		System.out.println("animal");
	}
	public void mM() {
		System.out.println("animal"+" mammal");
	}
	public int a=7;
	public int m;
	
	public Animal() {
		System.out.println("parametresiz animal constructor");
	}
	public  Animal(int i) {
		System.out.println("parametreli animal constructor");
	}
}
