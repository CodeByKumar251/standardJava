package javaBasics.com.learning.Interface;

public interface Bird {

	public void canFly();

	/*
	 * In Java, interfaces were originally intended to define a contract for classes
	 * without any implementation. However, since Java 8, interfaces have been
	 * enhanced to allow methods with implementations via default and static
	 * methods.
	 * 
	 * Why Allow Default Methods? Before Java 8, when a new method was added to an
	 * interface, all classes implementing that interface had to implement the new
	 * method. This created a problem for maintaining large codebases with many
	 * implementations of an interface. Default methods allow adding new
	 * functionality to interfaces without breaking the existing code. Any class
	 * that implements the interface can inherit the default implementation unless
	 * overridden.
	 * 
	 * A class implementing an interface can choose to override the default method,
	 * or simply inherit it.
	 * 
	 * Why Allow Static Methods? Static methods in interfaces allow creating utility
	 * methods directly related to the interface, similar to utility methods in a
	 * class (like Collections class). These methods are tied to the interface
	 * itself and are not part of any instance of the implementing classes
	 * 
	 * Static methods in an interface cannot be overridden by implementing classes.
	 * They belong to the interface itself and are called directly using the
	 * interface name, not through instances of the implementing classes.
	 * 
	 * 
	 */
	default int getMinimumFlyHeight() {
		return 100;
	}

}
