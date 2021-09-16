package day33_stringBuilder;

public class C01_StringBuilder01 {

	public static void main(String[] args) {
		// String ile StringBuilder arasindaki farklar
		// StringBuilder da equals methodu string class i8ndan farkli calisir
		// String class indaki == operatoru ile ayni islemi yapar.
		// yani hem icerik hemde referans esitligine bakar
		
		String str="Hayat";
		StringBuilder sb=new StringBuilder("Hayat");
		
		// System.out.println(str==sb); farkli data turleri oldugu icin derleyemez
										// CTE verir.
		
		System.out.println(str.equals(sb)); // false verir. cunku data turleri farkli referans degerleri farkli olur
		
		System.out.println(str.equals(sb.toString())); //true olur artik ikiside string olur cunku
		System.out.println(sb.equals(sb.toString())); // false olur cunku biri StringBuilder iken digeri string oluyor.
		
		System.out.println(sb.toString().concat(" guzel")); // Hayat guzel
		System.out.println(sb);  //Hayat
		System.out.println(sb.append(str, 2, 5));// Hayatyat
	}

}
