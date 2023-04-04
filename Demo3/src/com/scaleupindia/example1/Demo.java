package com.scaleupindia.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		System.out.println("Length of map is: " + map.size());
		System.out.println("Value of map is: " + map);
		map.put(10, "Java");
		map.put(2, "is");
		map.put(45, "great");
		System.out.println("Length of map is: " + map.size());
		System.out.println("Value of map is: " + map);
		map.put(10, "is");
		System.out.println("Length of map is: " + map.size());
		System.out.println("Value of map is: " + map);
		System.out.println("Item at key 10 : " + map.get(10));
		int searchableKey = 2;
		if (map.containsKey(2)) {
			System.out.println("Map contains key " + searchableKey);
		}
		String searchableValue = "is";
		if (map.containsValue(searchableValue)) {
			System.out.println("Map contains value " + searchableValue);
		}
		map.remove(2);
		System.out.println("Length of map is: " + map.size());
		System.out.println("Value of map is: " + map);
		map.clear();
		if (map.isEmpty()) {
			System.out.println("Map is empty");
		}
	}
}
