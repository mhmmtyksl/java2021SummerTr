package day18_doWhileLoopScope;

import java.util.Scanner;

public class C01_WhileLoop01 {

	public static void main(String[] args) {
		// kullanicidan iki pozitif sayi isteyin
		// kullanici negatif sayi girdiginde
		// girilken negatif sayilari yok sayip yeniden tekrar isteyin
		// kullanici dogru giris yaptiginda "well done" ve sayilarin carpimini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki pozitif tamsayi giriniz : ");
		
		int sayi1=0;
		int sayi2=0;
		
		while (sayi1<=0 || sayi2<=0) { // istemedigimiz durumu yazmaliyiz tekrar etmesi icin
										// bu sekilde veya !(sayi1<=0 || sayi2<=0) diye yazilir
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			 if (sayi1>0 && sayi2>0) {
				 System.out.println("well done \nGirilen sayilarin carpimi :  " + (sayi1*sayi2));
		} else {
			System.out.println("Lutfen pozitif iki sayi giriniz : ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
			
		}
		
		
		
		scan.close();
		
	}

}
