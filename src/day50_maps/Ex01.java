package day50_maps;

import java.util.HashMap;

public class Ex01 {

	public static void main(String[] args) {
//		Ad ve soyad bulunduruan iki ayrı array'i bir map' 
//		ekleyip yazdırınız.
//		input : {"ahmet", "ahmet can", "haluk"};  
//		{"şeref", "erdem", "bilgin"};
		
		String ad[]= {"ahmet", "ahmet can", "haluk"};
		String soyad[]= {"seref", "erdem", "bilgin"};
		
		HashMap<String, String> adSoyad=new HashMap<>();
		for (int i = 0; i < ad.length; i++) {
			adSoyad.put(ad[i], soyad[i]);
		}
		
		
		System.out.println("ad soyad : "+ adSoyad);
		// ad soyad : {ahmet=seref, ahmet can=erdem, haluk=bilgin}
		

	}

}
