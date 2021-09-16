package day32_stringBuilder;

import java.time.LocalTime;

public class C02_StringBuilder02 {

	public static void main(String[] args) {
		// 1000 kere donecek bir loop yazalim
	    // loop'da String ve StringBuilder kullanip 
	    // oncesinde ve sonrasinda zaman alalim
	    // hizlarini karsilastiralim

		String str1="";
		StringBuilder sb1=new StringBuilder();
		LocalTime lt1=LocalTime.now();
		System.out.println("String icin for Loop oncesi zaman : " + lt1);
		
		for (int i = 0; i < 10000; i++) {
			str1+=i;
		} // System.out.print(str1);
		
		LocalTime lt2=LocalTime.now();
		System.out.println("String icin for Loop sonrasi zaman : " + lt2);
	
		LocalTime lt3=LocalTime.now();
		System.out.println("StringBuilder icin for Loop oncesi zaman : " + lt3);
	
		for (int i = 0; i < 10000; i++) {
			sb1.append(i);
		} // System.out.print(sb1);
		LocalTime lt4=LocalTime.now();
		System.out.println("StringBuilder icin for Loop sonrasi zaman : " + lt4);
	
	}

}
