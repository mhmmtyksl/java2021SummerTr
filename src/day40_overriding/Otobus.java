package day40_overriding;

public class Otobus extends Arac {
	int yolcuSayisi;

	public Otobus(String renk, int motor, String model, int yolcuSayisi) {// const
		super(renk, motor, model);// parentten gelecek fields
		this.yolcuSayisi = yolcuSayisi;
	}

	@Override
	public String toString() {
		return "Otobus [yolcuSayisi=" + yolcuSayisi + ", model=" + model + getRenk() + getMotor() + ", toString()="
				+ super.toString() + "]";
	}

}
