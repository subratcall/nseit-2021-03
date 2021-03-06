package com.nse.concurrency;

public class MyRunnable implements Runnable{
	
	String Name="RunnableThread";


	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + Name);
	}

	
	public void setName(String str) {
		Name = str;
	}
}
