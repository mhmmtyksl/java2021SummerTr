package day09_switchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		
		// kullanicidan gun ismi isteyip haftaici nveya haftasonu yazdiralöim
				
		
		
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen gun ismini giriniz : ");

		String gun = scan.next().toLowerCase();

		switch (gun) {
		case "pazartesi" :
		case "sali" :
		case "carsamba" :			
		case "persembe" :	
		case "cuma" :	
			System.out.println("Haftaici");
			break; 
		case "cumartesi" :	
		case "pazar" :	
			System.out.println("Haftasonu");
			break;
		default:
			System.out.println("Gecerli gun adi giriniz.");
		}
		
		scan.close();
	}

}
