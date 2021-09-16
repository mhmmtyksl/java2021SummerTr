package day08_ternaryOperator;

public class C3_Ternary {

	public static void main(String[] args) {
		int sayi = 75;
		String sonuc = sayi%2 == 0 ? "Sayi cift" : "Sayi tek"; 
		// sart boolean olmali.
		// burada sartin sonucu true ise sayi cift false ise sayi tek olacak.
		
		System.out.println(sayi>100 ? "Sayi 100'den buyuk " : 10);
		// direkt yazdirdigimiz zaman sonuclarin ikisi ayni cinsten olmak zorunda degil.
		
		
		// String sonuc1 = sayi>100 ? "Sayi 100'den buyuk " : 10 ;
		// farkli data turundeki sonuclar icin atama yapamayiz
		
		System.out.println(sonuc);
			
		
		
		int y = 1;
		int z = 1;
		int a = y<10 ? y++ : z++; 	// int a = y++;
									// a=1;
									// y=2;
									// z=1;
		
		System.err.println(y + "," + z + "," + a);
		
		
		
		
		
		
		
	}

}
