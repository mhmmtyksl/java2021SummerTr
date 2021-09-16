package day11_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulationsContains {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com iceriyorsa   “Email adresiniz kaydedildi”, 
		// icermiyorsa “Lutfen gmail mail adresinizi giriniz.. “ yazdirin

	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Mail adresinizi giriniz : ");
		
		String mail=scan.next();
		
		
		
		if (mail.contains("@gmail.com")) {
			System.out.println("E Mail adresi kaydedildi.");
		} else {
			System.out.println("Lutfen gmail mail adresinizi giriniz.");
		}
		
		
		scan.close();
		
	
	
	
	
	
	
	
	
	
	}

}
