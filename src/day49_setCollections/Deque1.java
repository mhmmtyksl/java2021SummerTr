package day49_setCollections;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {
	public static void main(String[] args) {
        /*
         * De : double ended (cift tarafli)
        Deque de hem FIFO( hem LIFO gecerlidir.

         */
        Deque<String> dq1=new LinkedList<>(Arrays.asList("Suna", "Onur", "Suleyman", "Harun"));
        System.out.println(dq1); // [Suna, Onur, Suleyman, Harun]
        System.out.println(dq1.peekFirst()); // Suna ilk elemani silmeden verir.
        System.out.println(dq1.pollFirst()); // Suna ilk elemani silerek verir.
        System.out.println(dq1);// [Onur, Suleyman, Harun]

        System.out.println(dq1.peekLast());// Harun son elemani silmeden verir.
        System.out.println(dq1); // [Onur, Suleyman, Harun]

        System.out.println(dq1.pollLast()); // Harun son elemani silerek verir.
        System.out.println(dq1);// [Onur, Suleyman]

        // eleman ekliyoruz iki tane daha
        dq1.add("Yunus");
        dq1.add("Ali");
        System.out.println(dq1);// [Onur, Suleyman, Yunus, Ali]

        System.out.println(dq1.getFirst()); // Onur
        System.out.println(dq1.getLast()); // Ali
        System.out.println(dq1); // [Onur, Suleyman, Yunus, Ali]

        System.out.println(dq1.pop()); // Onur ilk elemani silerek verir
        System.out.println(dq1); // [Suleyman, Yunus, Ali]

        dq1.clear();// dq1 i bosalttik
        System.out.println(dq1.element());////bos Deque'den  element() methodu ile ilk eleman cagirilirsa NoSuchElementException firlatir
        System.out.println(dq1.pop());//onur-->bos Deque'den  pop() methodu ile ilk eleman cagirilirsa NoSuchElementException firlatir
        System.out.println(dq1);//[Suleyman, yunus, yusuf]

        // System.out.println(dq1.peekFirst());//bos Deque'den ilk elemani cagirdik nuul verdi code kirilmadi.
        // System.out.println(dq1.peekLast());//bos Deque'den  son elemani cagirdik nuul verdi code kirilmadi.
        // System.out.println(dq1.getFirst());// bos Deque'den  get() methodu ile ilk eleman cagirilirsa NoSuchElementException firlatir
        // System.out.println(dq1.getLast());// bos Deque'den  get() methodu ile son eleman cagirilirsa NoSuchElementException firlatir
    }
}