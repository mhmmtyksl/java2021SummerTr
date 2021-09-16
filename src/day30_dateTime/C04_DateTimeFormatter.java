package day30_dateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		

		LocalDate bugun=LocalDate.now();
		LocalDate date=LocalDate.of(2020, 5, 15);
		/*
         * yy: YILIN SON iKi RAKAMI
         * yyyy : yılın tamamını
         * y : yılın tamamını
         * M : ay sırasını verir TEMMUZ için : 7
         * MM:  ay sırasını veriri TEMMUZ için : 07
         * MMM . ay isminin ilkuc harfini verir. JUL
         * MMMM : ay isminin tamamını verir
         */

		// M: Month
		// m: minute
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yyyy");
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd$M$yyyy");
		
		System.out.println(dtf.format(bugun));
		System.out.println(dtf1.format(date));
		System.out.println(dtf2.format(bugun));
		System.out.println(dtf3.format(date));
		
		// kac yasindayiz
		LocalDate dt=LocalDate.of(1987, 04, 18);
		System.out.println("Bugunun tarihi : " + bugun);
		System.out.println("Benim dogum tarihim : " + dt);
		Period yasim=Period.between(dt, bugun); //Yasim P34Y3M19D simdiye kadar ne kadar yasadigimizi verir
		System.out.println("Yasim " + yasim);
		System.out.println(yasim.getYears());
	}

}
