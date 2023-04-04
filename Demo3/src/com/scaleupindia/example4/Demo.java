package com.scaleupindia.example4;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(30, "Thirty");
		hashMap.put(80, "Eighty");
		hashMap.put(17, "Seventeen");
		hashMap.put(56, "Fifty Six");
		for (Integer key : hashMap.keySet()) {
			System.out.println(hashMap.get(key));
			// items.remove(key);
		}
		System.out.println("Value of Hash Map is: " + hashMap);

		Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put(30, "Thirty");
		concurrentHashMap.put(80, "Eighty");
		concurrentHashMap.put(17, "Seventeen");
		concurrentHashMap.put(56, "Fifty Six");
		for (Integer key : concurrentHashMap.keySet()) {
			System.out.println(concurrentHashMap.get(key));
			concurrentHashMap.remove(key);
		}
		System.out.println("Value of Concurrent Hash Map is: " + concurrentHashMap);
	}
}
