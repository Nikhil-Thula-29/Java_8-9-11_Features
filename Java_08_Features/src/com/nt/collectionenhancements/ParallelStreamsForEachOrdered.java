package com.nt.collectionenhancements;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsForEachOrdered {

	public static void main(String[] args) {
		
		LocalDateTime startTime=null;
		LocalDateTime endTime=null;
		Duration d=null;
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(30);
		li.add(45);
		li.add(63);
		li.add(65);
		li.add(45);
		li.add(15);
		
		li.stream().forEach((x)->System.out.println(x));
		System.out.println("This is same");
		li.stream().forEachOrdered((x)->System.out.println(x));
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Nikhil",50050.033));
		emp.add(new Employee(2,"Raju",18000.0));
		emp.add(new Employee(3,"Rani",65400.0));
		emp.add(new Employee(4,"Kalyan",35400.0));
		
		
		System.out.println("Program started--forEach");
		startTime=LocalDateTime.now();
		emp.stream().forEach((x)->System.out.println(x));
		endTime=LocalDateTime.now();
		d=Duration.between(startTime, endTime);
		System.out.println(d.toMillis());
		System.out.println("Program ended--forEach");
		
		System.out.println("Program started--forEachOrdered");
		startTime=LocalDateTime.now();
		emp.parallelStream().forEachOrdered((x)->System.out.println(x));
		endTime=LocalDateTime.now();
		d=Duration.between(startTime, endTime);
		System.out.println(d.toMillis());
		System.out.println("Program ended--forEachOrdered");
		
	}
}
