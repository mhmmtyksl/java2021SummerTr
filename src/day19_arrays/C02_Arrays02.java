package day19_arrays;

import java.util.Arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {
		
		
		// bir kez olusturdugumuz Array i sonradan uzunlugunu degistirebilir miyiz

		int arr[]= new int[5];
		
		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0] yazdirir
		
		// arr[5]=5; 
		
		// array in length i sonradan degistirilemez
		// array i kullanissiz yapan da bu ozelligidir.
		
		arr[2]=1;
		System.out.println(Arrays.toString(arr)); // [0, 0, 1, 0, 0] ikinci index i 1 yapar
		
		// burada print de olsa println de olsa array butun oldugu icin yanyana yazar
		
		arr= new int[6]; // burada ekleme degil yeni bir deger atamasi vardir.
		
		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0] yazar
		
		// Array in length i degistirilemez!!!!!
		
		
		
		
		
	}

}
