package com.nseindia.lambda;

public class Main {

	public static void main(String[] args) {
		new Thread(() -> 
		System.out.println("Lambda from " +
		Thread.currentThread().getName())
		).start();
	}

}
