package javaBasics.com.learning.classes.genericClasses.definition;

public class Print {
	
	/*
	 * generic class helps us for write a class in generic manner that helps to avoid typecasting
	 * that we will have to use with object class 
	 * lets see this example
	 * 
	 * 
	 */
	
	Object value;
	
	public void setValue(Object value) {
		this.value=value;
	}
	
	public Object getValue() {
		return value;
	}
	

}
