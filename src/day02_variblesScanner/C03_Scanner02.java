package day02_variblesScanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
		
		// Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
		// Isim – soyisim : Muhammet Yüksel
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		String name= scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		
		String surname= scan.next();
		
		// Isim - soyisim : +Muhammet+ " " +Yüksel
		
		System.out.println("Isim - soyisim : " + name + " " +surname);
		
		scan.close();
	}

}
