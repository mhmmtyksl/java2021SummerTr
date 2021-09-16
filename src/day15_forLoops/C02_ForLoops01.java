package day15_forLoops;

public class C02_ForLoops01 {

	public static void main(String[] args) {
		// 10 dan 20 ye kadar olan sayilari yazdiran bir loop olusturalim.
		
		for ( int i=10 ; i<=20  ; i++  ) {
			System.out.print(i + " ");
		}

		// 100 ile 200 dahil aralarindaki 10 ile bolunebilen sayilari yazdirin
		
		System.out.println(); // bunu yazmamizin sebebi konsolda alt satira insin diye
		
		
		for (int i = 100; i <=200 ; i+=10) {
			System.out.print(i + " ");
		}
	
		// 50 den 10 ye kadar (10 ve 50 dahil) 3 er 3 er geri sayarak yazalim.
		System.out.println();
		
		
		for (int i = 50; i >=10 ; i-=3) {  // burda i=i-3 yazilabilir ama profesyonel degil
			System.out.print(i + " ");
		}
	
		System.out.println();
		
		// 50 ile 100 arsinda 3 ile bolunebilen sayilari yazdirin
	
		for (int i = 50; i <= 100 ; i++) {
			if (i%3==0) { // 3 ile tam bolunuyorsa
				System.out.print(i + " ");
			}
		}
		// eger degiskenimiz verilen artis veya azalisla bitis kosuluna ulasamiyorsa
		// sonsuz loop olusur ve sistem cokene kadar loop calismaya devam eder
		// bu yuzden bunu yorum haline getirdik
		// for (int i = 10; i < 20 ; i--) {
		//	System.out.println(i + " ");
		
		System.out.println();
		
		
		// eger baslangic degeri kosulu saglamiyorsa loop body hic calismadan 
		// loop un sonuna gider. yani loop islevsiz olur. olu loop olur
		for (int i = 10; i < 0 ; i++) { // bu bir sey yazdirmaz
			System.out.println(i + " "); // burda hic calisma kosulu gerceklesmiyor 
		}
	
		System.out.println("son loop un sonrasi");
	}

}
