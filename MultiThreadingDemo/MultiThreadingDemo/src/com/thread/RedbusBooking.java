package com.thread;

public class RedbusBooking extends Thread {
	public synchronized void run() {
		for(int k = 1; k<=10; k++) {
			System.out.println("Seat : " +k);
			
		}
	}

	public static void main(String[] args) {
		RedbusBooking rb = new RedbusBooking();
		RedbusBooking rb1 = new RedbusBooking();
		rb.start();
		System.out.println("Thread1 priority : " +rb.getPriority());

		rb1.start();
		System.out.println("Thread2 priority : " +rb1.getPriority());


	}

}
