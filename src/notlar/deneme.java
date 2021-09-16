package notlar;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kelime giriniz");

		String str=scan.nextLine();
		
		StringBuilder str1=new StringBuilder();
		str1.append(str);
		System.out.println(str1.reverse().toString().equals(str));
		
		
		
		
		
		
		
		
		/*
		if (str.equals(str1.toString())) {
			System.out.println("Polindrom");
		} else {
			System.out.println("Polindrom degil");
		}
		*/
		
		
		
		
	}

}
