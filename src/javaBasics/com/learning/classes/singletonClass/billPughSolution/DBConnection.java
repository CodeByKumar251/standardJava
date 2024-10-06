package javaBasics.com.learning.classes.singletonClass.billPughSolution;

/*
 * Bill Pugh solution:-
 * it rectified the issue of eager initialization by putting the object inside private static
 * nested class because this nested class do not get loaded when it is referred
 */
public class DBConnection {
	
	private DBConnection connection;
	
	private DBConnection() {}
	
	private static class DBConnectionHelper{
		private static final DBConnection INSTANCE_OBJECT=new DBConnection();
	}
	
	public static DBConnection getInstance() {
		return DBConnectionHelper.INSTANCE_OBJECT;
	}

}
