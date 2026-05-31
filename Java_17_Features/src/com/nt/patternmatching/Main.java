package com.nt.patternmatching;

public class Main {

	public static void main(String[] args) {
		Object obj="Raja";
		
		//old process
//		if(obj instanceof String) {
//			String s=(String)obj;
//			System.out.println(s.toUpperCase());
//		}else {
//			Integer i=(Integer)obj;
//			System.out.println(i*2);
//		}
		
		//new java 17
		if(obj instanceof String s) {
			System.out.println("From 17: " +s.toUpperCase());
		}else if(obj instanceof Integer i && i>20) { //we can not keep here || bcz if it is not integer we can perform > operation so..
			System.out.println(i*2);
		}
		
		//in switch case
		switch(obj) {
		case String s when s.length()>5->System.out.println(s.toUpperCase());
		case Integer i->System.out.println(i*2);
		case null-> System.out.println("Object is null");
		default ->
        System.out.println("Unknown Type");
		}
	}
}
