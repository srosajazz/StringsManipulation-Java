package com.sergiorosa.hashmaps;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {

		HashMap<String, Integer> wordToNum = new HashMap();

		// Insert key-and-value pairs into the HashMap
		wordToNum.put("ONE", 1);
		wordToNum.put("TWO", 2);
		wordToNum.put("THREE", 3);
		wordToNum.put("FOUR", 4);
		wordToNum.put("FIVE", 5);

		// RETRIVE ELEMENTS
		System.out.println(wordToNum.get("THREE"));

		// PRINT ALL THE VALUES & KEYS
		System.out.println(wordToNum.values());
		System.out.println(wordToNum.keySet());

		// REMOVE ITEMS
		System.out.println(wordToNum.remove("FOUR"));

		System.out.println(wordToNum.values());
		System.out.println(wordToNum.keySet());

		// common Use of HasMaps: Which character is the most repeated?
		String s = "phonebook";

		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character currentChar = s.charAt(i);
			if (hashMap.containsKey(currentChar)) {
				// increment current value for this key in hashMap by 1
				hashMap.put(currentChar, hashMap.get(currentChar) + 1);

			} else {
				// If we heven't added it to the hasMap, then put it in with the Variable
				hashMap.put(currentChar, 1);
			}

		}
		Character mostRepated = ' ';
		int max = 0;
		for (Character key : hashMap.keySet()) {
			int currentValue = hashMap.get(key);
			if (currentValue > max) {
				mostRepated = key;
				max = currentValue;
			}
		}

		System.out.println("Most Repeated: " + mostRepated + " | Times: " + max);

	}

}
