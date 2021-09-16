package day36_inheritance;

public class Memur extends Muhasebe {

	public static void main(String[] args) {
		Memur memur1 = new Memur();

		Memur memur2 = new Memur();

		memur1.isim = "Muhammet";
		memur1.soyisim = "Yuksel";
		memur1.adres = "Erzurum";
		memur1.saatUcreti = 20;
		memur1.statu = "Chef";
		memur1.tel = "12345";
		memur1.id = memur1.idAta();
		memur1.maas = memur1.maasHesapla();

		System.out.println(memur1.isim + "\n" + memur1.soyisim + "\n" + memur1.tel + "\n" + memur1.adres + "\n"
				+ memur1.saatUcreti + "\n" + memur1.id + "\n" + memur1.maas);

	}
}
