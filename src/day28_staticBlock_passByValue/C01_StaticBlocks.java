package day28_staticBlock_passByValue;

public class C01_StaticBlocks {

	static int sayi=10;
	 static {
		 System.out.println("1. Static block calisti"); //ilk once static block calisir
		 											// ama cogu classta olmaz
		 sayi=20;
		 
	 }
	 static {
		 System.out.println("2. Static block calisti");  
		 sayi=30;
		 
	 }
	 static {
		 System.out.println("3. Static block calisti"); 
		 sayi=45;
		 
	 }
	 
	public static void main(String[] args) { // main method olmasina ragmen once static block calisti
		
	
		System.out.println("Main method'un olk iki satirinda sayi : " + sayi);
		
		
		
	}
	static {
		 System.out.println("Main methoddan sonraki Static block calisti"); 
		 sayi=100;
		 
	 }

}
