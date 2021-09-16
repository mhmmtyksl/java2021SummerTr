package day48_setCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet03 {

	public static void main(String[] args) {
		/*
		Soru: Elemanlari Alfabetik sirada dizen ve tekrarsiz
		bir collection elde etmek isterseniz ne kullanirsiniz
	 	Cevap: TreeSet
	 	
	 	Soru: Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin?
	 	Cevap: HashSet olustururum, elemanlari HashSet’e eklerim.
	 	Sonra HashSet’i TreeSet’e ceviririm boylece tekrarsiz ve 
	 	alfabetik sirada bir collection’a sahip olmus olurum.
		 */
		long start1=System.currentTimeMillis();
		TreeSet<String> ts1=new TreeSet<>(Arrays.asList("Reha", "Hakan", "Haluk", "Ipek", "Ahsen"));
		
		long stop1=System.currentTimeMillis();
		System.out.println("TreeSet hizi: "+(stop1-start1));
		
		long start=System.currentTimeMillis();
		HashSet<String> hs=new HashSet<>(Arrays.asList("Reha", "Hakan", "Haluk", "Ipek", "Ahsen"));
		System.out.println(hs);// [Ahsen, Reha, Hakan, Haluk, Ipek]
		
		TreeSet<String> ts=new TreeSet<>(hs);
		System.out.println(ts);// [Ahsen, Hakan, Haluk, Ipek, Reha]
		long stop=System.currentTimeMillis();
		System.out.println("HashSet hizi: "+ (stop-start));
		
		
	}

}
