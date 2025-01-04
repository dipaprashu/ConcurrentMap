package com.it.main.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Java program to illustrate Concurrent 
//Collection need 

/*
 * Most of the Collections classes objects (like ArrayList, LinkedList, HashMap etc) are non-synchronized in nature 
 * i.e. multiple threads can perform on a object at a time simultaneously. Therefore objects are not thread-safe.
 * 
 * Very few Classes objects (like Vector, Stack, HashTable) are synchronized in nature i.e. 
 * at a time only one thread can perform on an Object. But here the problem is performance is low because at a 
 * time single thread execute an object and rest thread has to wait.
*/

public class ConcurrentDemo extends Thread {

	/*
	 * The main problem is when one thread is iterating an Collections object then
	 * if another thread can't modify the content of the object. If another thread
	 * try to modify the content of object then we will get RuntimeException saying
	 * ConcurrentModificationException.
	 * 
	 * Because of the above reason Collections classes is not suitable or we can say
	 * that good choice for Multi-threaded applications.
	 */
	static List<String> l = new ArrayList<>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread" + " going to add element");
		}
		// Child thread trying to add new
		// element in the Collection object
		l.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("c");
		// We create a child thread that is
		// going to modify ArrayList l.
		ConcurrentDemo t = new ConcurrentDemo();
		t.start();
		// Now we iterate through the ArrayList
		// and get exception.
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
			Thread.sleep(6000);
		}
		System.out.println(l);
	}
}
