package com.nt.thread;

public class MyThread  extends Thread{

	@Override
	public void run() {
		System.out.println("Running thread " + Thread.currentThread().getName());
		m1();
	}
	
	
	public void m1() {
		System.out.println("m1 method");
	}
}
