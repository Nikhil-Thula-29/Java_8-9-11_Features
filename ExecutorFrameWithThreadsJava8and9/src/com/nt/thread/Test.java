package com.nt.thread;

public class Test{
	public static void main(String[] args) {
		MyThread th=new MyThread();
		MyThread th1=new MyThread();
		//th.run(); //will run again with the main method only so use always start() and internally start method uses run
		th.start(); //use always start it starts new thread.
		th1.start();
		//th.start(); //error because of again starting the terminated thread.
		
		Thread tr=new Thread(()->{
			System.out.println("working "+Thread.currentThread().getName());
		});
		tr.start();
		System.out.println("new thread "+Thread.currentThread().getName());
	}
}