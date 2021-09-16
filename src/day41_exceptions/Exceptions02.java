package day41_exceptions;

import java.util.Scanner;

public class Exceptions02 {
// kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 1;
		while (count <= 2) {
			System.out.print("Bolunen sayiyi giriniz : ");
			int sayi1 = scan.nextInt();

			System.out.print("Bolen sayiyi giriniz : ");
			int sayi2 = scan.nextInt();
			try {
				System.out.println("Bolum : " + sayi1 / sayi2);
			} catch (ArithmeticException e) { // try body sinden muhtemel hata
				// ArithmeticException olarak catch body a sart olarak yazildi.
				// AritmticException javada bir class ve e objesi icin data turu
				// e ise AritmticException classindan olusturdugumz objenin adi.
				// o zaman ismi e olmak zorunda degil genelde e kullanilir
				System.out.println("Bolme isleminde bolen 0 olamaz");

				System.out.println(e.getMessage());// by zero -->handle edilecek veridir
				e.printStackTrace();// java.lang.ArithmeticException: / by zero
									// bolunen sayiyi giriniz : at
									// _14_Exceptions.Exceptions02.main(Exceptions02.java:19)
									// hatanin handle edilmesi icin tum verileri yazdirildi

			}
			count++;
		}
		System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");
	}
}
