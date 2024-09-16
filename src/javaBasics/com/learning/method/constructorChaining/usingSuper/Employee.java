package javaBasics.com.learning.method.constructorChaining.usingSuper;

public class Employee extends Person{
	
	/*
	 * constructor chaining using super
	 * The constructor of child class always invoked the constructor of parent class first then invoke its
	 * own constructor , this is done using super(), if we don't add super() in child constructor then
	 * java add its internally for default constructor, for parameterized constructor we have to add it.
	 */
	
	int empId;

	public Employee(String name,int empId) {
		super(name);
		this.empId=empId;
	}
	

}
