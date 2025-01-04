package com.it.main.concurrent;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {

	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);
		new Thread(() -> {
			try {
				queue.put(1);
				queue.put(2);
				queue.put(3);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}).start();
		try {
			System.out.println("Delete from queue: " + queue.take());
			System.out.println("Delete from queue: " + queue.take());
			System.out.println("Delete from queue: " + queue.take());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
