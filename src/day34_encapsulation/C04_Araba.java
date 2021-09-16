package day34_encapsulation;

/*
1- filedları model(String), renk(String), motor(int), yil (int)
olan Araba  isimli bir class tanımlayınız.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- bütün fieldları için getter ve setter metodları oluşturunuz.
4- ArabaMain isminde main method için bir class oluşturunuz.
5- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
6- aracların motor ve yılını hatalı veri girisine karsi kapsulleyiniz.
*/
public class C04_Araba {

	// Bunlar yukardaki 1. adim
	String model;
	String renk;
	private int motor;
	private int yil;

	public C04_Araba() {
	};// Parametresiz constructur urettik yoksa diger class ta honda icin CTE aldik

	// Bunlar yukardaki 2. adim
	public C04_Araba(String model, String renk, int motor, int yil) {
		super();
		setModel(model);
		setMotor(motor);
		setRenk(renk);
		setYil(yil);

		// bunlari basta yaptik ama - deger girilince hatali
		// sonuc alinca duzeltmek icin alttan method call yaptik
		// this.model = model;
		// this.renk = renk;
		// this.motor = motor;
		// this.yil = yil;
	}

	// bunlar yukardaki 3. adim
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		if (motor > 0) {
			this.motor = motor;
		} else
			this.motor = -motor;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		if (yil > 0) {
			this.yil = yil;
		} else
			this.yil = -yil;
	}

}
