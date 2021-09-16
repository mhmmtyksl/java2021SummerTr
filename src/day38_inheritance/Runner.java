package day38_inheritance;

public class Runner {

	public static void main(String[] args) {
		Cat c1=new Cat();// parametresiz constructor ile obje data type Cat classindan
		/*
		Ayni isimli variable'lar callobj. call edilirken once objenin kendi 
		 class'indaki variable call edilir sonra parentindeki variable call edilir
		 */
		System.out.println(c1.a);//7 animal dan
		System.out.println(c1.c);//9 kendi class i c mammal dan degil
		System.out.println(c1.d);//5 kendi class i
		System.out.println(c1.m);//4 mammal dan
	
		c1.mM();// animalmammal Animal class tan alir
		c1.mC();// cat Cat class tan alir
		c1.mA();// mammal Mammal class tan alir
	
		/*
		 * Method call yapilirken ayni isimli methodlardan hangisinin
		 * alinacagina constructor karar verir. child dan parente 
		 * dogru hiyerarsi yapilir. babadab dedee dogru once kimde 
		 * bulursa ondan alir.
		 * data type ve cons farkli classlar Parent obj=new Child();
		 * parent class tan baslanir child dan degil
		 */
	
		Mammal c2=new Cat("X");// c2 objesininj kendi class i mammaldir.
		
		System.out.println(c2.a);// 7 Animal dan
		System.out.println(c2.c);// 7 Mammal dan
		System.out.println(c2.m);// 4 Mammal dan
	
		c2.mA();// mammal
		c2.mC();// cat
		c2.mM();// animal mammal
		
		Mammal m1=new Mammal();
		Animal c3=new Cat();
		
		
		
	}
}
