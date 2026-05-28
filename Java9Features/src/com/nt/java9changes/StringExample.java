package com.nt.java9changes;

import java.util.ArrayList;
import java.util.List;

public class StringExample {

	public static void main(String[] args) {
		String s = "Java";
		String s1 = "Java";

		String x=s.concat(" Programming");

		System.out.println(x);
		System.out.println(x==s);
		System.out.println(s1==s);
		System.out.println(s);
		
//		List<Integer> li=List.of(1,2,3,4,5,6);
//		li.add(50); //error because in List.of we can not modify error: java.lang.UnsupportedOperationException
//		System.out.println(li);
		
		
		//Before java 8
//		List<Integer> al=new ArrayList<>();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		List<Integer> ul=Collections.unmodifiableList(al);
//		ul.add(40);
//		ul.add(60);
//		ul.remove(2);
//		System.out.println(ul);
		
		
		//After java 9
		List<Integer> ull=List.of(10,20,30);
		ull.add(60);
		System.out.println(ull);  //error java.lang.UnsupportedOperationException
		
		//If we want to make it mutable again then we need use below
		List<Integer> ulll=new ArrayList<>(List.of(10,20,30));
		ulll.add(66);
		System.out.println(ulll);
	}
}
