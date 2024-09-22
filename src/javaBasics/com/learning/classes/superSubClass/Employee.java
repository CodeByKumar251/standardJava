package javaBasics.com.learning.classes.superSubClass;

public class Employee extends Person{
	
	String name;
	
	public Employee(int empId, String name) {
		super(empId);
		this.name=name;
	}
}
