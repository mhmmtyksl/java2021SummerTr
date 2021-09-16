package day33_stringBuilder;

public class C04_AcMo {

	public static void main(String[] args) {
		

		C03_AcMo obj1=new C03_AcMo(); // burda C03_AcMo classindan veri istiyoruz
		
		System.out.println(obj1.defaultAge); // 15
		System.out.println(obj1.protectedAge); // 32
		System.out.println(obj1.publicAge); // 61

		
		C05_AcMo name=new C05_AcMo(); // burda C05_AcMo classindan veri istiyoruz
		System.out.println(name.protectedName);// Celal bey
		System.out.println(name.defaultName); // Murat bey
		System.out.println(name.publicNamee); // Mustafa bey
	}

}
