package day34_encapsulation;

public class C02_InsanMain {
	public static void main(String[] args) {

		C01_AdemOglu insan1 = new C01_AdemOglu();

		// insan1.age=-47; basta C01 de age i private yaptik sonra orda method
		// olustureduk

		insan1.name = "onur";
		insan1.surName = "enes";
		insan1.yasAta(-47);
		System.out.println(insan1.name);// onur
		System.out.println(insan1.surName);// enes
		System.out.println(insan1.yasGoster());// 47

	}
}