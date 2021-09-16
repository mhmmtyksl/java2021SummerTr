package day49_setCollections;

import java.util.HashMap;
/*
1) Map'ler key-value yapisini kullanirlar.
                2) Key'ler tekrarli deger kabul etmez. (unique olmalidirlar/Kimlik numaralari gibi)
                3) Value'lar tekrarli olabilirler. (Isimler gibi)
                4) Uc farkli Map vardir:
                    a) HashMap      : En cok kullanilani, en hizlilari. Hizli olabilmek icin siralamayi rastgele yapar. 
                                              Hizli olabilmek icin synchronize olmazlar ve thread-safe degildirler.
                                              Bir tane key null olabilir, birden fazla value null olabilir.
                                              
                    b) HashTable    : 
                    c) TreeMap      :
 */
public class Map1 {
	public static void main(String[] args) {
        HashMap<Integer, String> mp1=new HashMap<>();
        mp1.put(101, "Levent");
        mp1.put(102, "Said ");
        mp1.put(103, "Hasan");
        mp1.put(104, "Canan");
        mp1.put(105, "Ayse");
        System.out.println(mp1); // {101=Levent, 102=Said , 103=Hasan, 104=Canan, 105=Ayse}
        mp1.put(101, "Harun");// key value si update edilir eski veri uzerine yeni girilen veri yazilir.
        System.out.println(mp1);// {101=Harun, 102=Said , 103=Hasan, 104=Canan, 105=Ayse}
        mp1.put(106, "Canan");// ayni value farkli key e atanabilir
        System.out.println(mp1); // {101=Harun, 102=Said , 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}
        mp1.put(null, "Haluk");// key degeri null olabilir.
        System.out.println(mp1);// {101=Harun, 102=Said , 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}
        mp1.put(null, "Hakan");
        System.out.println(mp1);// {null=Haluk, 101=Harun, 102=Said , 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}
        mp1.put(107, null); // Value degerleri coklu null olabilir
        mp1.put(108, null); // Value degerleri coklu null olabilir
        mp1.put(109, null); // Value degerleri coklu null olabilir
        System.out.println(mp1); // {null=Hakan, 101=Harun, 102=Said , 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null}
        System.out.println(mp1.get(103)); // Hasan
        System.out.println(mp1.values()); // [Hakan, Harun, Said , Hasan, Canan, Ayse, Canan, null, null, null] map teki tum elemanlarin valueler ini return eder
        System.out.println(mp1.keySet()); // [null, 101, 102, 103, 104, 105, 106, 107, 108, 109]
        System.out.println(mp1.getOrDefault(106, "Boyle bir eleman yoktur.")); // Canan
        System.out.println(mp1.getOrDefault(111, "Boyle bir eleman yoktur.")); // Boyle bir eleman yoktur.

        mp1.putIfAbsent(110, "ahmet");//--> belirtilen key'de value yoksa verilen value'i ekler...
        // yazdirilirse belirtilen key'de value olup olmadigini true/false return eder
        System.out.println(mp1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}
        mp1.putIfAbsent(105,"salih");//--> 105 Key'de Ayse value oldg icin salih put edilmedi
        System.out.println(mp1.putIfAbsent(105, "salih"));//105 key'deki value degeri Atse return edildi
        System.out.println(mp1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}

        mp1.putIfAbsent(null, "Ipek"); // null key de hakan value oldugu icin Ipek put edilmedi
        System.out.println(mp1); // {null=Ipek, 101=Harun, 102=Said , 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}
	
        mp1.putIfAbsent(107, "Oguz");// 107 key de value null oldugu icin Oguz put edildi
        System.out.println(mp1);// {null=Hakan, 101=Harun, 102=Said , 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=Oguz, 108=null, 109=null, 110=ahmet}
	
        
	
	
	
	
	
	
	
	
	}
}