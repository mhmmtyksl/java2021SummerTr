package day12_stringManipulations;

public class C01_StringManipulation01 {

    public static void main(String[] args) {

        String str = "Java candir";
        //012345678910   index numaralari
        System.out.println(str.substring(5)); //candir anlami 5 ve sonrasini yazdir demektir

        System.out.println(str.substring(10)); // r

        System.out.println(str.substring(11)); // 11= length hiclik yazdirir

        System.out.println("==="); // bos satir

        // System.out.println(str.substring(20)); // hata verir

        System.out.println(str.substring(5, 8)); // 5 dahil 8 haric can olur.

        System.out.println(str.substring(2, 3)); // v yazdirir

        System.out.println(str.substring(5, 5)); // hiclik

        System.out.println("==="); //

        System.out.println(str.substring(5, 11)); // candir

        // System.out.println(str.substring(5,1)); // hata verir

        System.out.println(str.substring(3, 4) + str.substring(8, 9)); // ad olur






    }

}
