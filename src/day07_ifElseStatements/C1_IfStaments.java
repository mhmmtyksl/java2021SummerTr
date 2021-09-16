package day07_ifElseStatements;

import java.util.Scanner;

public class C1_IfStaments {

	public static void main(String[] args) {
		
		/*
		Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
	  Ornek:  gun=Pazar output = “Hafta sonu”
	 gun=Sali output = “Hafta ici”
	 *** String icin equals method’unu kullanin
	*/	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen gun ismini giriniz");
		
		String gunIsmi= scan.next().toLowerCase();
		
		// bayrak kullanimi (flag)
		int flag=0;
		
		
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
				gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
				gunIsmi.equals("cuma")) {
			
			System.out.println("Girdiginiz gun haftaici");
			flag++;
			
		}
		
		if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
			System.out.println("Girdiginiz gun haftasonu");
			flag++;
			
		}
		
		// pazar yazdigimizda flag=1 olur   2. if baody si calisir
		//sali yazarsak flag=1 olacak		1. if baod si calisir
		// pezer yazarsak flag=0 oloacak yani flag hic calismayacak
		
		if (flag==0) {
			System.out.println("Lutfen gecerli bir gun ismi giriniz");
		}
		
		scan.close();
	}

}
