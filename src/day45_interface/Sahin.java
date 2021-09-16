package day45_interface;

public class Sahin extends Tofas implements IcDonanim, DisDonanim, Lastik{

	@Override
	public void koltuk() {
		System.out.println("Deri koltuk yazin pisirir.");
		
	}

	@Override
	public void motor() {
		System.out.println("1.6 aile motoru");
		
	}

	@Override
	public void yakit() {
		System.out.println("Tup takmazsan cook yakar");
		
	}

	@Override
	public void ayna() {
		System.out.println("Elektrikli aynalar");
		
	}

	@Override
	public void kapi() {
		System.out.println("4 kapili");
		
	}

	@Override
	public void kaporta() {
		System.out.println("Kordon gibi kaporta");
		
	}

	@Override
	public void ebat() {
		System.out.println("17 inc");
		
	}

	@Override
	public void jant() {
		System.out.println("Celik jant i vardir");
		
	}

}
