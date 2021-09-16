package day04_increment_matematiksel_islemler;

public class C2_PreIncrement_PostIncrement {

	public static void main(String[] args) {
		
		
		int sayi1=20;
		
		int sayi2=++sayi1; // bu pre increment + once ise pre olur. once artir sonra ata.
							//post ise once ata sonra artir.
		
		
		
		
		
		
		// burada iki islem var 1. islem sayi1 1 artiriliyor
						// 2. islem ise sayi2 olusturuluyor ve deger ataniyor.
						// bu iki islemden hangisinin once olacagini pre veya post incremente gore belirliyor.
		
		
		System.out.println("pre-increment sayi1 : " + sayi1); //21
		
		System.out.println("pre-increment sayi2 : " + sayi2); //21
		
		
		
		
		sayi2=sayi1++;
		
		
		
		System.out.println("post-increment sayi1 : " + sayi1); //22
		
		System.out.println("post-increment sayi2 : " + sayi2); //21
		
		
		int sayi3=10;								//	++sayi pre
													//	sayi++ post
		
		System.out.println("pre increment : " + ++sayi3); //11 burda pre -> once artir sonra yazdir yapiyor
		
		System.out.println("post increment : " + sayi3++); //11 burda post -> once yazdir sonra artir yapiyor sonrasinda 12 oluyor
		
		System.out.println("post incrementtan sonra sayi3 : " + sayi3); // 12 artirma yok ama akilda kalan son deger 12
		
		

	}

}
