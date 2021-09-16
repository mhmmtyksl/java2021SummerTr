package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate01 {

	public static void main(String[] args) {
	
										// sadece tarih kullanmak istiyorsak bu kullanilir
		LocalDate tarih=LocalDate.now(); // tarih isminde obje olusturduk bunda tarih otomatik bilgisayarin sisteminden alinir.
										// new anahtari kullanilmaz
		System.out.println("Bugunun tarihi : " + tarih); // sistem den otomatik aliyor bilgisayardan.
		
		System.out.println("Bugunden 21 gun sonrasi : " + tarih.plusDays(21));
		
		System.out.println("Bugunden 3 yil sonrasi : " + tarih.plusYears(3));
		
		System.out.println("Bugunden 3 gun 5 ay 2 yil sonrasi : " + tarih.plusDays(3).plusMonths(5).plusYears(2));

		System.out.println("Bugunun 5 yil oncesi 2 ay sonrasi 3 hafta oncesi : " + tarih.minusYears(5).plusMonths(2).minusWeeks(3));
	
		LocalDate dogumGunu=LocalDate.of(1987, 04, 18); // belirli tarihi girmek icin bu kullanilir
		System.out.println("Dogum Gunum : " + dogumGunu);
		System.out.println("Dogum gunum : " + dogumGunu.getDayOfWeek());

		System.out.println(tarih.isAfter(dogumGunu)); //true
		System.out.println(tarih.isBefore(dogumGunu)); // false
		
		System.out.println(tarih.getDayOfYear());// 217 yilin kacinci gunu
		System.out.println(tarih.getMonthValue());// 8
		System.out.println(tarih.getDayOfWeek());// THURSDAY
		System.out.println("bugun artik yil mi : "+tarih.isLeapYear());//false
	}
	}
