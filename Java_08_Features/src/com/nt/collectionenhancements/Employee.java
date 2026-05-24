package com.nt.collectionenhancements;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private double sal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Employee o) {
		 return compare(this, o);
	}
	
	public static int compare(Employee x, Employee y) {
        return (x.getEmpId() < y.getEmpId()) ? -1 : ((x.getEmpId() == y.getEmpId()) ? 0 : 1);
    }
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId;
	}
	
	
}
