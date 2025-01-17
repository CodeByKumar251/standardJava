package javaBasics.com.learning.multiThreading.customLock.reentrantLock.example1;

public class Main {
	
	/*
	 * showing ambugity, not working as expected
	 */
	
	public static void main(String args[]) {
		SharedResource sharedResource1=new SharedResource();
		
		ProducerThread producerThread1=new ProducerThread(sharedResource1);
		Thread th1=new Thread(producerThread1);
		
		SharedResource sharedResource2=new SharedResource();
//		
		ProducerThread producerThread2=new ProducerThread(sharedResource2);
		Thread th2=new Thread(producerThread2);
		
//		Thread th1=new Thread(()->{
//			sharedResource1.producer(lock);
//		});
//		
//		Thread th2=new Thread(()->{
//			sharedResource2.producer(lock);
//		});
		
		th1.start();
		th2.start();
	}

}
