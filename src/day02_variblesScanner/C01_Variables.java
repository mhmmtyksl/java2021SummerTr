package day02_variblesScanner;

public class C01_Variables {

	public static void main(String[] args) {
	
		
		String kelime = "Merhaba"; // satirdaki kod sonunda mutlaka ; kullanilmalidir
		
		System.out.println(kelime); // kelimenin variable oldugunu anlar ve variablenin degerini yazdirir
		
		System.out.println("kelime"); // kelime yazdirir.
		
		int sayi=1000;
		
		System.out.println(      sayi      );

		// yazdirirken basina aciklama eklemek istersem
		// girilen sayi : 20
		// eger degisken ve aciklamayi birlikte yazdirmak istersek
		// " aciklama " + variableismi
		
		
		System.out.println("girilen sayi : " + sayi);
		
		boolean tatildeMi = true ;
		System.out.println(tatildeMi);
	
		// konsolda bu sene tatile gittiniz mi ? = true
		
		// variable olmayan kisim : "bu sene tatile gittiniz mi ? = "
		// variableden gelen kisim : true
		
		
		System.out.println("bu sene tatile gittiniz mi ? " + tatildeMi);
		
		/*
		 2- isim ve soyisim icin iki variable olusturun ve bunlari
		 isminiz : Muhammet
		 soyisminiz : Yüksel
		 seklinde yazdirin
		 */
		
		
		String name="Muhammet";
		String surname="Yüksel";
		
		System.out.println("isminiz : " + name);
		System.out.println("soyisminiz : " + surname);
		
		// 3- Iki farkli tamsayi data türünde 2 variable olusturun bunlarin toplamini yazdirin
		
		int sayi1 = 10 ;
		byte sayi2 = 5;
		
		System.out.println(sayi1 + sayi2);
		
		
		// toplama isleminin basina aciklama yazmak istersek
		// iki sayinin toplami = 15
		
		System.out.println("iki sayinin toplami = " + (sayi1 + sayi2));
		
		// String ve sayisal islemleri birlikte yaptirdiginizda matematiksel islemi parantez icine alin
		
		int sayi3 = 15;
		double sayi4 = 3.14;
		
		System.out.println(sayi3 + sayi4);
		
		// toplam : 18.14
		
		System.out.println("toplam : " + (sayi3 + sayi4));
		
		// 5- char data türünde bir variable olusturun ve yazdirin
		
		char karakter = '?';
		
		System.out.println(karakter);
		System.out.println("Girilen karakter : " + karakter);
		
		// 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
		
		int sayi5 = 20;
		char harf = 'M';
		System.out.println(sayi5 + harf);
		
		// char data türündeki degiskenler matematiksel islemlerde kullanilirsa ASCII tablosu devreye girer.
		// Java o karakter yerine ASCII tablosundaki degeri kullanir
		
		
		
		
		
		
		
	}

}
