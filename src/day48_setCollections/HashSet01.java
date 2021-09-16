package day48_setCollections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSet01 {
	
	public static void main(String[] args) {
	HashSet<String> hs1=new HashSet<>(Arrays.asList("Erdem", "Furkan", "Samet", "Hakan"));
	
	hs1.add("Halil");
	System.out.println(hs1);//[Samet, Halil, Hakan, Furkan, Erdem]// karisik olarak atar hizli olmaya calisir.
		
	HashSet<String> hs2=new HashSet<>(Arrays.asList("basarili", "azimli", "nasipli"));	
		
	hs1.addAll(hs2);// yine karisik olarak hizlica ekler
	System.out.println(hs1);//[Samet, Halil, azimli, basarili, Hakan, Furkan, nasipli, Erdem]
		
	hs1.remove("basarili");
	System.out.println(hs1);// [Samet, Halil, azimli, Hakan, Furkan, nasipli, Erdem]
		
	System.out.println(hs1.size());	// 7
		
	System.out.println(hs1.isEmpty());// false
	
	System.out.println(hs1.contains("Erdem"));// true
	}
}
