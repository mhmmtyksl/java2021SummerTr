package day20_arrays;

import java.util.Arrays;

public class C04_Arrays04 {

	public static void main(String[] args) {
		
		String str= "Java, candir.";
		
		// split methodu bize bir array doner. donen array i ya direkt yazdirmaliyiz
		
		str.split(","); //bunun anlami , den bol demektir
				
		System.out.println(Arrays.toString(str.split(",")));
		
		// veya methodda donen String barindiran bir aray oldugundan
		// bir array olusturup ona assign edebiliriz.
		
		String bolunmusKelimeArray[]=str.split(",");
		System.out.println(bolunmusKelimeArray[1]); // ( )candir yazdirir basta bosluk var
														//bu parantez degil bosluk anlaminda
		String bolunmusKelimeArray2[]=str.split("a");// bunun anlami a dan bol demektir
		System.out.println(Arrays.toString(bolunmusKelimeArray2)); // [J, v, , c, ndir.] yazdirir
		System.out.println(bolunmusKelimeArray2.length); // 4 cikar 
		
		String bolunmusKelimeArray3[]=str.split("");
		System.out.println(Arrays.toString(bolunmusKelimeArray3)); // [J, a, v, a, ,,  , c, a, n, d, i, r, .] yazdririr
		
		
		String cumle="Java ogren, rahat yasa."; // cumle kac kelimeden olusur.
		String kelimeArrayi[]=cumle.split(" "); // cumleyi bosluklardan boler saydiririz
		System.out.println("Cumledeki kelime sayisi : " + kelimeArrayi.length); // 4 cikar
		
		// harf sayisini bulalim.
		String cumle2=cumle.replaceAll("\\W", ""); // harf disindakileri siler
		System.out.println(cumle2);
		System.out.println(cumle2.length()); // 18 cikar
		
		// array yontemiyle
		String harfArrayi[]=cumle2.split("");
		System.out.println(harfArrayi.length); // 18 cikar
		
		
		
		
		

	}

}
