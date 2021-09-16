package day34_encapsulation;

public class C03_ArabaMain {
	// Bu class i C04 te yazan 4. adim icin olusturduk

	public static void main(String[] args) {
		// 5. adim olarak bunlari yaptik
		C04_Araba volvo = new C04_Araba("XC90", "Beyaz", -2400, -2020);
		C04_Araba audi = new C04_Araba("Q7", "Bej", 3000, 2021);
		C04_Araba honda = new C04_Araba();// default parametresiz constructor varken
		// parametreli constructur urettigimiz icin

		honda.model = "Accord";
		honda.renk = "Gri";
		honda.setYil(1999);
		honda.setMotor(1400);

		System.out.println("Honda Yil : " + honda.getYil()); // 1999
		System.out.println("Honda Motor : " + honda.getMotor()); // 1400

		System.out.println("Volvo Motor : " + volvo.getMotor()); // 2400

		System.out.println("Audi yil : " + audi.getYil()); // 2021

	}

}
