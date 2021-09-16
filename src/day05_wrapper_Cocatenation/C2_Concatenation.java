package day05_wrapper_Cocatenation;

public class C2_Concatenation {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		int sayi1 = 3;
		int sayi2 = 4;

		// kesinlikle sayi ve harf yazmadan sadece variable isimlerini kullanarak

		// Hello1 yazdirin

		System.out.println(str1 + (sayi2 - sayi1)); // Hello1

		// Hello 5 World

		System.out.println(str1 + " " + (sayi2 * 2 - sayi1) + " " + str2); // Hello 5 World

		// veya str1+ " "+ ++sayi2+" "+ str2

		// Hello 34
		System.out.println(str1 + " " + sayi1 + sayi2); // Hello 34

		// 7World

		System.out.println(sayi1 + sayi2 + str2); // 7World

		// 34 yazalim

		System.out.println(sayi1 + "" + sayi2); // 34 data türü string tirnagin ici bos olmali

		System.out.println(sayi1 + sayi2); // 7 olur data türü int olur

		// int i string e cevirmek icin method a ihtiyac yok ama istersek kullanabiliriz

		String intdanCevrilen = "" + sayi1; // bu yöntem method kullanmadan int i stringe cevirir

	}

}
