package javaBasics.com.learning.classes.genericClasses.boundedGeneric.multiBound;

/*
 * multi bound:-
 * The first restrictive type should be concreatre class , 2, 3 and so on can be interface
 * for example just like we do in class
 * public class A extends ParentClass implements Interface1, Interface2
 */

public class Print<T extends ParentClass & Interface1 & Interface2> {
	
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	

}
