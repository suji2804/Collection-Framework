package com.scaleupindia.example2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("is");
		set.add("great");

		System.out.println("---enhanced for loop---");
		for (String item : set)
			System.out.println("Value of item is: " + item);

		System.out.println("---using iterator---");
		Iterator<String> iterator1 = set.iterator();
		while (iterator1.hasNext())
			System.out.println("Value of item is: " + iterator1.next());
	}
}
