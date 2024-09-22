package javaBasics.com.learning.classes.genericClasses.boundedGeneric.upperBound;

/*
 * upper bound:-
 * T can be any Number or its subclass only
 */
public class Print<T extends Number> {
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	

}
