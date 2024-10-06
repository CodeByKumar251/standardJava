package javaBasics.com.learning.classes.singletonClass.lazyInitialization;


/*eager initialization:-
 * It is created for solve the problem of eager initialization where we are creating the object
 * as soon as program starts, so in this the object will be created only when someone calls the 
 * provided method for the first time,after that the same object will be returned if someone need
 * need the object and call getInstance method.
 * 
 * -its disadvantage is that if two threads tries to get object at the same time , the object is 
 * null and hence two object will be created. this problem will be solved inside Synchronized
 * method
 */
public class DBConnection {
	private static DBConnection connection;
	
	private DBConnection() {}
	
	public static DBConnection getInstance() {
		if(connection==null) {
			connection=new DBConnection();
			
		}
		return connection;
	}
	
	

}
