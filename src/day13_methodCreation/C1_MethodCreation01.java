package day13_methodCreation;

public class C1_MethodCreation01 {

	public static void main(String[] args) {
		
		// Bir methodu olusturmak o methodu calistirmak icin yeterli degildir.
		// Eger bir methodu calistirmak isterseniz method Call yani o methodu cagirmalisiniz.
		
		// Method Call yapmak icin method un adi ve varsa parametreleri yazilmalidir.
		// 
		toplama(20,40);
		
		// sadece Method Call yaptigimizda method calisir
		// eger method un icinde birsey yazdiriyorsakconsole da onu göruruz.
		
		// ancak method umuz return type e sahipse bize bir sonuc return edecektir
		// bu sonucu ya direkt yazdiririz
		
		System.out.println(toplama(15,20));
		
		
		
		
		
		
		
		// veya donem sonucu bir variable ya atayabiliriz.
		
		
		int sonuc = toplama(10,15);
		
		System.out.println(sonuc);
		
	}

	
	
	
	
	public static int toplama(int sayi1, int sayi2) {
		
		
		System.out.println("method calisti");
		
		
		
		return sayi1 + sayi2;
		
	}
}
