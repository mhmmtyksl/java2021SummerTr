package day41_exceptions;

import java.util.Scanner;

public class Exceptions01 {
	public static void main(String[] args) {
		// kullanicidan alacaginiz iki  tamsayinin bolumunu yazdiriniz.
	
	Scanner scan=new Scanner(System.in);
	System.out.print("Bolunen sayiyi giriniz : ");
	int sayi1=scan.nextInt();
	
	System.out.print("Bolen sayiyi giriniz : ");
	int sayi2=scan.nextInt();
	// java exception i handle etmek icin try-catch blogu olusturmustur.
	try {
		System.out.println("Bolum : "+ sayi1/sayi2);
	} catch (ArithmeticException e) { // try body sinden muhtemel hata 
		// ArithmeticException olarak catch body a sart olarak yazildi. 
		System.out.println("Bolme isleminde bolen 0 olamaz");
		/*
		 * ArithmeticException class indan data type AritchmeticException olan bir 
		 */
	
	}
		
	
	
	
	
	
	}
	
}
