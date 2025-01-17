package javaBasics.com.learning.multiThreading.customLock.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
	/*
	 * ReadLock: More than 1 thread can acquire the read lock of same resources(object), it is called shared lock
	 * WriteLock:Only 1 thread can acquire the write lock, it is called exclusive lock.
	 * if any thread including shared lock acquired on object then exclusive lock can not acquired.
	 * if exclusive lock acquired on object then other thread or another exclusive lock can not acquired.
	 * if shared lock acquired on the object then other shared lock can also acquired.
	 * 
	 * UseCase:-
	 * ReadLock/shared lock are used when read element are larger then write element like:- if 1000 numbers 
	 * are for read and 10 numbers are for write.
	 * WriteLock/exclusive lock are used when inside method we largely updating(write) the values.
	 */
	
	static ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
	
	public static void main(String args[]) {
		
		System.out.println("thread started "+Thread.currentThread().getName());
		
		SharedResource sharedResource1=new SharedResource();
		
		ProduceThread produceThread1=new ProduceThread(sharedResource1, readWriteLock);
		Thread th1=new Thread(produceThread1);
		
		SharedResource sharedResource2=new SharedResource();
		
		ProduceThread produceThread2=new ProduceThread(sharedResource2, readWriteLock);
		Thread th2=new Thread(produceThread2);
		
		SharedResource sharedResource3=new SharedResource();
		
		ConsumeThread consumeThread=new ConsumeThread(sharedResource3, readWriteLock);
		Thread th3=new Thread(consumeThread);
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("thread ended "+Thread.currentThread().getName());
		
		/*
		 * Some its show ambugutiy because consumeThread is waiting to release lock by produceThread and when
		 * produceThread release lock before that consumeThread completed his task
		 */
		
	}

}
