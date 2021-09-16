package notlar;

import java.util.Scanner;

public class Pol2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen bir String giriniz.");
		String str1 = scan.nextLine();

		System.out.println(isPalindrome(str1));

		scan.close();

	}

	public static boolean isPalindrome(String kelime) {

		StringBuilder sb = new StringBuilder(kelime);

		return kelime.equals(sb.reverse().toString());

	}
}