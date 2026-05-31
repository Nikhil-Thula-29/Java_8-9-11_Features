package com.nt.collectionenhancements;

@FunctionalInterface
public interface Test1 {
	
	public void add();

	default void m1() {
		System.out.println("This is form Test1 m1");
	}
}
