package com.nt.base;

public class Employee {
	
	private int privateSalary=5000;
	
	int defaultBonus=1000;
	
    protected String protectedDepartment = "IT";
    
    public String publicName = "Nikhil";
    
    private Employee(int salary) {
        this.privateSalary = salary;
        System.out.println("Private Constructor");
    }
    
    Employee(String dept) {
        this.protectedDepartment = dept;
        System.out.println("Default Constructor");
    }
    
    protected Employee(String dept, String name) {
        this.protectedDepartment = dept;
        this.publicName = name;
        System.out.println("Protected Constructor");
    }
    
    public Employee() {
        System.out.println("Public Constructor");
    }
    
    private void privateMethod() {
        System.out.println("Private Method");
    }
    
    void defaultMethod() {
        System.out.println("Default Method");
    }
    
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
    
    public void publicMethod() {
        System.out.println("Public Method");
    }
    
    public void accessInsideClass() {

        System.out.println(privateSalary);
        System.out.println(defaultBonus);
        System.out.println(protectedDepartment);
        System.out.println(publicName);

        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
