package day09_switchCase;

import java.util.Locale;

public class C4_StringManipulation01 {

	public static void main(String[] args) {
		
		String isim="Firat";
		String soyisim="Korkmaz";
		
		System.out.println(isim + " " + soyisim); // Firat Korkmaz
		
		System.out.println(isim.concat(soyisim)); // FiratKorkmaz
		
		System.out.println(isim.concat(" ").concat(soyisim)); //Firat Korkmaz
				
		
		
		
		System.out.println(isim.charAt(2)); // r olur

		System.out.println(isim.charAt(4)); // t olur
		
	// System.out.println(isim.charAt(5)); // hata verir. index=uzunluk-1
		// olmayan index yazilinca hata verir.									
	
		// olmayan index yazilirsa java error verir
        // burada syntax acisindan bir hata yok
// ancak Java calismaya basladiktan sonra isim variable'na degeri atiyor
// ve 5.index'in olmadigini ancak 17.satira gelince farkediyor
// Bu tur hatalari Java ancak Run ettigimizde farkettigi icin
// bunlara Run Time Error RTE denir

//int sayi= isim; // biz kodu yazar yazmaz Java Kodu compile (derleme) eder
// eger syntax hatasi varsa Java bunu hemen farkeder ve altini cizer
// ve alti cizili bolumu duzeltmeden kodu calistiramayiz
// compile time error denir CTE
		
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		
	}

}
