package day11_stringManipulations;

public class C04_StringManipulations04 {

	public static void main(String[] args) {
		
		String kkNo = "1234 5678 9854 1452";
		System.out.println(kkNo.replace(" ", ""));;
		
		System.out.println(kkNo); // burda tekrar bosluklu yazar sadece yukarda kaldirir bosluklari
								  // replace methodu sadece o satirda degisiklik yapar sonraki yazdirmalar yine ilk haline gore calisir.
		
		// replaceAll()
		
		System.out.println(kkNo.replaceAll("\\s", "")); // bosluklari hiclikle degistir demek
														// s sadece spaceleri bosluk yapar
		System.out.println(kkNo.replaceAll("\\S", "")); // bosluk disindakileri bosluk yapar. bosluklarda zaten gorunmedigi icin tamami bosluk olur.
		
		System.out.println(kkNo.replaceAll("\\s", "*")); // s sadece spaceleri * yapar
		
		
		System.out.println(kkNo.replaceAll("\\S", "*")); // S(buyuk S) space olmayan herseyi * yapar
		
		
		System.out.println(kkNo.replaceAll("\\w", "-")); // harf ve rakamlari - yapar
		
		System.out.println(kkNo.replaceAll("\\W", "#")); // harf ve rakamlarin disindaki hersey # olur
		
		System.out.println(kkNo.replaceAll("\\d", "0")); // digit rakamlari 0 yapar
		
		System.out.println(kkNo.replaceAll("\\D", "a")); // digit rakamlarin disindaki hersey a olur
		
		// syso icinde yapilan manipulation lar asil String i degistirmez.
		System.out.println(kkNo);
		
		kkNo = "1234 5678 9854 1452"; // atama yapinca kalici olarak degistirmis oluruz
		System.out.println();

	}

}
