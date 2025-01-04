package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate add() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetAddExample2 {

	public static void main(String[] args) {
		
		// Creating a set object
		ConcurrentSkipListSet<String> lSet = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		lSet.add("alex");
		lSet.add("bob");
		lSet.add("chuck");
		lSet.add("drake");
		lSet.add("eric");

		// Printing elements of the set
		System.out.println("The set contains: ");
		for (String i : lSet)
			System.out.print(i + " ");

	}

}
