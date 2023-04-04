package com.scaleupindia.example1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		System.out.println("Length of set is: " + set.size());
		System.out.println("Value of set is: " + set);
		set.add("Java");
		set.add("is");
		set.add("great");
		System.out.println("Length of set is: " + set.size());
		System.out.println("Value of set is: " + set);
		set.clear();
		if (set.isEmpty()) {
			System.out.println("Set is empty");
		}

		List<String> list2 = Arrays.asList("Spring", "is", "also", "good");
		set.addAll(list2);
		System.out.println("Length of set is: " + set.size());
		System.out.println("Value of set is: " + set);
		String searchableItem = "Spring";
		if (set.contains(searchableItem)) {
			System.out.println("Set contains item " + searchableItem);
		}

		set.remove("Springs");
		System.out.println("Length of set is: " + set.size());
		System.out.println("Value of set is: " + set);
	}
}
