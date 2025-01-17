package javaBasics.com.learning.multiThreading.monitorLock.producerConsumerProblem;

public class ConsumerTask implements Runnable{

	SharedResource sharedResource;
	
	public ConsumerTask(SharedResource sharedResource) {
		this.sharedResource=sharedResource;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=6;i++) {
			sharedResource.consume();
		}
	}

}
