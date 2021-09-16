package day42_exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptions07 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

		System.out.println(arr[1]);// 2
		System.out.println(arr[3]);// 4
		// System.out.println(arr[5]);//ArrayIndexOutOfBoundsException unchecked

		List<String> guzelInsan = new ArrayList<>(Arrays.asList("Ali", "Veli", "Deli"));

		System.out.println(guzelInsan.get(2));
		System.out.println(guzelInsan.get(0));
		// System.out.println(guzelInsan.get(5));// IndexOutOfBoundsException

		// Array ve List lerde olmayan bir index le islem
		// yapilirsa java IndexOutOfBoundsException unchecked
		// hatasi verir.

	}

}
