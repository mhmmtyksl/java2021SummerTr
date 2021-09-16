package day14_methodCreationForloop;

import java.util.Scanner;

public class C03_MethodCreation03 {

	public static void main(String[] args) {
	/*
		Soru 3) Email kontrolu yapan bir program yazin.
		Kullanicinin girdigi sifre 
	 - @ isareti icermiyorsa gecersiz email yazdirin
	 - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
	 - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
	 - nu sorunlardan hicbiri yoksa gmail adresiniz basariyla kaydedildi yazdir.
	 */
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen email adresinizi giriniz:");
	
		String email=scan.next();
		
		emailKontrolEt(email);
		
		
		
		
		
		
		//method ne yapacak
		
		
		
	}

	public static void emailKontrolEt(String email) { 
		
		if (!email.contains("@")) { // unlem olmazsa iceriyorsa olur
			System.out.println("Gecersiz email.");
		} else if (!email.contains("gmail.com")) {
			System.out.println("Lutfen gmail adresi giriniz.");
		} else if (!email.endsWith("gmail.com")) {
			System.out.println("yazimda sorun var, lutfen kontrol ediniz.");
		} else {
			System.out.println("Mailiniz basariyla kaydedildi.");
		}
		
		
	}

}
