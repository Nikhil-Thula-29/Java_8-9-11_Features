package com.nt.java9changes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TakewhileDropwhile {
	public static void main(String[] args) {
		List<Integer> ll=new ArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(80);
		ll.stream().takeWhile((x)->x<50).forEach((x)->System.out.println(x));  //o/p=10 20 30 40
		
		System.out.println("This is for loop");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("By using iterator");
		Stream.iterate(0, (x)->x<ll.size(), x->x+1).forEach((x)->System.out.println(ll.get(x)));
		
		System.out.println("This is example of dropwhile");
		ll.stream().dropWhile((x)->x<30).forEach((x)->System.out.println(x));
	}

}
