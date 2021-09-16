package day22_23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_List01 {

	public static void main(String[] args) {
		List <String> isimler=new ArrayList<>();
		// add() listenin sonuna ejkleme yapar.
		
		isimler.add("Ali");
		System.out.println(isimler); // [Ali]
		isimler.add("Veli");
		isimler.add("Ayse");
		isimler.add("Fatma");
		isimler.add("Ali");
	
		System.out.println(isimler); // [Ali, Veli, Ayse, Fatma, Ali]
		
		// ozel bir index e eklemek istersek o zaman index li add mthodu klniriz
		
		isimler.add(3, "Nihan");
		System.out.println(isimler); // [Ali, Veli, Ayse, Nihan, Fatma, Ali]
		
		isimler.add(0, "Mehmet");
		System.out.println(isimler); // [Mehmet, Ali, Veli, Ayse, Nihan, Fatma, Ali]
		
		List<String> yeniList=new ArrayList<>();
		
		yeniList.add("Firat");
		System.out.println(yeniList); // Firat
		
		// yeni List in sonuna isimler listesi eklemek istersek
		
		yeniList.addAll(isimler);
		System.out.println(yeniList); // [Firat, Mehmet, Ali, Veli, Ayse, Nihan, Fatma, Ali]
		
		//bir de int elementlerin oldugu liste olusturalim
		
		List<Integer> sayilar= new ArrayList<>(); // int primitive, Integer wrapperclass, non-primitive
		
		// yeniList e sayilar List i ekleyebilir miyiz.
		
		// yeniList.addAll(sayilar); // farkli birdataturunde liste veya elemet ekleyemeyiz.
		
		// yeniList.add(5); bunu da ekleyemeyiz		
		
		
		
		
	}

}
