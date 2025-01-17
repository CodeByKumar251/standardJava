package javaBasics.com.learning.multiThreading.customLock.SemaphoreLock;

public class ProducerThread implements Runnable{
	
	private SharedResource sharedResource;
	
	public ProducerThread(SharedResource sharedResource) {
		this.sharedResource=sharedResource;
	}

	@Override
	public void run() {
		sharedResource.producer();
	}
	

}
