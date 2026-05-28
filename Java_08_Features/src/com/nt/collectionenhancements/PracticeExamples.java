package com.nt.collectionenhancements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeExamples {

	public static void main(String[] args) {
		// groupby length and count
		List<String> words = Arrays.asList("dog", "cat", "fox", "all", "zebra", "apple", "red", "yes", "no");
		//System.out.println(words.stream().collect(Collectors.groupingBy((x) -> x.length(), Collectors.counting())));
		
		
		List<Student> al =
	            Arrays.asList(

	                new Student(
	                    101,
	                    "Nikhil",
	                    "IT"
	                ),

	                new Student(
	                    102,
	                    "Raj",
	                    "HR"
	                ),

	                new Student(
	                    103,
	                    "Sai",
	                    "IT"
	                ),

	                new Student(
	                    104,
	                    "John",
	                    "Admin"
	                )
	            );
		
		
		//System.out.println(al.stream().collect(Collectors.groupingBy(x->x.getDept())));
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Nikhil",50050.033));
		emp.add(new Employee(2,"Raju",38000.0));
		emp.add(new Employee(3,"Rani",35400.0));
		emp.add(new Employee(4,"Kalyan",20000.0));
		
		Map<Object,Long> name=emp.stream().collect(Collectors.groupingBy(x->x.getEmpName().charAt(0),Collectors.counting()));
		System.out.println(name.entrySet().stream().max(Map.Entry.comparingByValue()));
	
	}

}
