package javaBasics.com.learning.multiThreading.monitorLock.realExample;

public class SharedResource {
	
	boolean itemAvailable=false;
	
	//synchronized put the monitor lock
	public synchronized void addItem() {
		itemAvailable=true;
		System.out.println("Item added by: "+Thread.currentThread().getName()+" and invoking all threads which "
				+ "are waiting");
		notifyAll();
	}
	
	public synchronized void consumeItem() {
		System.out.println("CustomItem method invoked by: "+Thread.currentThread().getName());
		
		//using while loop to avoid "spurious wake-up", sometime because of system noise
		while(!itemAvailable) {
			try {
				System.out.println("Thread "+Thread.currentThread().getName());
				wait(); //it releases the monitor lock
			}catch(Exception e) {
				//handled exception here
			}
		}
		System.out.println("Item consumed by: "+Thread.currentThread().getName());
		itemAvailable=false;
	}

}
