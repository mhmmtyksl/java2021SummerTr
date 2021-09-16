package day17_NestedForLoopsWhileLoops;

import java.util.Scanner;

public class C06_WhileLoops04 {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin 
		// rakamlari toplamini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen pozitif bir tamsayi giriniz : ");
		
		int sayi=scan.nextInt();
		
		int i=sayi;
		int rakTop=0;
		int rakam=0;
		
		while (i>0) {
			rakam=i%10;
			rakTop+=rakam;
			i/=10;
			
		}
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakTop);
		scan.close();
	}

}
