package day39_overriding;

public class Dog extends Animal{

	@Override // Annotation(Dipnot) mutlaka child da yazilir
	// parent ve child methodlarinda iliski kurar.
	public void beslenme() {
		
		System.out.println("Kemik ile beslenir.");
	}

	@Override
	public void tatli() {
		System.out.println("Fistik sarma");
	}

	@Override
	public String icecek() {
		System.out.println("Tursu suyu");
		return "yarasin";
	}

	@Override
	public Integer topla() {
		return 41+54;
	}

	@Override
	public Dog fatih() {
		return new Dog();
	}

}
