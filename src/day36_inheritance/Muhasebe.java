package day36_inheritance;

public class Muhasebe extends Personel {

	public String statu;
	public int saatUcreti;
	public int maas;

	public int maasHesapla() {
		maas = saatUcreti * 8 * 30;
		return maas;
	}

}
