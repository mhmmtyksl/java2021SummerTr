package day06_relationalOperators_ifStatements;

public class C2_IfStatements01 {

	public static void main(String[] args) {
		
	int a=2;
	int b=3;
	
	if(a>b) {
		System.out.println("a b'den buyuk");//false o yuzden yazmaz
	}
	if (a==b) {
		System.out.println("sayilar esit");//false o yuzden yazmaz
	}
	if (a>b || a+b<10) {
		System.out.println("yasasin Java");//true o yuzden yazar
	}
	
	// sartin sonucu true ise if body calisir
	// false ise if body calismaz
	// body calissa da calismasa da body den sonraki satira gider
	
	
	if (a+b<0 || a*b>20) {
		System.out.println("bitti bu is");// false o yuzden yazmaz
	}
	
	
	
	
	
	
	
	
	
	}

}
