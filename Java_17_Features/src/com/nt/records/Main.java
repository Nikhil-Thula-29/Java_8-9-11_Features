package com.nt.records;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Person per=new Person("Nikhil",25,new ArrayList<>(Arrays.asList("Cricket","Travel")));
		Person per1=new Person("Nikhil",25,new ArrayList<>(Arrays.asList("Cricket","Travel")));
		System.out.println(per.age());
		System.out.println(per.name());
		System.out.println(per.toString());
		System.out.println(per.equals(per1));
		System.out.println(per.hashCode());
		System.out.println(per1.hashCode());
		List<String> hob=per.hobbies();
		hob.add("Walking");
		System.out.println(per); //Person[name=Nikhil, age=25, hobbies=[Cricket, Travel, Walking]] can add becaue list is mutable object 
		System.out.println(per.equals(per1));
		int age=per.age();
		age=99;
		System.out.println(per);//   wont change it is age is int ie immutable object. Person[name=Nikhil, age=25, hobbies=[Cricket, Travel, Walking]]
		per.add();
		System.out.println(per.isAdult());
		per.greet();
		System.out.println(per.count());
	}
}
