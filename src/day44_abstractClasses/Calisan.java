package day44_abstractClasses;

public class Calisan extends Insan {
    
    
    private int calisanId;
    public Calisan(String isim, String soyisim,int calisanId) {
        super(isim, soyisim);
        this.calisanId=calisanId;
    }
    @Override
    public void calis() {
    	if (calisanId==0) {
			System.out.println("Bu sahis sirket calisani degil");
			System.out.println("Sahsin id'si: "+calisanId);
    	} else {
    		System.out.println("Bu sahis sirket calisani");
			System.out.println("Sahsin id'si: "+calisanId);
    	}
    }
    public static void main(String[] args) {
    	Calisan Sekreter=new Calisan("Ayse", "Fatma", 0);
    	Calisan Tester=new Calisan("Omer", "Murat", 1453);
    	Calisan Developer=new Calisan("Ali", "Veli", 1905);
    	
    	Sekreter.bilgilendirme();
    	Sekreter.calis();
    	
    	Tester.bilgilendirme();
    	Tester.calis();
    	
    	Developer.bilgilendirme();
    	Developer.calis();
    }
}
