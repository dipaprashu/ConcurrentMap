package com.it.main.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		/*
		 * A ConcurrentHashMap is a thread-steady implementation of a Map interface. It
		 * permits a couple of threads to have a look at and write without blocking off
		 * each other.
		 */
		ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
		concurrentMap.put("one", 1);
		concurrentMap.put("two", 2);
		concurrentMap.put("three", 3);
		int value = concurrentMap.get("two");
		System.out.println("Value for key 'two': " + value);

	}

}
