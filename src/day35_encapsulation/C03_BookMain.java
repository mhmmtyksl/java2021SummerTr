package day35_encapsulation;

import java.util.Scanner;

public class C03_BookMain {

	public static void main(String[] args) {
		C04_Book kitap=new C04_Book();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen son ukudugunuz kitabi giriniz : ");
		String kitap2=scan.nextLine();
		
		kitap.setBookName("Calikusu");
		kitap.setAuthorName(kitap2);
		System.out.println("1. kitabim : " + kitap.getBookName()+" 2. kitabim : "+kitap.getAuthorName());
		
		scan.close();
	}
}
