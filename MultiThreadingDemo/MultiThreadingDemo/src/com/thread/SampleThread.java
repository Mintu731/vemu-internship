package com.thread;

public class SampleThread {
	void webTeam() {
		for(int i = 1; i<=10; i++) {
			System.out.println("web student : " +i);
		}
	}

	public static void main(String[] args) {
		SampleThread st = new SampleThread();
		st.webTeam();
		for(int j = 1; j<=10; j++) {
			System.out.println("AI or Cloud Student : " +j);
		}

	}

}
