package day04_increment_matematiksel_islemler;

public class C3_PreDecrement_PostDecrement {

	public static void main(String[] args) {
		
		
		int sayi1=20;
		
		int sayi2=sayi1--; // post dec var once islem yap sonra azalt
		
		System.out.println("post decrement sayi1 : " + sayi1); //19
		
		System.out.println("post decrement sayi2 : " + sayi2); //20
		
		
		
		System.out.println(--sayi2); // 19 pre dec var once azalt sonra yazdir 
		
		System.out.println(sayi2--);// 19 post dec var once yazdir sonra azalt
		
		System.out.println(sayi2); // 18 sadece yazdir var akilda son kalan 18 oldugu icin.
		
		

	}

}
