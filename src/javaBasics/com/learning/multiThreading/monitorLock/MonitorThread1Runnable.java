package javaBasics.com.learning.multiThreading.monitorLock;

public class MonitorThread1Runnable implements Runnable {

	MonitorLockExample obj;
	public MonitorThread1Runnable(MonitorLockExample obj) {
		this.obj=obj;
	}
	
	@Override
	public void run() {
		obj.task1();
	}

}
