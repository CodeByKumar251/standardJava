package javaBasics.com.learning.classes.genericClasses.genericMethod;

public class Pair<k,v> {
	
	private k key;
	private v value;
	
	public void put(k key, v value) {
		this.key=key;
		this.value=value;
	}
	
	public v get() {
		return value;
	}

}
