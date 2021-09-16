package day22_23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C04_List04 {

	public static void main(String[] args) {
		// verilen bir array de tekrar eden elementleri silip 
		// tekrarsiz yeni bir array haline getirin

		int arr[]= {2,3,5,7,3,5,2,6,3,1,4,2,3};
		
		
		List<Integer> sayilar = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!sayilar.contains(arr[i])) {
				
				sayilar.add(arr[i]);
				
				
			}
		}
		
		System.out.println(sayilar); // [2, 3, 5, 7, 6, 1, 4]
		Collections.sort(sayilar);
		System.out.println("List olarak tekrarsiz sayilar : " + sayilar); // [1, 2, 3, 4, 5, 6, 7] bu siralamak icin
		
		// yeni bir array olsturup bu elementleri yeni arraya eklemeliyiz
		// yeni array in length i 7 olacak
		
		int yeniArr[]=new int[sayilar.size()];
		
		for (int i = 0; i < yeniArr.length; i++) {
			yeniArr[i]=sayilar.get(i);
			
			
			
		}
		System.out.println("Tekrarsiz array : " + Arrays.toString(yeniArr));
		
		
	}

}
