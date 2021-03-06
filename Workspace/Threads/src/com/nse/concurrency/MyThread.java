package com.nse.concurrency;

public class MyThread extends Thread{

	@Override
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("From a new thread: " + 	currentThread().getName());
	}
	
}
