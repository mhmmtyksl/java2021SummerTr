package day05_wrapper_Cocatenation;

public class C3_Concatenation02 {

	public static void main(String[] args) {

		int sayi = 7;
		char ilkHarf = 'a';
		String str = "Java";

		System.out.println(sayi + str + ilkHarf); // 7Javaa olur burda 7+"Java"+a

		System.out.println(sayi + ilkHarf + str); // 104Java olur burda 7+97('a' nin ASCII degerini alir)+"Java" oluyor

		// 7a yazdiralim

		System.out.println(sayi + ilkHarf); // boyle yazarsak 104 olur

		System.out.println("" + sayi + ilkHarf); // 7a yazdirir "" ve 7 yi toplar string olur daha sonra ayi toplar 7a
													// olur.

	}

}
