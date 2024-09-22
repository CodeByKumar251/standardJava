package javaBasics.com.learning.classes.genericClasses.inheritanceInGeneric.moreThenOneGeneric;

/*
 *we can create any number of generic parameters as we want i,e-> 1,2,3,4,------N(className <T1,T2,----Tn) 
 */
public class Pair<k,v> {
	
	private k key;
	private v value;
	
	public void put(k key, v value) {
		this.key=key;
		this.value=value;
	}
	
	public v get(k key) {
		return value;
	}

}
