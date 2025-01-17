package javaBasics.com.learning.multiThreading.monitorLock;

public class MonitorLockExample {
	
	public synchronized void task1() {
		//do something
		try {
			System.out.println("inside task1");
			Thread.sleep(10000);
			System.out.println("inside task1 after end sleep time");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void task2() {
		System.out.println("task2, but before synchronized");
		synchronized (this) {
			System.out.println("task2, inside synchronized");
		}
	}
 
	
	public void task3() {
		System.out.println("task3");
	}

}
