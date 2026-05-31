package com.nt.thread;

import java.util.concurrent.Callable;

public class SalCalculationwithCallable  implements Callable<Employee>{

	private Employee e=null;
	public SalCalculationwithCallable(Employee e) {
		this.e=e;
	}
	
	@Override
	public Employee call() throws Exception {
		try {
			double sal=e.getBasicSalary()*e.getNoOfWorkingDays();
			e.setSal(sal);
			 System.out.println(
		                Thread.currentThread().getName()
		                + " calculated salary for Employee : "
		                + e.getEmpId()
		                + " Salary : "
		                + e.getSal()
		                );
		}catch(Exception e) {
			e.printStackTrace();
		}
		return e;
	}

}
