package javaBasics.com.learning.classes.genericClasses.wayToDefine;

/*
 * T can be any non-primitive Object
 */
public class Print<T> {
	
	T value;
	String name;
	
	public void setPrintValue(T value) {
		this.value=value;
	}
	
	public T getPrintValue() {
		return value;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

}
