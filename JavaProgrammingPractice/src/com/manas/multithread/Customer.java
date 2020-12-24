package com.manas.multithread;

public class Customer {
	int amount = 10000;

	public synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw !"+this.amount);
		if (this.amount < amount) {
			System.out.println("Less Balance : Please deposite to widraw !");
			try {
				System.out.println("Enter to waiting state:");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		this.amount -= amount;
	}

	public synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}

}
