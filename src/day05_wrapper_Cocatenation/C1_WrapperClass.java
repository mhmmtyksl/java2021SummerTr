package day05_wrapper_Cocatenation;

public class C1_WrapperClass {

	public static void main(String[] args) {

		String isim = "Muhammet";

		int sayi = 10;

		System.out.println(isim.charAt(2)); // h
		// isim. dedigimizde bircok metod listeleniyor
		// cunku isim variable nin data türü Srting ve string
		// non-Primetiv dir.
		// non-Primitive lerde degerin yaninda metodlar vardir.

		// sayi. sayi variableinin data türü int ve int primitive dir.
		// primitive data türleri sadece value ye sahiptirler metodlari yoktur.

		// *************
		// java primitive data turleri icinde metodlarin kullanilabilmesi icin
		// her primitive data turu icin bir Wrapper Class olusturmustur.
		// *********

		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE); // int in alabilecegi max deger 2147483647
		System.out.println(sayi2.MIN_VALUE); // int in alabilecegi min degeri verir.-2147483648

		// shortun min ve max degerlerini yazalim

		Short sayi3 = 0;

		System.out.println(sayi3.MAX_VALUE); // 32767
		System.out.println(Short.MIN_VALUE); // -32768

		// Wrapper Class kullanimina bir ornek

		String okulNo = "858";

		// eger string bir variable sadece sayilardan olusuyorsa bu stringi int a
		// cevirebiliriz

		int okulNoSayiOlarak = Integer.parseInt(okulNo);

		// System.out.println(okulNo++); okulNo string olarak tanimlandigi icin
		// matematiksel islem yapilamaz

		System.out.println(++okulNoSayiOlarak); // 859

		Character basHarf = 'a';
		System.out.println(basHarf.charValue()); // a

		System.out.println(Character.toUpperCase('a')); // A
	}

}
