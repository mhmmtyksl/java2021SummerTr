package day25_constructor;

public class C03 {

	int sayi=10;
		String isim="Mehmet";
		// ayni package daki farkli classlardan bu variable lara ulasabiliriz
		// cunku acces modifier yazmazsak default acces modifier kullanilir.
		// access modifier defauilt ise ayni package dan her yerden kullanilabilir.
		
	
	public static void main(String[] args) {
		
		// sayi=20; sayi degiskeni static olmadigi icin main methoddan kullanamam
		// deneme(); methodu static olmadigi icin main methoddan cagiramam
		
		C03 obj1=new C03();
		obj1.deneme();
		
		// ayni class ta oldugumuz halde static olmadigi icin kullanamadigimiz
		// variable ve methodlari obje olusturarak kullanabiliriz
		
		
		
	}
	public void deneme() {
		System.out.println("Deneme methodu calisti.");
	}
}
