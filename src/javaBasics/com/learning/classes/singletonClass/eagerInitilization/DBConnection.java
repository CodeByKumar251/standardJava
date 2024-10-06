package javaBasics.com.learning.classes.singletonClass.eagerInitilization;

public class DBConnection {
	
	private static DBConnection conObject=new DBConnection();
	
	private DBConnection() {}
	
	public static DBConnection getInstance() {
		return conObject;
	}
	

}
