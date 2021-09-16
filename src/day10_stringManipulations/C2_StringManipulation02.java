package day10_stringManipulations;

public class C2_StringManipulation02 {

	public static void main(String[] args) {
		
		String str = "Java guzeldir";
				   // 0123456789-10-11-12 index no
		System.out.println(str.length()); // 13

		
		
		
		
		String str2=""; // burada hiclik var
		System.out.println(str2.length()); //0
		
		str2=null;
		// System.out.println(str2.length()); // hata verir calismaz
		
		// str in son harfinin index i nedir?
		// str in uzunlugu 13 oluyor
		// son harfin index i 12 olur (13-1)
		
		String str3= "jlkfjsfijsaklfjlfpü+irfpüosv65g6dfgggdsüfpfkf";
		System.out.println(str3.length()); // 45
		
		//str3 un son harfinin index i str.length()-1
		System.out.println(str3.length()-1); 	
			
		
	}

}
