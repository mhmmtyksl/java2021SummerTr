package day49_setCollections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		/*
		Fifo: First in first out--> Elemanlar ilk eklenen ilk silinir kurali.
									Eczane yemekhane ve sektorlerde zaman kaydi
									olan elemanlarin tutulmasinda kullanilir.
		Queue interface in iki subclass constructoru ile obj creat edilebilir.
		LinkedList constructoru ile obj creat edilirse elemanlar Queue icinde
			isention order a gore siralanir.
		PriorityQueue constructoru ile obj creat edilirse elemanlar Queue
			icinde javanin kendine ozel algorutmasina gore siralanir.
		 */

		Queue<String> q1=new LinkedList<>();
		q1.add("Basri");
		q1.add("Hakan");
		q1.add("Sedef");
		q1.add("Ahmet");
		System.out.println(q1);// [Basri, Hakan, Sedef, Ahmet]

		Queue<String> q2=new PriorityQueue<>();
		q2.add("Rabia");
		q2.add("Oguz");
		q2.add("Yagmur");
		q2.add("Mehmet");
		System.out.println(q2);

		System.out.println(q1.peek());// Basri ilk elemani silmeden return eder.
		System.out.println(q1);// [Basri, Hakan, Sedef, Ahmet]

		System.out.println(q1.poll()); // Basri
		System.out.println(q1);// [Hakan, Sedef, Ahmet]

		//q1.clear();// artiik q1 bos
		//System.out.println(q1.poll()); //null bos bir obj den ilk eleman silip return etme komutu girdik
		//System.out.println(q1.remove());//NoSuchElementException bos bir obj den ilk eleaman silip return etme komutu girdik
		// q1.remove();
		// System.out.ptintln(q1); // [Sedef, Ahmet]

		System.out.println(q1.offer("Merve")); // true
		System.out.println(q1); // [Hakan, Sedef, Ahmet, Merve]
		// offer() methodu add() gibi eleman ekler ancak eleman siniri konulduysa
		// add methodu IllegalStateException firlatir. ancak offer() methodu bu durumda calismaya devam eder.






	}

}
