package day43_exceptions_errors;

public class Exceptions16 {
	public static void main(String[] args) { // 1. adim
        System.out.println(exceptions());    //2.adim 14.adim ve sonuc
        //acde yazdirir
    }
    @SuppressWarnings("finally")
    public static String exceptions() {    //3.adim
        String result = "";   //4.adim
        String v = null;   //5.adim
        try {
            try {
                result = result + "a";  //a     //6.adim
                v.length();             //NullPointer Exception sonras� calismaz    //7.adim
                result = result + "b";
            } catch (NullPointerException e) {    //8.adim
                result = result + "c";    //ac    //9.adim
            } finally {
                result = result + "d";    //acd    //10.adim
                throw new Exception();   //11.adim  exception verir
            }
        } catch (Exception e) {   //12.adim  exception yakalar
            result = result + "e";  //acde       //13.adim methodcall a gider //2 ye
        }
        return result;
    }
}