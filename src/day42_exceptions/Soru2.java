package day42_exceptions;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
//		Soru: Kullanicidan yasini girmesini isteyin. 
//		Kodunuzu kullanici sifirdan kucuk bir sayi 
//		girerse Exception verecek sekilde yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen yasinizi giriniz : ");
		int age = scan.nextInt();
		
		//1. yol try-catch kullanmadan.
		/*
		if (age>=0) {
			System.out.println("Yasiniz : "+ age);
		} else {
			throw new IllegalArgumentException();
			// exceptions firlatip kod kirilir. 
			 *kirilmasini engellemek icin try-catch kullanilir
		}
		*/
		
		//2. yol try-catch kullanarak
		try {
			if (age>=0) {
				System.out.println("Yasiniz : "+ age);
			} else {
				throw new IllegalArgumentException();
			} // exceptions firlatip codu kiriraz cunku try body
			// devam eder catch calismaz
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");

		
		
		
		
		
		
		
		

	}

}
