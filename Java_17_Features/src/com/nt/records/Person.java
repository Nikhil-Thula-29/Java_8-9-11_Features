package com.nt.records;

import java.util.List;

public record  Person(String name,int age,List<String> hobbies) implements HumanBeing{
	
	static int count=0;

	@Override
	public void add() {
		System.out.println("Test");
	}
	
	public Person{
		if(age<18) {
			throw new IllegalArgumentException("Age is not valid");
		}
		count++;
	}
	
	public void greet() {
		System.out.println("Good Morning"+name);
	}
	
	public boolean isAdult() {
		return age>18;
	}
	
	public int count() {
		return count;
	}

}
