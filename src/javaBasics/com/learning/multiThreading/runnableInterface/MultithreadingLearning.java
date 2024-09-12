package javaBasics.com.learning.multiThreading.runnableInterface;

public class MultithreadingLearning implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("code excecuted by thread: "+Thread.currentThread().getName());
		
	}

}
