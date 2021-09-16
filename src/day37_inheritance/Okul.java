package day37_inheritance;

public class Okul {

	public Okul() { // 7.adim

		System.out.println("Parent class constructor"); // 8.adim

	}

	// ***************************************************

	static class Sinif extends Okul {

		public Sinif(int age) { // 5.adim

			super(); // 6.adim

			System.out.println("Child class parametreli constructor"); // 9.adim

		}

		public Sinif() { // 3.adim

			this(11); // 4.adim

			System.out.println("Child class parametresiz constructor"); // 10.adim

		}

		public static void main(String[] args) { // 1.adim

			Sinif sinif1 = new Sinif(); // 2.adim

		}
	}

}