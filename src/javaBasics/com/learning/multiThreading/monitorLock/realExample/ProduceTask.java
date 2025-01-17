package javaBasics.com.learning.multiThreading.monitorLock.realExample;

public class ProduceTask implements Runnable{
	
	SharedResource sharedResource;
	
	public ProduceTask(SharedResource sharedResource) {
		this.sharedResource=sharedResource;
	}

	@Override
	public void run() {
		System.out.println("Producer thread: "+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			
		}
		System.out.println("Producer thread time over");
		sharedResource.addItem();
		
	}

}
