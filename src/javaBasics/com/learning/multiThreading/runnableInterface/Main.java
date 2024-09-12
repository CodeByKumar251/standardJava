package javaBasics.com.learning.multiThreading.runnableInterface;


public class Main {
	public static void main(String args[]) {
		System.out.println("Going inside main method: "+Thread.currentThread().getName());
		MultithreadingLearning runnableObj=new MultithreadingLearning();
		Thread thread=new Thread(runnableObj);
		thread.start();  //internally run method gets called
		
	}

}
