package day17_NestedForLoopsWhileLoops;

import java.util.Scanner;

public class C01_NestedForLoops01 {

	public static void main(String[] args) {
		/* Soru 12 ) Kullanicidan pozitif bir rakam girmesini
		 * isteyin ve girilen rakama gore asagidaki sekli cizdirin
		her satirda bir yildiz artacak
		 
		 *
		 * *
		 * * *
		 * * * *
		 
		 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir rakan giriniz : ");
		int rakam=scan.nextInt();
		// mesela 5 girdi kullanici.
		
		for (int i = 1; i <=rakam; i++) { // burda i satir numaralari icin 
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println(); // bunun amaci inner loop bitince asagi inmesini saglamak
			
		}
	
		
		scan.close();
		
	}

}
