package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop01 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");

		// bu listedeki isimlerden uzunlugu dort harften fazla olan
		// isimleri yazdiralim
		// for each loop index veya size a bakmadan tek tek tum elementleri
		// bize getirir.

		for (String each : list1) { // String: gelen elementlerin data turu
									// list1: elementlerin neredn geldigi
									// each: isim
			if (each.length() > 4) {
				System.out.println(each + " ");
			}
		}

	}

}
