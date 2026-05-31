package com.nt.thread;

public class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread mytaks "+Thread.currentThread().getName());		
	}

}
