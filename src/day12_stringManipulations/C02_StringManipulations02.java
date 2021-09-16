package day12_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulations02 {

	public static void main(String[] args) {
	/*
		Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
	 isim-soyisim : M***** B*******
	 kart no : **** **** **** 1234
	 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz : ");
		
		String isim=scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz : ");
		
		String soyisim=scan.nextLine();
		
		System.out.println("Lutfen kredi kart numaranizi giriniz : ");
		
		String kkNo=scan.nextLine();
		
		String isimDuzenlenmis = isim.substring(0,1).toUpperCase() + // bura ilk harfi buyuk olarak verir.
								isim.substring(1).replaceAll("\\w", "*" ) ; // ilk harften sonraki hepsini * yapar
		
		String soyisimDuzenlenmis = soyisim.substring(0,1).toUpperCase() + // bura ilk harfi buyuk olarak verir.
				soyisim.substring(1).replaceAll("\\S", "*" ) ;
		
		String kkNoDuzenlenmis = "**** **** **** " + kkNo.substring(15) ;
		
		System.out.println("isim-soyisim : " + isimDuzenlenmis + " " + soyisimDuzenlenmis
						+ "\nkart no : " + kkNoDuzenlenmis);
						
		
		scan.close();
		
	}

}
