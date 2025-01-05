package com.it.main.concurrent.skiplistset;

import java.util.Spliterator;
import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate Spliterator() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetSpliteratorExample2 {

	public static void main(String[] args) {

		// Initializing the set
		ConcurrentSkipListSet<Character> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			set.add(ch);
		}

		// Printing elements in the set
		System.out.print("The elements in the set are : ");

		// spliterator split and iterate
		// the split parts in parallel
		Spliterator<Character> str = set.spliterator();

		// if element exists tryAdvance() will perform action
		while (str.tryAdvance((n) -> System.out.print(n + " ")));
	}

}
