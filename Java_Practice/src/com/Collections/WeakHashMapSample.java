package com.Collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("WeakHashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("WeakHashMap after garbage collection: " + numbers);
        
        System.out.println("============");
        
        HashMap<String, Integer> numbers1 = new HashMap<>();

        String two1 = new String("Two");
        Integer twoValue1 = 2;
        String four1 = new String("Four");
        Integer fourValue1 = 4;

        // Inserting elements
        numbers1.put(two1, twoValue1);
        numbers1.put(four1, fourValue1);
        System.out.println("HashMap: " + numbers1);

        // Make the reference null
        two1 = null;

        // Perform garbage collection
        System.gc();

        System.out.println("HashMap after garbage collection: " + numbers1);

	}

}
