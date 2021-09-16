package grup_Calismasi;

import java.util.Scanner;

public class SayilarArasiToplam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen aralarinda bulunan sayilari toplamak icin iki sayi giriniz.");
		int sayi1 = 0, sayi2 = 0;
		while (sayi1 == sayi2) {
			System.out.print("Lutfen 1. sayiyi giriniz : ");
			sayi1 = scan.nextInt();
			System.out.print("Lutfen 2. sayiyi giriniz : ");
			sayi2 = scan.nextInt();
		}
		int toplam = 0;
		if (sayi1 < sayi2) {
			for (int i = sayi1; i <= sayi2; i++) {
				toplam += i;
			}
			System.out.println("Girilen sayilar arasındaki toplam : " + toplam);

		} else if (sayi1 > sayi2) {
			for (int i = sayi2; i <= sayi1; i++) {
				toplam += i;
			}
			System.out.println("Girilen sayilar arasındaki toplam : " + toplam);
		} else {
			System.out.println("lutfen iki farkli sayi giriniz");
		}
	}

}
