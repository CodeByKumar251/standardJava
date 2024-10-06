package javaBasics.com.learning.Interface.functionalInterface.anonymous;

public class Main {

	public static void main(String args[]) {
		
		Bird eagleObject=new Bird() {

			@Override
			public void canFly(String val) {
				// TODO Auto-generated method stub
				System.out.println("Eagle bird implementation");
				
			}
			
		};
		
		eagleObject.canFly("verticle");
	}

}
