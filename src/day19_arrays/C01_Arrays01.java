package day19_arrays;

import java.util.Arrays;

public class C01_Arrays01 {

	public static void main(String[] args) {
		
		
		short arr1 []= new short[5];
		
		System.out.println(arr1); // arr1 array data turu non-primitive
								// short array in degil icine koyacagimiz degerlerin data turu
		// eger non-primitive bir data yi direkt syso ile yazdirmaya calisirsak
		// java arr1 in referans bilgisini yazdirir.
		
		
		
		// Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan 
		// bir array olusturun ve bu  array’i yazdirin.
		
		
		// 1. yontem once olusturup sonra tum indexlere deger atiyorum.
		String isimler [] = new String[4];
		
		isimler[0]="Ali";
		isimler[1]="Veli";
		isimler[2]="Ayse";
		isimler[3]="Fatma";
		
		// 2. yontem he3m olusturup hemde tum indexlere deger atiyorum.
		
		String isimler2[]= {"Ali", "Veli", "Ayse", "Hasan"};
		
		// isimler array indeki Veli yerine Hasan yazalim.
		
		isimler[1]="Hasan";
		// isimler[5]="Hakan"; // java burda 5. index varmi yok mu bilmiyor ama syntax acisindan
							// sorun olmadigi icin CTE vermiyor
							// ama run ettigimizde 5. index i bulamadigi icin RTE verir.
		
		System.out.println(isimler.length); // yazdirir. string length in sonunda () var ama 
											// array de () yok
		
		System.out.println(isimler[3]); // Fatma yazdirir.
		
		System.out.println(isimler2[1]); // Veli yazdirir.
		
		System.out.println(isimler[1]); // Hasan yazdirir
		
		// tum elemanlari yazdirma
		// 1. yol loop kullanma
		
		for (int i = 0; i < isimler2.length; i++) {
			System.out.print(isimler2[i] + " ");
		}
		System.out.println(); // bunun amaci bir alt satira inmesini saglamak
		// 2. yol Array class indan yardim aliriz.
		// eger direkt Array i yazdirmak istersen Array.toString() methodunu kullaniriz
		// ve parametre olarak Array in ismini yazmaliyiz.
		
		System.out.println(Arrays.toString(isimler));
		
	}

}
