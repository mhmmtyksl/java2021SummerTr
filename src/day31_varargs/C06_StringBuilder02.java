package day31_varargs;

public class C06_StringBuilder02 {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder(); // bos bir sb1 urettik.
		// eleman ekleme:
		
		sb1.append("Muhammet");
		System.out.println("sb1 ilk hali : " + sb1); // Muhammet
		
		sb1.append(" Yuksel"); // append methodu verilen stringi sb nin sonuna ekler
		System.out.println("sb1 Yuksel eklenmis hali : " + sb1); // Muhammet Yuksel burda eklenen elemanlar atama olmasa da kalici olur.
		
		System.out.println("sb1 uzunluk : " + sb1.length()); // 15 karakter sayisini verir
		
		System.out.println("sb1 kapasitesi : " + sb1.capacity()); // 16 kapasite ilk basta girilmezse eger 16 olarak kabul edilir
																	// eger daha fazla eleman girilirse otomatik artar.
																	// kapasite artmasi icap ettiginde (mevcut kapasite*2)+2 olarak artar
		System.out.println("sb1 son hali : " + sb1.append(" guzel insan"));// Muhammet Yuksel guzel insan
		System.out.println("sb1 son hali uzunlugu : " + sb1.length()); // 27 olur
		System.out.println("sb1 son hali kapasitesi : " + sb1.capacity()); // 34 olur 
		
		
		
		

	}

}
