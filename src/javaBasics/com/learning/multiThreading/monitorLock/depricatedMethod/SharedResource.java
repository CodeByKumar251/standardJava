package javaBasics.com.learning.multiThreading.monitorLock.depricatedMethod;

public class SharedResource {
	
	boolean isAvailable=false;
	
	public synchronized void update() {
		isAvailable=true;
		System.out.println("monitorlock acquired");
		try {
			Thread.sleep(8000);
		}catch(Exception e) {
			
		}
		System.out.println("monitor lock release");
		
	}

}
