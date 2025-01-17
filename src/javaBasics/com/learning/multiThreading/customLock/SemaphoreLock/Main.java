package javaBasics.com.learning.multiThreading.customLock.SemaphoreLock;

/*
 * Semaphore lock
 * Semaphore lock=new Semaphore(2);
 * in semaphore a particular thread can be allow to access same resources.
 * like in above  lock maximum 2 thread can be allow.
 */
public class Main {
	
	public static void main(String args[]) {
		
		SharedResource sharedResource=new SharedResource();
		
		ProducerThread producerThread1=new ProducerThread(sharedResource);
		Thread th1=new Thread(producerThread1);
		
		ProducerThread producerThread2=new ProducerThread(sharedResource);
		Thread th2=new Thread(producerThread2);
		
		ProducerThread producerThread3=new ProducerThread(sharedResource);
		Thread th3=new Thread(producerThread3);
		
		ProducerThread producerThread4=new ProducerThread(sharedResource);
		Thread th4=new Thread(producerThread4);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		
		
	}
}
