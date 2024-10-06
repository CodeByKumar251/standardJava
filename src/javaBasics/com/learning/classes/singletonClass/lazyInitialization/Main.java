package javaBasics.com.learning.classes.singletonClass.lazyInitialization;

public class Main {
	
	public static void main(String args[]) {
		DBConnection connection=DBConnection.getInstance();
	}

}
