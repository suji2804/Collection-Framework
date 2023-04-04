package com.scaleupindia.example4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Java");
		hashSet.add("is");
		hashSet.add("great");
		hashSet.add("You");
		hashSet.add("should");
		hashSet.add("learn");
		hashSet.add("this");
		System.out.println("Value of Hash Set is: " + hashSet);

		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Java");
		linkedHashSet.add("is");
		linkedHashSet.add("great");
		linkedHashSet.add("You");
		linkedHashSet.add("should");
		linkedHashSet.add("learn");
		linkedHashSet.add("this");
		System.out.println("Value of Linked Hash Set is: " + linkedHashSet);

		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Java");
		treeSet.add("is");
		treeSet.add("great");
		treeSet.add("You");
		treeSet.add("should");
		treeSet.add("learn");
		treeSet.add("this");
		System.out.println("Value of Tree Set is: " + treeSet);
	}
}
