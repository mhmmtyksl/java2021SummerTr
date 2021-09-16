package day45_interface;

public class SahinRunner {

	public static void main(String[] args) {
		Sahin s1=new Sahin();
		s1.ayna();
		s1.ebat();
		s1.jant();
		s1.kapi();
		s1.kaporta();
		s1.koltuk();
		s1.motor();
		s1.yakit();
		System.out.println(IcDonanim.music);
		// s1.kumas="Deri"; // final variable assaigment yapilamaz.
		System.out.println(IcDonanim.RENK);
		System.out.println(DisDonanim.RENK);
		System.out.println(Lastik.RENK);
		s1.sisLamp(); // obj ile parent interface den concrete method call edildi.
		System.out.println(DisDonanim.boya());
	}

}
