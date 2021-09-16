package day42_exceptions;

public class Exceptions08 {

	public static void main(String[] args) {
		
		int sayi=34;
		String str="1453";
		//String str1=sayi; // CTE --> checked exception ClassCast
		
		int okulNo=Integer.parseInt(str);
		
		System.out.println("Okul No: "+okulNo);
		System.out.println(str+35);//145335 olur
		System.out.println(okulNo+35);//1488
		
		String str1="14a3";
		// int strSayi=Integer.parseInt(str1);// NumberFormatException unchecked
		
		// unchecked-->(r)unchecked
		
		Object sayi3=45;// object data type hz Aden tum class larin parenti.
		String strSayi2=(String)sayi3;// data type Class casting buyuk veri kucuk konteynira atandi.
								// ClassCastException unchecked verir.
	
	
	}

}
