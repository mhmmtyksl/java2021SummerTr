package day43_exceptions_errors;

public class Exceptions15 {
	public static void main(String[] args) {
        
		// KOd calistiginda ekranda ne yazdirir.
		String s="";
        try {
            s+="t";
        }catch (Exception e) {
            s+="c";
        }   finally {
            s+="f";
        }
        s+="a";
        System.out.println(s); //tfa
    }
}