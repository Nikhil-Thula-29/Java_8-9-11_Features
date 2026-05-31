package com.nt.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadingMain {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Employee emp1=new Employee(1, "Nikhil", 50000,45000 ,21 );
		Employee emp2=new Employee(2, "Vamshi", 60000,55000 ,25 );
		Employee emp3=new Employee(3, "Krishna", 35000,30000 ,30);
		Employee emp4=new Employee(4, "Rajesh", 45000,12000 ,29 );
		Employee emp5=new Employee(5, "Anil", 25000,18000 ,26);
		Employee emp6=new Employee(6, "Suresh", 36000,26000 ,28);
		Employee emp7=new Employee(7, "Sharan", 42000,40000 ,29);
		Employee emp8=new Employee(8, "Naveen", 63000,55000 ,31);
		Employee emp9=new Employee(9, "Pavan", 44000,36000 ,25);
		Employee emp10=new Employee(10, "Kiran", 55000,48000 ,30);
		
		List<Employee> empli=new ArrayList<Employee>();	
		empli.add(emp1);
		empli.add(emp2);
		empli.add(emp3);
		empli.add(emp4);
		empli.add(emp5);
		empli.add(emp6);
		empli.add(emp7);
		empli.add(emp8);
		empli.add(emp9);
		empli.add(emp10);
		
		ExecutorService exeser=Executors.newFixedThreadPool(4);
		
		
		//example with runnable
//		for(Employee emp:empli) {
//			SalCalculationwithRunnable salCal=new SalCalculationwithRunnable(emp);
//			exeser.submit(salCal); //submit can take both callable and runnable. callable returns the object but runnable wont return any thing
//			//exeser.execute(salCal); //execute take only runnable so wont return any thing.
//		}
		
		
		//example with callable
//		for(Employee emp:empli) {
//			SalCalculationwithCallable cal=new SalCalculationwithCallable(emp);
//			Future<Employee> emplo=exeser.submit(cal);
//			Employee em=emplo.get();
//			System.out.println(em);
//		}
		
		//Above all upto 8
		//Java 9 feature
		List<SalCalculationwithCallable> taskList=new ArrayList<>();
		for(int i=0;i<empli.size();i++) {
			SalCalculationwithCallable salcal=new SalCalculationwithCallable(empli.get(i));
			taskList.add(salcal);
		}
		exeser.invokeAll(taskList); //java 9 feature (invokeall)
		exeser.shutdown();
		
	}

}
