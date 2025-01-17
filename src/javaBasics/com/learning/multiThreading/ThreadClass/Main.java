package javaBasics.com.learning.multiThreading.ThreadClass;

public class Main {
	
	public static void main(String args[]) {
		System.out.println("Going inside main method: "+ Thread.currentThread().getName());
		MultiThreading myThread=new MultiThreading();
		myThread.start();
		System.out.println("Finish main method: "+Thread.currentThread().getName());
	}

}
