package day15_forLoops;

import java.util.Iterator;
import java.util.Scanner;

public class C09_ForLoops08 {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question
		// Kullanicidan 10’den kucuk 
		// bir sayi isteyin ve girilen sayinin faktoryel’ini bulun.
		// (5!=5*4*3*2*1)

		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen 10'den kucuk pozitif bir tam sayi giriniz : ");
		
		int sayi=scan.nextInt();
		
		int faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
		}
		
		
		
		
		System.out.println("Girdiginiz sayinin faktoriyeli :  "+ faktoriyel);
		
		
		// kullanici 5 girdiyse bu islemin sonucunda 
		// konsolda 5!=1*2*3*4*5 = 120 yazdiralim-
		scan.close();
	}

}
