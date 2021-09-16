package day12_stringManipulations;

import java.util.Scanner;

public class C04_StringManipulations04 {

	public static void main(String[] args) {
		
		// Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
		// 4 harften uzun veya kisa ise "Lutfen 4 haffli kelime girin." yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 4 harfli bir kelime giriniz : ");
		
		String kelime=scan.nextLine();
		
		if (kelime.length()!=4) { // veya if (!(kelime.length())==4) yazilabilir
			System.out.println("Lutfen 4 haffli kelime girin.");
		} else {
			System.out.println(kelime.substring(3,4) + kelime.substring(2,3) +  // (3,4) bunlarin anlami 3 dahil 4 dahil degil indexe gore
					kelime.substring(1,2) + kelime.substring(0,1));
			
		}
		
		
		
		
		
		
		scan.close();
		
		
		
		

	}

}
