package grup_Calismasi;

import java.util.Scanner;

public class Gun01_03 {

	public static void main(String[] args) {
		/*
		Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl
		 ve gün sayısına dönüştürmek için bir Java programı yazın.

		INPUT:

		Dakika sayısı: 3456789

		OUTPUT :

		3456789 dakika yaklaşık 6 yıl 210 gündür
		
		*/
		
		Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen dakika giriniz :");
        double dakika=scan.nextDouble();
        
		double gun=dakika/24/60;
		int yil=(int)gun/365;
		
		int kalyil=(int)gun%365;
		System.out.println(dakika + " dakika yaklasik " + yil + " yil " + kalyil + " gundur");
		
		
		
		

	}

}
