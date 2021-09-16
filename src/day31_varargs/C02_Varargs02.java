package day31_varargs;

public class C02_Varargs02 {

	public static void main(String[] args) {
		// Varargs kullanarak verilen Stringleri birlestiren concat isimli bir method
		// olusturunuz
		concat("M", "u", "h", "a", "m", "m", "e", "t"); // Muhammet
	}

	private static void concat(String... string) {
		String s = "";
		for (String w : string) {
			s = s.concat(w); // bunun yerine s+=w; yazilabilir
			
		}
		System.out.println(s);
	}
}