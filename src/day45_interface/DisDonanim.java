package day45_interface;

public interface DisDonanim {
	
	public void ayna();
	public void kapi();
	public void kaporta();
	String RENK="metalik";
	
	public default String sisLamp() { // bu method normal body li concrete dir.
		return "sisli hava dikkat";
	}
	public static String boya() {
		return "koyu renk boya gunes yanigi yapar";
	}
	
}
