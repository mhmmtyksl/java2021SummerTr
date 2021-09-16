package day13_methodCreation;

import java.util.Scanner;

public class C2_MethodCreation02 {

	public static void main(String[] args) {
		
		// Kullanicidan iki tamsayi isteyin.
		// Bu sayilarin toplamlarini ve carpimlarini iki ayri mnethodda hesaplayip yazdirin.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki tamsayi giriniz : ");
		
		int sayi1=scan.nextInt();
		int sayi2= scan.nextInt();
		
		// 1- ben methoda ne gönderecegim ( sayi1 ve sayi2 gonderecegim)
		// 2- method ne yapacak (sayilari toplayip yazdiracak)
		// 3- method ne dondurecek. (birsey dondurmesine gerek yok)
		
		// method olusturmanin kolay yolu:
		// method ismini ve paramnetreleri yazin. (method call)
		
		toplama(sayi1, sayi2);
		
		carpma(sayi1, sayi2);
		carpma(sayi1+3, sayi2*2); // 3 ve 5 girilirse 6*10=60 yazdirir

		sayi1=20;
		sayi2=15;
		toplama(sayi1,sayi2); // 35 olur
		carpma(sayi1,sayi2); // 300 olur
	
		sayi2=40;
		toplama(sayi1, sayi2); //60 olur
	
	// sonuc olarak uygulamanizda tekrar tekrar kullanmaniz gereken not Bloklari icin
		// her seferinde yeniden yazmak yerine bu blogu bir method da yazip
		// ihtiyacimiz oldugunda onu cagirmak daha mantiklidir.
	scan.close();
	}

	
	// bir method sadece konsolda birseyler yazdiracaksa return type olarak void yazilir bu durumda 
	// return keyword una ihtiyac olmaz ve method bize bir sonuc dondurmez.
	
	
	public static void carpma(int sayi1, int sayi2) {
		System.out.println("Girilen sayilarin carpimi : " + sayi1*sayi2); // 3 ve 5 girilirse 15 yazdirir
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("Girilen sayilarin toplami : " + (sayi1+sayi2)); // 3 ve 5 girilirse 8 yazdirir.
		
		
		
		
		
		
	}

}
