package javaBasics.com.learning.multiThreading.monitorLock.depricatedMethod;

public class Main {
	
	@SuppressWarnings("removal")
	public static void main(String args[]) {
		
		System.out.println("Main thread started");
		
		SharedResource sharedResource=new SharedResource();
		
		Thread th1=new Thread(()->{
			System.out.println("thread1 calling update");
			sharedResource.update();
		});
		
		Thread th2=new Thread(()->{
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			System.out.println("Thread2 calling update");
			sharedResource.update();
		});
		
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		
		System.out.println("Thread 1 is suspended");
		th1.suspend();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		
		th1.resume();
		System.out.println("Main thread has finished");
		
		
		
	}

}
