package javaBasics.com.learning.multiThreading.customLock.reentrantLock.example1;

public class ProducerThread implements Runnable{
	
	SharedResource sharedResource;
	
	public ProducerThread(SharedResource sharedResource) {
		this.sharedResource=sharedResource;
	}

	@Override
	public void run() {
		sharedResource.producer();
	}

}
