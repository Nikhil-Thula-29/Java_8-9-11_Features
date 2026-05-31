package com.nt.java11featues;

import java.util.Arrays;

public class A {
	
	class B{
		
	}
	
	class C{
		
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(A.class.getNestMembers()));
		System.out.println(A.class.isNestmateOf(PredicateInterfaceChanges.class));
		System.out.println(C.class.getNestMembers());
	}
}
