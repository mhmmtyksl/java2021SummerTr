package day17_NestedForLoopsWhileLoops;

import java.util.Scanner;

public class C07_WhileLoops05 {

	public static void main(String[] args) {
		// Kullanicidan toplamak uzere sayi isteyin.
		// Toplam 200 oluncaya kadar sayi istemeye devam edin.
		// toplam 200 u gectiginde kullanicinin kac sayi girdigini
		// ve bu sayilarin toplaminin kac oldugunu yazdirin.
		
		
		
		// For Loop ta bir islem yapabilmak icin islem sayisini bilmek lazim
		// While Loop ta ise adim sayisi degil bitirme kosulu onemlidir.
		
		Scanner scan=new Scanner(System.in);
		
		int sayi=0;
		int toplam=0;
		int sayac=0;
		 while (toplam<200) {
			 System.out.print("Lutfen toplamak icin bir tamsayi giriniz : ");
			 sayi=scan.nextInt();
			 
			 toplam+=sayi;
			 sayac++;
		}		
		
		// toplamin 200 u gectiginden eminiz
		 
		 System.out.println("Toplam " + sayac + " sayi girdiniz " 
				 	+ " girdiginiz bu sayilarin toplami " + toplam);
		
		// eger adim sayisi bilinmiyor veya ongorulmuyorsa
		 // for Loop degil de While Loop kullanmak daha mantiklidir.
		 // eger adimlar belli ise for Loop kullanmak daha mantiklidir.
		 // iki fazla satir yazmaktan veya degisimi unutup
		 // sonsuz Loop a girmekten kurtulmus oluruz
		 scan.close();
	}

}
