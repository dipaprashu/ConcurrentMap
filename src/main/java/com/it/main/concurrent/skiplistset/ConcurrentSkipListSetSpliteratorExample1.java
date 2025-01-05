package com.it.main.concurrent.skiplistset;

import java.util.Spliterator;
import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate Spliterator() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetSpliteratorExample1 {
	/*
	 * The java.util.concurrent.ConcurrentSkipListSet.spliterator() method is an
	 * in-built function in Java which returns a weakly uniform Spliterator across
	 * the elements of this set.
	 */
	public static void main(String[] args) {

		// Initializing the set
		ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		set.add("Gfg");
		set.add("is");
		set.add("best!!");

		// spliterator split and iterate
		// the split parts in parallel
		Spliterator<String> str = set.spliterator();

		// performs the action for each remaining element
		str.forEachRemaining((n) -> {
			String lc = n.toUpperCase();
			System.out.println(" Lower case = " + n);
			System.out.println(" Upper case = " + lc);
			System.out.println();
		});
	}

}
