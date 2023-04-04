package com.scaleupindia.example5;

import java.util.Set;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Set<String> set = Set.of("Java", "is");
		System.out.println("Length of set is: " + set.size());
		System.out.println("Value of set is: " + set);
		// set.add("great");
		// set.clear();
		if (set.isEmpty()) {
			System.out.println("List is empty");
		}

		String searchableItem = "Java";
		if (set.contains(searchableItem)) {
			System.out.println("Set contains item " + searchableItem);
		}
	}
}
