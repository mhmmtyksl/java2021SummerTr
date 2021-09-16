package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime {

	public static void main(String[] args) {
	
		// java da saat ile islem yapmak icin 
		// LocalTime class indan obje kullaniriz.
		LocalTime zaman=LocalTime.now(); //  mevcut saati bilgisayarin sisteminden alir.
		System.out.println("Aktuel zaman : " + zaman); //20:39:01.676599
		
		LocalTime time1=LocalTime.of(12, 35, 23);
		System.out.println(time1);
		System.out.println("Su zamandan 2 saat ileri 34 dakika geri 45 saniye ileri : " + zaman.plusHours(2).minusMinutes(34).plusSeconds(45));
		
		for (int i = 0; i < 10000; i++) { // burda 10000 e kadar saydirip javanin calisma hizini olctuk
			
			i+=1;
		}
		
		LocalTime zaman2=LocalTime.now();
		System.out.println();
		System.out.println(zaman2);
		
		// ulke saatleri hesaplama
		ZonedDateTime japan=ZonedDateTime.now(ZoneId.of("Japan")); // japonyanin yerel zamani
		System.out.println(japan);
	}

}
