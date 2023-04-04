package com.scaleupindia.example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("Value of list is: " + list);
		list.remove(1);
		System.out.println("Value of list is: " + list);
		list.remove(Integer.valueOf(1));
		System.out.println("Value of list is: " + list);
		list.addAll(Arrays.asList(4, 2, 8, 3, 6));
		Collections.sort(list);
		System.out.println("Value of list is: " + list);
	}
}
