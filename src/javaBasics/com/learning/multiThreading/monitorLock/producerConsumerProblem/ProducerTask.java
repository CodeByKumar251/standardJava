package javaBasics.com.learning.multiThreading.monitorLock.producerConsumerProblem;

public class ProducerTask implements Runnable{

	SharedResource sharedResource;
	
	public ProducerTask(SharedResource sharedResource) {
		this.sharedResource=sharedResource;
	}
	
	@Override
	public void run() {
		try {
			for(int i=1;i<=6;i++) {
				sharedResource.produce(i);
			}
		}catch(Exception e) {
			
		}
	}
}
