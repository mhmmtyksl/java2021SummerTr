package day31_varargs;

public class C01_Varargs01 {

	public static void main(String[] args) {
		// verilen iki sayinin toplamini bulan bir method yaziniz
		// verilen uc sayinin toplamini bulan bir method yaziniz

		int sayi1 = 17;
		int sayi2 = 20;
		int sayi3 = 35;

		topla(17, 20, 35); // varargs toplam : 72
		ikiSayiTopla(sayi1, sayi2); // iki sayi toplami : 37
		ucSayiTopla(sayi1, sayi2, sayi3); // uc sayi toplami : 72

	}

	private static void ucSayiTopla(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayi toplami : " + (sayi1 + sayi2 + sayi3));

	}

	private static void ikiSayiTopla(int sayi1, int sayi2) {

		System.out.println("iki sayi toplami : " + (sayi1 + sayi2));

	}

	public static void topla(int... sayi) { // ... nin anlami istedigin kadar sayi varargs

		int toplam = 0;
		for (int i : sayi) {
			toplam += i;
		}
		System.out.println("varargs toplam : " + toplam);
	}
}