package com.scaleupindia;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		String[] array = new String[5];
		System.out.println("Length of array is: " + array.length);
		System.out.println("Value of array is: " + array);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Value of item at index " + i + " is: " + array[i]);
		}
		array[0] = "Java";
		array[1] = "is";
		array[3] = "great";
		System.out.println("Length of array is: " + array.length);
		System.out.println("Value of array is: " + array);
		for (String item : array) {
			System.out.println("Value of item is: " + item);
		}
		array[5] = "exception";
	}
}
