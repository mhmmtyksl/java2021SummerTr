package day32_stringBuilder;

public class C01_StringBuilder01 {

	public static void main(String[] args) {
		
		// Muhammet Y u  k  s  e  l     g  u  z  e  l     i  n  s  a  n 
		// 0123456789 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Muhammet Yuksel guzel insan");
		System.out.println(sb1.capacity()); //34
		
		// fazladan ayrilan kapasiteyi silme. sonrasinda length ile capasity ayni olur.
		// obj.trimToSize();
		sb1.trimToSize(); // burada fazlalik 7 kapasite silinir
		System.out.println(sb1.capacity()); //27 olur fazladan kullanilmayan kapasiteyi siler.
		
		// istenen charaktein index ini alma
		// obj.indexOf();
		System.out.println(sb1.indexOf("a")); //3 ilk a nin index i
		System.out.println(sb1.lastIndexOf("a")); // 25 son a nin index i
		System.out.println(sb1.indexOf("sel"));// sel in index ini verir
		System.out.println(sb1.indexOf("e", 9));//13 olur 9. index ten sonraki e nin index i ni verir
		// istenen bir charakteri index ine gore alma
		// obj.charAt();
		System.out.println(sb1.charAt(7)); // t olur
		
		// belirli bir araliktaki charakterleri almak icin
		// obj.subSequence(); kalici degildir ama sadece bilgi verir
		System.out.println(sb1.subSequence(3, 10)); // ammet Y olur
		System.out.println(sb1.toString().substring(5)); // met Yuksel guzel insan
		System.out.println(sb1.subSequence(4, sb1.length())); // mmet Yuksel guzel insan
		
		// belli bir index teki karakteri silme
		// obj.delete(); kalici olur
		System.out.println(sb1.delete(3, 10)); // Muhuksel guzel insan
		System.out.println(sb1.deleteCharAt(4)); // Muhusel guzel insan
		
		// istenen index e istenen karakteri veya karakterleri eklemek icin
		// obj.insert(index,char);
		System.out.println(sb1.insert(3, "ammet")); // Muhammetusel guzel insan
		System.out.println(sb1.insert(8, " ")); // Muhammet usel guzel insan
		System.out.println(sb1.insert(9, "Y")); // Muhammet Yusel guzel insan
		System.out.println(sb1.insert(11, "k")); // Muhammet Yuksel guzel insan
		
		// istenen index deki charakterin yerine birden fazla charakter eklemek
		// obj.replace(a,b,"charakterler");
		// atanacak karakterler az indexler daha fazla ise fazla indexler otomatik silinir.
		System.out.println(sb1.replace(2, 8, "rat")); // Murat Yuksel guzel insan
		
		// 5: sb1 e basarili kelimesi ekleme baslangic index i
		// basarili: eklenecek string
		// 2:eklenecek stringin baslangic index i 2 dahil
		// 4: eklenecek stringin bitis index i 4 dahil degil
		System.out.println(sb1.insert(5, "basarili", 2, 4)); // Muratsa Yuksel guzel insan
		
		// elemanlari ters cevirmek icin 
		// obj.reverse(); kalici olur
		System.out.println(sb1.reverse()); // nasni lezug leskuY astaruM
		sb1.reverse();// tekrar geri cevirir atama olmasa da kalici olur.
		
		
		// elemanlarin ayni olup omadigina bakmak icin
		// obj.equals(); var ama bunun icin ayni olsa dahi sb oldugu icin falkse verir
		// once stringe cevirip sonra bakabiliriz.
		StringBuilder sb3=new StringBuilder("Java cok guzel");
		StringBuilder sb4=new StringBuilder("Java cok guzel");
		
		System.out.println(sb3.equals(sb4));// false olur 
		System.out.println(sb3.toString().equals(sb4.toString())); // true olur
		System.out.println(sb3.equals(sb4)); // tekrar false olur cunku string methodu kalici olmaz
		// sb yi stringe cevirdikten sonra tum string methodlari kullanilabilir . yapinca cikar hepsi.
		
		// sb3 ile sb4 karakterler ayni mi onu kontrol eder.
		// sonuc 0 ise ayni demektir farkli ise eger farkli olan iki karakter arasindaki
		// ASCII degerini verir
		System.out.println(sb3.compareTo(sb4)); // 0 olur
	
	
	
	
	
	
	}

}
