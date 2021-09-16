package day30_dateTime;

public class C06_Soru1 {

	public static void main(String[] args) {
		
		/* soru-1
        Which of the following can be inserted into the blank
         to create a date of June 21, 2014?
        A. new LocalDate(2014, 5, 21);
        B. new LocalDate(2014, 6, 21);
        C. LocalDate.of(2014, 5, 21);
        D. LocalDate.of(2014, 6, 21);
        E. LocalDate.of(2014, Calendar.JUNE, 21);
        F. LocalDate.of(2014, Month.JUNE, 21);           
      */
		
		// hem D hem F ayni tarihi verir ama format olarak F dogrudur
		
		
		// What is the output of the following code?
		
		
		
		
		/* soru-2
        LocalDate date = LocalDate.of(2018,Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() 
        					+ " " + date.getDayOfMonth()); 
            
            A. 2018 APRIL 4
            B. 2018 APRIL 30
            C. 2018 MAY 10
            
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown.
            
            cevap f olur calisir ama hata verir cunku nisan ayi 40 gun olmaz
            */
		
		
		/* soru-3
//      What is the output of the following code?
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2); 
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(d.format(f));  
 
            A. 5/9/13 11:22
            B. 5/10/13 11:22
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
            
            cevap B
*/
		
		
		
		/* soru-4
		// What is the output of the following code?
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
        
         * A. 2018 APRIL 2 
         * B. 2018 APRIL 30 
         * C. 2018 MAY 2 
         * D. 2021 APRIL 2 
         * E. 2021 APRIL
         * 30 F. 2021 MAY 2 
         * G. A runtime exception is thrown.
         * 
         * 
         * 
         * cevap 
         */
		
		
		/* soru-5
        Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak ekleyen
        ve sonrasında her dakikanın ilk 10 saniyesinde kaydolmuş olanları şanslı
        kullanıcı olarak ekrana yazdıran bir uygulamadır.Bunun için;
        1- Bir user class oluşturun fields: name , registerDate (LocalDateTime cinsinden)
        2- Registration isminde bir class oluşturun ve register isminde bir metod ekleyerek
          Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i return edin.
        3- Registration classı na aynı zamanda kendine verilen ArrayListteki userlardan
          her dakikanın ilk 10 saniyesinde kaydolmuşları yazdıran printHappyUsers isminde
          bir metod daha ekleyiniz.
        İpucu Çalışacak main metodu aşağıdaki gibi olmalıdır.
        public static void main(String[] args) {
           Registration userReg = new Registration();
           ArrayList<User> register = userReg.register();
           userReg.printHappyUsers(register);
          }
​
     */

	}

}
