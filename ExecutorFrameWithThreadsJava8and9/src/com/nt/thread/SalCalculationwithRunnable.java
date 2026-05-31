package com.nt.thread;


public class SalCalculationwithRunnable implements Runnable{

	private Employee e=null;
	public SalCalculationwithRunnable(Employee e) {
		this.e=e;
	}
	
	@Override
	public void run() {
		double sal=e.getBasicSalary()*e.getNoOfWorkingDays();
		e.setSal(sal);
		 System.out.println(
	                Thread.currentThread().getName()
	                + " calculated salary for Employee : "
	                + e.getEmpId()
	                + " Salary : "
	                + e.getSal()
	                );
	}

}
