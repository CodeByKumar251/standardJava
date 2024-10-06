package javaBasics.com.learning.classes.singletonClass.doubleCheckLocking;

/*
 * Double checked Locking(This is used majorly):-
 * it overcome the problem in synchronized method that is slowness.
 * for more details see Lecture-10 Notes
 */
public class DBConnection {
	private static volatile DBConnection connection;
	
	private DBConnection() {}
	
	public  static DBConnection getInstance() {
		
		if(connection==null) {
			synchronized (DBConnection.class) {
				if(connection==null) {
					connection=new DBConnection();
				}
			}
		}
		
		return connection;
	}

}
