package com.thread;
class DAstudent extends Thread{
	public void run() {
		for(int k = 1; k<=10; k++) {
			System.out.println("DA student : " +k);
		}
	}
}
public class ConcurrentDemo extends Thread {

	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("web student : " +i);
		}
	}

	public static void main(String[] args) {
		ConcurrentDemo st = new ConcurrentDemo();
		st.start();
		DAstudent da = new DAstudent();
		da.start();
		for(int j = 1; j<=10; j++) {
			System.out.println("AI or Cloud Student : " +j);
		}

	}

}
