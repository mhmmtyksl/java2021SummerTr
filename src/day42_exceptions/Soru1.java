package day42_exceptions;

import java.util.Scanner;

public class Soru1 {
//	Kullanicidan carpma yapmak icin bir String 
//	isteyin. Kullanicinin girdigi String sadece 
//	sayilardan olusuyorsa sayiyi 2 ile carpip 
//	sonucu yazdirin.
//	Kullanici sayilardan olusmayan bir String 
//	girerse “Girdiginiz String sayiya cevrilemez”
//	yazdirin.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		String str = scan.nextLine();

		// NumberFormatException
		try {
			System.out.println(2 * Integer.parseInt(str));

		} catch (NumberFormatException e) {
			System.out.println("Girdiginiz String sayiya cevrilemez");
		}
		scan.close();
	}

}
