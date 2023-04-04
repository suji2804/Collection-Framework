package com.scaleupindia.example2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Java");
		map.put(2, "is");
		map.put(45, "great");

		System.out.println("--- using key set ---");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet)
			System.out.println("Value of item is: " + map.get(key));

		System.out.println("--- using key-value pair ---");
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for (Map.Entry<Integer, String> entry : entrySet)
			System.out.println("Key is: " + entry.getKey() + " -> Value is: " + entry.getValue());

		System.out.println("--- using value collection ---");
		Collection<String> values = map.values();
		for (String value : values)
			System.out.println("Value of item is: " + value);
	}
}
