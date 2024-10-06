package javaBasics.com.learning.classes.singletonClass.synchronizedMethod;

/*
 * synchronized method:-
 * It is used to overcome the problem of lazy initialization where two object might created if
 * two threads tries to get the object for the first time.
 * 
 * synchronized keyword:-
 * -this synchronized keyword does two things:-
 * a)put a lock on the method
 * b)unlock the method
 * so, the only one thread is allowed to enter the method at a time . Hence the possibility of 
 * two objects being created will be zero.
 * -the only disadvantage of using synchronized is that it is very very slow and generally not 
 * used
 */
public class DBConnection {
	private static DBConnection connection;
	
	private DBConnection() {}
	
	synchronized public static DBConnection getInstance() {
		
		if(connection==null) {
			connection=new DBConnection();
		}
		return connection;
	}

}
