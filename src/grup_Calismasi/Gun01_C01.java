package grup_Calismasi;

import java.util.Scanner;

public class Gun01_C01 {

	public static void main(String[] args) {
		//Interview Question Kullanicidan bir String isteyin.
		// Kullanicinin girdigi String’in
		// palindrome olup olmadigini kontrol eden bir program yazin.

		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen  bir kelime giriniz : ");
		
		String kelime=scan.next();
		
		String kelimeTersi="";
		
		for (int i = kelime.length()-1; i >=0 ; i--) {
			kelimeTersi=kelimeTersi+kelime.charAt(i);
		}
		if ( kelime.equalsIgnoreCase(kelimeTersi)) {
			System.out.println("Bu kelime palindrome kelimedir.");
		} else {
			System.out.println("Bu kelime palindrome degildir.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
