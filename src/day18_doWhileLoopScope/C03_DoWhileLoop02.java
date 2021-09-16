package day18_doWhileLoopScope;

import java.util.Scanner;

public class C03_DoWhileLoop02 {

	public static void main(String[] args) {
		// Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin,
		// islemi bitirmek icin 0’a basmasini soyleyin.
		// Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve
		// girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		// kullanici negatif sayi girerse ignore edin gormezden gelin.
	
		double sayi=5;
		int count=0;
		double sayilarTop=0;
		
		Scanner scan=new Scanner(System.in);
		
	
		
		
		do {
			System.out.println("Lutfen toplamak uzere pozitif sayilar giriniz \nIslemi bitirmek icin 0'a basin.");
		sayi=scan.nextDouble();
		
		// kullanicidan aldigimiz sayilari pozitif mi diye kontrol edelim.
		
		if (sayi>0) {
			sayilarTop+=sayi;
			count++;
			
		} else if (sayi<0) {
			System.out.println("Pozitif sayi girmeliydiniz \nBu sayi negatif oldugu icin yok sayiyorum");
		}
		
		
		
		
		
		
		
		} while(sayi!=0.0);
		
		System.out.println("Girdiginiz sayilardan " + count + " tanesi pozitifti " 
							+ "\nve girilen pozitif sayilar toplami : " + sayilarTop);
	
	
	
	
	
	
	
		scan.close();
	
	
	
	}

}
