package day04_increment_matematiksel_islemler;

public class C4_Modulos {

	public static void main(String[] args) {
		
		// 5496 sayisinin rakamlar toplamini bulalim.
		
		int sayi=5496;
		int rakamlarToplami=0;
		
		// bir sayinin rakamlar toplamini bulmak icin her basamak degerinde 3 islem yapariz
		// bu satirda sayi=5496, rakamlar toplami=0
		
		
		
		
		// 1- sayi %10 ile son basamagi elde ederiz
		
		int rakam= sayi%10;
		
		// 2- bu rakami rakamlarToplamina ekleriz.
		
		rakamlarToplami += rakam;
		
		// 3- degerini aldigimiz son basamaktan kurtulmak icin sayiyi 10 a boleriz.
		
		sayi /=10;
		
		
		
		// bu satirda sayi=549, rakamlar toplami=6
		
		
		rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		// bu satirda sayi=54, rakamlar toplami=15(6+9)
		
		
		
		rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		// bu satirda sayi=5, rakamlar toplami=19(15+4)
		
		rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		
		// Kodumuzun sonunda rakamlar toplami 24(19+5), sayi 0 oldu.
		
		
		System.out.println("Rakamlar toplami : " + rakamlarToplami);
		
		System.out.println("Sayinin son degeri : " + sayi);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
