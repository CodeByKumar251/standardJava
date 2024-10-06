package javaBasics.com.learning.classes.immutableClass;
import java.util.ArrayList;
import java.util.List;

/*
 * IMMUTABLE CLASS:-
 * -we can not change the value of an object once created.
 * -Declare class as final so that it can not be extended 
 * -All class member should be private so, direct access can be avoided
 * -and class member are initialized only once using constructor.
 * -There should not be any setter methods, which is generally used to change the value.
 * - Just getter method and returns copy of the member varibale.
 * -Example:-String, wrapper class etc.
 */
public final class MyImmutableClass {
	
	private final String name;
	private final List<Object> petNameList;
	
	MyImmutableClass(String name, List<Object> petNameList) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.petNameList=petNameList;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Object> getPetNameList(){
		/*
		 * this is required because  making list final
		 * means you can not now point it to new list, but still can add, delete values in it
		 * so that why we send the copy of it
		 */
		return new ArrayList<>(petNameList);
	}

}
