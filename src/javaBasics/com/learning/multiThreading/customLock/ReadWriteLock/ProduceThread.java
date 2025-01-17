package javaBasics.com.learning.multiThreading.customLock.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class ProduceThread implements Runnable{
	
	private SharedResource sharedResource;
	private ReadWriteLock readWriteLock;
	
	public ProduceThread(SharedResource sharedResource,ReadWriteLock readWriteLock) {
		this.sharedResource=sharedResource;
		this.readWriteLock=readWriteLock;
	}

	@Override
	public void run() {
		sharedResource.producer(readWriteLock);
		
	}

}
