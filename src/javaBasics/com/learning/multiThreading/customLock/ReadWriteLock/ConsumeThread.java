package javaBasics.com.learning.multiThreading.customLock.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class ConsumeThread implements Runnable {
	
	private SharedResource sharedResource;
	private ReadWriteLock readWriteLock;
	
	public ConsumeThread(SharedResource sharedResource, ReadWriteLock readWriteLock) {
		this.sharedResource=sharedResource;
		this.readWriteLock=readWriteLock;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			sharedResource.consume(readWriteLock);
		}catch(Exception e) {
			
		}
	}
	

}
