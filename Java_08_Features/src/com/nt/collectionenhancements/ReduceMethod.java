package com.nt.collectionenhancements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceMethod {
	
	public static void main(String[] args) {
		int a[]= {20,30,50,50};
		int sum=Arrays.stream(a).sum();
		System.out.println("sum is: "+sum); //sum is there but what about mul,sub so we use reduce
		Arrays.stream(a).reduce((x,y)->x+y).ifPresent(p->System.out.println("sum is: "+p));
		Arrays.stream(a).reduce((x,y)->x>y?x:y).ifPresent(p->System.out.println("Max value is: "+p));
		Arrays.stream(a).reduce((x,y)->x<y?x:y).ifPresent(p->System.out.println("Min value is: "+p));
		
		String b[]= {"India","Developed","Country"};
		Arrays.stream(b).reduce((q,n)->q+" "+n).ifPresent(p->System.out.println(p));
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Nikhil",50050.033));
		emp.add(new Employee(2,"Raju",18000.0));
		emp.add(new Employee(3,"Rani",65400.0));
		emp.add(new Employee(4,"Kalyan",35400.0));
		
		emp.stream().map((x)->x.getSal()).reduce((x,y)->x+y).ifPresent((p)->System.out.println("sum of sal: "+p));
	}

}
