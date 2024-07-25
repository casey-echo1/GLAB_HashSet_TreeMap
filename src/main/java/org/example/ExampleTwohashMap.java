package org.example;

import java.util.HashMap;

public class ExampleTwohashMap {
	public static void main(String[] args) {
		HashMap<String, String> newHashMap = new HashMap<>();

		newHashMap.put("Key1", "Lenovo");
		newHashMap.put("Key2", "Motoroloa");
		newHashMap.put("Key3", "Nokia");
		newHashMap.put("Key4", null);
		newHashMap.put(null, "Sony");
		System.out.println("Original map contains: "+newHashMap);

		//get size of HashMap
		System.out.println("Size of original Map is: "+ newHashMap.size());

		//copy contents from one HashMap to another
		HashMap<String, String> copyHashMap = new HashMap<>();
		copyHashMap.putAll(newHashMap);
		System.out.println("copyHashMap mappings= "+copyHashMap);

		//removal of null key
		String nullKeyValue = copyHashMap.remove(null);
		System.out.println("copyHashMap null key value = " + nullKeyValue);
		System.out.println("copyHashMap after removing null key = " + copyHashMap);
		System.out.println("Size of copyHashMap is:" + copyHashMap.size());
	}
}
