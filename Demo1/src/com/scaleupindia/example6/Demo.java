package com.scaleupindia.example6;

import java.util.Arrays;
import java.util.List;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "is", "good");
		System.out.println("Length of list is: " + list.size());
		System.out.println("Value of list is: " + list);
		// list.add("great");
		System.out.println("Item at index 1 is " + list.get(1));
		// list.set(2, "good");
		// list.clear();
		if (list.isEmpty()) {
			System.out.println("List is empty");
		}

		String searchableItem = "Java";
		if (list.contains(searchableItem)) {
			System.out.println("List contains item " + searchableItem);
		}
	}
}
