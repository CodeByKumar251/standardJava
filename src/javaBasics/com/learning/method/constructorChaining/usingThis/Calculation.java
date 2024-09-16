package javaBasics.com.learning.method.constructorChaining.usingThis;

public class Calculation {
	
	/*
	 * we can call one constructor with another constructor using this keyword in same class
	 * see below
	 */
	
	String name;
	int empId;
	
	Calculation(){
		this(10);
	}
	
	Calculation(int empId){
		this("guddu",empId);
	}
	
	Calculation(String name, int empId){
		this.name=name;
		this.empId=empId;
	}
	

}
