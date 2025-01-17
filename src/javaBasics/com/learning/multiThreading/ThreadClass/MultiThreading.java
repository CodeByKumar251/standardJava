package javaBasics.com.learning.multiThreading.ThreadClass;

public class MultiThreading extends Thread{
	
	@Override
	public void run() {
		System.out.println("Code executed by thread: "+Thread.currentThread().getName());
	}

}
