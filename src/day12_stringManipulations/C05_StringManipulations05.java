package day12_stringManipulations;

public class C05_StringManipulations05 {

	public static void main(String[] args) {
		
		/*
		 * Soru 2) String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
 String str1 = “$13.99”
 String str2 = “$10.55”
 ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
		 */
		
		
		String str1 = "$13.99" ;
		
		String str2 = "$10.55" ;
		
		str1 = str1.replace("$","") ; // oncelikle $ isaretinden kurtulmamiz lazim islem yapabilmek icin
		str2 = str2.replace("$","") ;
		
		System.out.println(str1+str2); // burda sayilari yani paralari topluyuruz. ama burda String olarak toplar
										// yani yanyana yazar ama bize lazim olan double olarak toplamlari.
		
		
		Double sayi1 = Double.parseDouble(str1) ; // burda bastaki double lar kucuk te yazilabilir
		Double sayi2 = Double.parseDouble(str2) ; // ama ortadaki Double lar buyuk olmali
		
		System.out.println("Iki fiyatin toplami : $" + (sayi1 + sayi2));
		
		
		
		
		
		
		
		
	}

}
