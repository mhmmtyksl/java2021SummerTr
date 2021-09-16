package day11_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulations01 {

	public static void main(String[] args) {
		
		/*
		Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanilip
		 kullanilmadigini yazdirin.
		*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz : ");
		
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen bir kelime giriniz : ");
		
		String kelime=scan.next();
		
		// indexOf() kullanalim
		
		if (cumle.indexOf(kelime) !=-1)  {
			System.out.println("Kelime cumlede kullanilmis.");
		} else {
			System.out.println("Kelime cumlede kullanilmamistir.");
		}
		
		// contains() kullanalim
		
		if (cumle.contains(kelime)) { // anlami cumlede kelime varmi? true yada false olur cevabi.
			System.out.println("Kelime cumlede kullanilmis.");
		} else {
			System.out.println("Kelime cumlede kullanilmamistir.");
		}
		
		
		scan.close();
		
	}

}
