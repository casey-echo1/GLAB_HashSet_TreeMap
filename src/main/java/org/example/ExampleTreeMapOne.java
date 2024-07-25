package org.example;

import java.util.TreeMap;

public class ExampleTreeMapOne {
	public static void main(String[] args) {

		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		System.out.println("TreeMap: " + numbers);

		// remove method with single parameter
		int value = numbers.remove("Two");
		System.out.println("Removed value: " + value);

	}
}
