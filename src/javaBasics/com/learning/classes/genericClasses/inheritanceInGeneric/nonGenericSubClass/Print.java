package javaBasics.com.learning.classes.genericClasses.inheritanceInGeneric.nonGenericSubClass;

/*
 * T can be any non-primitive Object
 */
public class Print<T> {
	
	T value;
	public void setPrintValue(T value) {
		this.value=value;
	}
	
	public T getPrintValue() {
		return value;
	}
	

}
