package javaBasics.com.learning.multiThreading.monitorLock.realExample;

public class Main {
	
	public static void main(String args[]) {
		System.out.println("Main method started");
		
		SharedResource sharedResource=new SharedResource();
		
		//producer thread
		Thread producerThread=new Thread(new ProduceTask(sharedResource));
		//consumer thread
		Thread consumerThread=new Thread(new ConsumeTask(sharedResource));
		
		//thread is in Runnable state
		producerThread.start();
		consumerThread.start();
		
		System.out.println("Main method end");
	}

}
