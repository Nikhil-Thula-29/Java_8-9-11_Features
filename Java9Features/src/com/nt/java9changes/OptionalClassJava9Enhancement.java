package com.nt.java9changes;

import java.util.Optional;

public class OptionalClassJava9Enhancement {

	public static void main(String[] args) {
		Optional<Integer> opt=m1();
		opt.ifPresent((x)->System.out.println(x));
		opt.ifPresentOrElse((x)->System.out.println(x), ()->System.out.println("This is empty optional"));
		System.out.println(opt.orElse(0));
		System.out.println(opt.orElseGet(()->10));
	}
	
	public static Optional<Integer> m1(){
		Optional<Integer> op=Optional.ofNullable(null);
		return op;
	}
}
