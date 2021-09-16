package day28_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		
		double fiyat=100;
		
		// indirimYap(fiyat); // bu methodla fiyatta %10 indirim yapip yeni fiyati dondurcez
		
		System.out.println("Method call ile yazdirilan indirimli fiyat" + indirimYap(fiyat)); //90
		
		System.out.println("Method calistiktan sonra fiyat : " + fiyat); //100 yazar
		
		int zamYuzdesi=15;
		zamYap(zamYuzdesi);
		
		

	}

	private static void zamYap(int zamYuzdesi) {
		// javaya bir method olusturdugumuzda java bizim main method da kullandigimiz
		// variable isminde clone/kopye bir variable olusturur
		// bunun amaci kod takibini kolaylastirmaktir.
		// bu degiskenin ismini degistirsek de kodumuz problemsiz calisir.
		
		
	}

	private static double indirimYap(double ucret) {
		ucret=ucret*90/100;
		
		System.out.println("Methodda ki indirimli fiyat : " + ucret); //90 yazar
		
		return ucret;
	}

	

}
