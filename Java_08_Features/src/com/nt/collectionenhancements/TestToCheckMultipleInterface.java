package com.nt.collectionenhancements;

public class TestToCheckMultipleInterface  implements Test1,Test2{

	@Override
	public void m1() {
		Test1.super.m1();
		Test2.super.m1();
	}
	
	
	public static void main(String[] args) {
		TestToCheckMultipleInterface  t=new TestToCheckMultipleInterface ();
		t.m1();
	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
