package day39_overriding;

public class Animal {

	public void beslenme() {
		System.out.println("Tum hayvanlar beslenir.");
} 
	public void tatli() {
		System.out.println("Trilece");
	}
	
	public String icecek() {
		System.out.println("Gazoz");
		return "Guzel";
	}
	
	public Integer topla() {
		return 34+6;
	}
	
	public Animal fatih() {
		return new Animal();
	}
}
