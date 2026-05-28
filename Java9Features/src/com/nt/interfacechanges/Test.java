package com.nt.interfacechanges;

public interface Test {

	public void show();
	
	default void add() {
		duplicateCode(30,50,40);
	}
	
	default void add1() {
		duplicateCode(10,20);
	}
	
	
	private void duplicateCode(int...nums) {
		int sum=0;
		for(int x:nums) {
			sum=sum+x;
		}
		System.out.println(sum);
	}
}
