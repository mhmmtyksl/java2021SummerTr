package day10_stringManipulations;

public class C1_StringManipulation01 {

	public static void main(String[] args) {
		
		String name1= "Ali Can";
		String name2= "Ali Can";
		String name3= name2 + ""; // space yok
		String name4= "Ali" ;
		String name5= "Can" ;
		String name6= name4 + " " + name5; //Ali Can
		
		
		System.out.println(name1.equals(name2)); //true
		System.out.println(name1.equals(name3)); //true
		System.out.println(name2.equals(name6)); //true
		
		//ilk 3 karsilastirmada degerler ayni odugu icin sonuc hep true olur.
		
		System.out.println(name1==name2); //true
		System.out.println(name1==name3); //false
		System.out.println(name2==name6); //false
		
		// farkli objeler ayni degeri aldiginda java referanslara bakar.
		// bu referanslar ayni ise == true olur, yoksa false olur.
		
		String name7="Ali CAN";
		String name8="Ali cAn";
		String name9="ali can";
		
		System.out.println(name1.equals(name7)); // false
		System.out.println(name1.equalsIgnoreCase(name7)); // true
		
		System.out.println(name7.equalsIgnoreCase(name9)); // true
		System.out.println(name8.equalsIgnoreCase(name9)); // true
		
	}

}
