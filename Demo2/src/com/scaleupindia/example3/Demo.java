package com.scaleupindia.example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println("Value of set is: " + set);
		set.remove(1);
		System.out.println("Value of set is: " + set);
		set.remove(Integer.valueOf(1));
		System.out.println("Value of set is: " + set);
		set.addAll(Arrays.asList(4, 2, 8, 3, 6));
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println("Value of set is: " + list);
	}
}
