package day04_increment_matematiksel_islemler;

public class C1_IncrementDecrement {

	public static void main(String[] args) {
		
		int sayi1=10;
		
		int sayi2=20;
		
		sayi1-=5;  // 5
		
		sayi2+=10;  // 30
		
		System.out.println(sayi2 / sayi1);  // 6
		
		
		sayi1*=2; //10
		
		sayi2++;  //31
		
		System.out.println(sayi2 / sayi1);  //3
		
		
		// yazdirma islemioni dikkate almaz
		// diger tüm islemleri bastan yapar
		
		
		
		sayi1 /=2;
		
		double sayi3 = sayi2/10;  // sayi2 int oldugundan sayi2/10 isleminin sonucunu java 3 olarak bulur.
								//ama atama islemi yapilirken sayi3 douvble oldugu icin bolme isleminin sonucu lan 3 u
								// casting ile 3.0 a cevirir.
		
		
		System.out.println(sayi3);  //3.0 burda int i double a cevirir.
		
		System.out.println(sayi1 * sayi2); //155
		
		System.out.println(sayi1 * sayi3); //15.0
		
		
		sayi3= (double)sayi2/10; // manuel mudahele oldugu icin parantez icinde yazilir. burda once double olur sonra boleriz
								// 31.0/10 olur
		
		
		System.out.println(sayi3);  //3.1
		
		System.out.println(sayi2); //31
		
		System.out.println((double)sayi2); // 31.0 burda sadece gecici olark sayi2 ye double degeri alinir sayi2 nin degeri
											// hala 31 dir gecici olarak 31.0 yazilir
		
		System.out.println(sayi2); //31
		
		
		
		sayi2+=0.2; // sayi2 int, 
		
		System.out.println(sayi2);  //31 sayi int oldugu icin deger her ne kadar 31.2 olsada 31 yani int yazdirir.
		
		
		
		
		

	}

}
