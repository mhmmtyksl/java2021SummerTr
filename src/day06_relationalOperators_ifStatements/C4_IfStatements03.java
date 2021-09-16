package day06_relationalOperators_ifStatements;

import java.util.Scanner;

public class C4_IfStatements03 {

	public static void main(String[] args) {
		
		/*
		 * 
		Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin 
		 
	    Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             ilkHarf=S output = “Sali”
	    *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen istediginiz gun isminin ilk harfini giriniz");
		
		char harf=scan.next().toLowerCase().charAt(0); // tek karakteri char olarak da alabiliriz ancak
								// char primitivedir ve methodlari yoktur.
								
		
		if (harf== 'p' || harf== 'P') {
		System.out.println("pazartesi, persembe veya pazar");
		
		}
		
		if (harf== 's') {
			System.out.println("sali");
		}
		
		if (harf== 'c') {
			System.out.println("carsamba, cuma veya cumartesi");
		}


	
	// gecersiz karakter girilirse calisir ama birsey yazdirmaz.
	scan.close();
	
	}

}

