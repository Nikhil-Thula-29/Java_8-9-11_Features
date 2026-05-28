package com.nt.interfacechanges;

public class Display implements Test{

	@Override
	public void show() {
		System.out.println("This is test");	
	}
	
	
	//This is not override because this is private method
//	@Override
//	public void duplicateCode(int... nums) {
//		// TODO Auto-generated method stub
//		Test.super.duplicateCode(nums);
//	}
	
	public static void main(String[] args) {
		Display dis=new Display();
		dis.show();
		//dis.duplicateCode(10,10);
	}
	
	
}
