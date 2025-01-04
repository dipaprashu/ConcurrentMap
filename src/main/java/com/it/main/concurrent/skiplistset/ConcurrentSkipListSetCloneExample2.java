package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate clone() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetCloneExample2 {

	public static void main(String[] args) {

		// Initializing the set
		ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		set.add("Gfg");
		set.add("is");
		set.add("fun");

		// Printing elements of the set
		System.out.println("The set contains: " + set);

		// Cloning the ConcurrentSkipListSet
		ConcurrentSkipListSet<String> cloneSet = set.clone();

		// Adding elements to the clone set
		cloneSet.add("site");

		// Printing elements of the clone set
		System.out.println("The clone set contains: " + cloneSet);

	}

}
