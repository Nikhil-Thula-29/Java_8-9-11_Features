package com.nt.java8features;

public interface Test {

	public void display();
	
	default void show() {
		System.out.println("This is default method inside test interface");
	}
	
	static void add() {
		System.out.println("This is add method inside test interface");
	}
}
