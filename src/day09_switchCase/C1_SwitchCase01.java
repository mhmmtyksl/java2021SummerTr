package day09_switchCase;

import java.util.Scanner;

public class C1_SwitchCase01 {

	public static void main(String[] args) {
		// kullanicidan haftanin kacinci gunu oldugunu isteyin
		// ve gun adini yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen haftanin kacinci gununde oldugunuzu giriniz : ");

		int gunNo = scan.nextInt();

		switch (gunNo) {
		case 1:
			System.out.println("Bugun Pazartesi");
			break; // break olmazsa devamindaki hepsini yazdirir.
		case 2:
			System.out.println("Bugun Sali");
			break;
		case 3:
			System.out.println("Bugun Carsamba");
			break;
		case 4:
			System.out.println("Bugun Persembe");
			break;
		case 5:
			System.out.println("Bugun Cuma");
			break;
		case 6:
			System.out.println("Bugun Cumartesi");
			break;
		case 7:
			System.out.println("Bugun Pazar");
			break;
		default:
			System.out.println("Lutfen gecerli gun numarasi giriniz.");

		}
scan.close();
	}

}
