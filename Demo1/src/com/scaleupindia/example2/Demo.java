package com.scaleupindia.example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("is");
		list.add("great");

		System.out.println("---using index---");
		for (int i = 0; i < list.size(); i++)
			System.out.println("Value of item at index " + i + " is: " + list.get(i));

		System.out.println("---enhanced for loop---");
		for (String item : list)
			System.out.println("Value of item is: " + item);

		System.out.println("---using iterator---");
		Iterator<String> iterator1 = list.iterator();
		while (iterator1.hasNext())
			System.out.println("Value of item is: " + iterator1.next());

		System.out.println("---using list iterator forward---");
		ListIterator<String> iterator2 = list.listIterator();
		while (iterator2.hasNext())
			System.out.println("Value of item is: " + iterator2.next());
		System.out.println("---using list iterator backward---");
		while (iterator2.hasPrevious())
			System.out.println("Value of item is: " + iterator2.previous());
	}
}
