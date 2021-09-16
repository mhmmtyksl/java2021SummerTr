package day36_inheritance;

public class Ustabasi extends Isci{

	public String bolum="Takimhane";
	public int SorOldIsciSayisi=20;
	
	public static void main(String[] args) {
		
		Ustabasi ub1=new Ustabasi();
		System.out.println(ub1.bolum);
		System.out.println(ub1.SorOldIsciSayisi);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);
		
		
		Isci ub2=new Ustabasi();
		// extends ile birlibirine baglanan classlarda IS-A relation
		// olan data turleri istege bagli olarak kullanilabilir.
		// daha genis data turu yazmanin avantaji:
		// kapsamin daha genis olmasi
		// dezavantaji:
		// data turu olarak sectigimiz class ve parentlarina ait datalara ulasabiliriz.
		System.out.println(ub2.departman);// Isci classindan alir
		System.out.println(ub2.raporluMu);// Personel class indan alir
		
		Personel ub3=new Ustabasi();
		System.out.println(ub3.id); // Personel class indan alir.
		
		
		
		
		
		
	}

}
