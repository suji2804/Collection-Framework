package com.scaleupindia.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println("Length of list is: " + list.size());
		System.out.println("Value of list is: " + list);
		list.add("Java");
		list.add("is");
		list.add("great");
		System.out.println("Length of list is: " + list.size());
		System.out.println("Value of list is: " + list);
		System.out.println("Item at index 1 is " + list.get(1));
		list.add(1, "now");
		System.out.println("Length of list is: " + list.size());
		System.out.println("Value of list is: " + list);
		// items.add(10, "execption");
		list.set(2, "good");
		System.out.println("Length of list is: " + list.size());
		System.out.println("Value of list is: " + list);
		list.clear();
		if (list.isEmpty()) {
			System.out.println("List is empty");
		}

		List<String> list2 = Arrays.asList("Spring", "is", "also", "good");
		list.addAll(list2);
		System.out.println("Length of list is: " + list.size());
		System.out.println("Value of list is: " + list);
		String searchableItem = "Spring";
		if (list.contains(searchableItem)) {
			System.out.println("List contains item " + searchableItem);
		}

		list.remove("Springs");
		System.out.println("Length of list is: " + list.size());
		System.out.println("Value of list is: " + list);
		
		list.remove(1);
		System.out.println("Length of list is: " + list.size());
		System.out.println("Value of list is: " + list);
	}
}
