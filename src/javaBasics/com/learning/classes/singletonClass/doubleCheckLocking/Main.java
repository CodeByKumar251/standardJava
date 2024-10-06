package javaBasics.com.learning.classes.singletonClass.doubleCheckLocking;

public class Main {
	
	public static void main(String args[]) {
		DBConnection connection=DBConnection.getInstance();
	}

}
