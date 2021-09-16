package day37_inheritance;

class Derived {
	
	public Derived() { 
		
		System.out.println("Derived class " ); 
		
	}
	
}

	public class Test01 extends Derived {
		
		public Test01 () {
			super();
			System.out.println("Test class ");
			
		}
		
		public static void main(String[] args) {
			
			Test01 obj = new Test01();
			
		}
		
	}