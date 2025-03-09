package com.thread;

import java.util.Scanner;

class Account{
	long accnumber;
	int balance;
	//To set values
	Account(long accnumber,int balance){
		this.accnumber = accnumber;
		this.balance = balance;
		
	}
	// To check balance
	boolean isSufficientBalance(int amt) {
		if(balance>amt) {
			return true;
		}
		else {
			return false;
		}
	}
	//To withdraw 
	void withDraw(int amt) {
		balance = balance-amt;
		System.out.println("Current balance is :"+balance);
	}
}
class Customer implements Runnable{
	String name;
	Account acc;
	// To set values
	Customer(String name,Account acc){
		this.name = name;
		this.acc = acc;
	}
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(name+ " Please Enter Amount : ");
		int amt = sc.nextInt();
		synchronized(acc) {
			
		
		
		
		if(acc.isSufficientBalance(amt)) {
			acc.withDraw(amt);
		}
		else {
			System.out.println("Sorry Insufficient balance");
		}
		}
		
	}
}
public class SynchronizationDemo {
	

	public static void main(String[] args) {
		Account ac = new Account(123465,1000);
		Customer c1 = new Customer("sai",ac);
		Customer c2 = new Customer("vishnu",ac);
		Thread t = new Thread(c1);
		Thread t1 = new Thread(c2);
		t.start();
		t1.start();

		
	}

}
