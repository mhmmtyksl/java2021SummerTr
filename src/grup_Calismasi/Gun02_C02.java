package grup_Calismasi;

import java.util.Scanner;

public class Gun02_C02 {

	public static void main(String[] args) {
		// Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve 
		// aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki tam sayi giriniz : ");
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sum=0;
		if (num2>num1) {
			for (int i = num1; i <=num2; i++) 
			sum=sum+i;
		} else if (num1>num2) {
			for (int i = num2; i <=num1; i++) {
			sum=sum+i;
		
			
		}
		
		
		
		
		
	}

System.out.println(sum);
		
}
	}