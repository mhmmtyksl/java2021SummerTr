package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_List01 {

	public static void main(String[] args) {
		/*
		 * 1)Kullanicidan isimler isteyin ve bunlari bir list’te depolayin. Kullanici
		 * yeter yazana kadar isim istemeye devam edin. Kullanici isim girmeyi
		 * bitirdiginde toplam kac isim girdigini ve bunlardan kac tanesinin asagidaki
		 * listede olan isimlerden oldugunu yazdirin isimList=Ali , Veli, Ayse, Fatma,
		 * Zeki, Kemal Not : yeter icin kucuk buyuk harf onemli degil icimler icin
		 * onemli
		 */
		Scanner scan = new Scanner(System.in);
		List<String> girilenIsimler = new ArrayList<>();
		String isim;

		do {
			System.out.println("Lutfen listeye eklemek icin isim giriniz \nBitirmek icin yeter yaziniz");
			isim = scan.nextLine();
			if (!isim.equalsIgnoreCase("yeter")) {
				girilenIsimler.add(isim);
			}

		} while (!isim.equalsIgnoreCase("yeter"));

		// karsilastirmak istedigimiz listeyi olusturalim
		// listenin uzunlugu degismeyecegi icin array olusturup
		// list e cevirebiliriz boylece 6 ismi tek tek eklemek zorunda kalmayiz

		String isimler[] = { "Ali", "Veli", "Ayse", "Fatma", "Zeki", "Kemal" };
		List<String> isimList = Arrays.asList(isimler);
		// elimizde iki tane liste var
		// 1- kullanicidan aldiugimiz isimlerin oldugu girilenIsimler
		// 2- karsilaystiracagimiz liste isimList
		int count = 0;
		System.out.println("Toplam : " + girilenIsimler.size() + " isim girdiniz.");

		for (int i = 0; i < girilenIsimler.size(); i++) {
			if (isimList.contains(girilenIsimler.get(i))) {
				count++; // eger cagrilan isim isimList de varsa count artar

			}
		}

		System.out.println("Girdiginiz isimlerden " + count + " tanesi bendeki listede var.");

	}

}
