package day10_stringManipulations;

import java.util.Scanner;

public class C3_StringManipulation03 {

	public static void main(String[] args) {
		

		String str = "Java ogrenmek ne guzel";		//Java ogre n  m  e  k  "" n  e  "" g  u  z  e  l
												//	  123456789-10-11-12-13-14-15-16-17-18-19-20-21-22
		System.out.println(str.indexOf("e")); //8
		
		System.out.println(str.indexOf(' ')); //4
		
		System.out.println(str.indexOf("mek")); //10
		
		System.out.println(str.indexOf("")); // 0  java basta da bir hiclik kabul eder aslinda yok ama.
		
		System.out.println(str.indexOf("j")); // -1 verir cunku kucuk j yoktur. olmayanlara -1 verir.
		
		System.out.println(str.indexOf("J")); // 0 verir buyuk J.
		
		System.out.println(str.indexOf("e", 10)); // 11 eder. anlami 10. index ten sonraki e nin index i nedir?
		
		
		// kullanicidan bir String isteyin
		// girdigi String ""Java" iceriyorsa "Aferin." yazdirin
		// icermiyorsa "Daha cok calisman lazim." yardirin.
		// buyuk kucuk harf onemsiz olsun.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz :");
		
		String cumle=scan.nextLine();
		
		// cumle.indexOf("java") // cumlede java varsa index donecek yoksa -1 donecek
		
		
		// 1. yol
		if (cumle.indexOf("java") ==-1) { // -1 olmayan karakter varmi diye yaziyoz
			System.out.println("Daha cok calisman lazim.");
		} else {
			System.out.println("Aferin.");
		}
		
		// 2. yol
				if (cumle.indexOf("java") !=-1) { // -1 olmayan karakter varmi diye yaziyoz
					System.out.println("Aferin.");
				} else {
					System.out.println("Daha cok calisman lazim.");
				}
		
		
		// 3. yol
		
		System.out.println(cumle.indexOf("java") == -1 ? "Daha cok calisman lazim." : "Aferin.");
		
		
		
		
		
		
		
		
		
		
		scan.close();
		

	}

}
