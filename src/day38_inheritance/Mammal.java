package day38_inheritance;

public class Mammal extends Animal {
	
	public void mA() { // parent ile ayni
		System.out.println("mammal");
	}
	public void mC() {
		System.out.println("cat"+"mammal");
	}
	public int c=7;
	public int m=4;// parent ile ayni ayni isim m
	
	public Mammal() {
		System.out.println("parametresiz mammal constructor");
	}
	public Mammal (char c) {
		super(34);// parentten parametreli constructor call ettik
		System.out.println("char parametreli mammal constructor");
	}
 }
