package com.it.main.concurrent.concurrentmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

//Java Program to illustrate methods of ConcurrentMap interface 

public class ConcurrentMapDemo {

	public static void main(String[] args) {

		// Since ConcurrentMap is an interface,
		// we create instance using ConcurrentHashMap
		ConcurrentMap<Integer, String> conMap = new ConcurrentHashMap<>();
		conMap.put(100, "This is");
		conMap.put(101, "First");
		conMap.put(102, "Application");
		// Here we can't add Hello because 101 key
		// is already present
		conMap.putIfAbsent(101, "Hello");

		// We can remove entry because 101 key
		// is associated with For value
		conMap.remove(101, "For");

		// Now we can add Hello
		conMap.putIfAbsent(101, "Hello");
		
		// We can replace Hello with For 
		conMap.replace(101, "Hello", "For"); 
        System.out.println("Map contents : " + conMap); 
	}

}
