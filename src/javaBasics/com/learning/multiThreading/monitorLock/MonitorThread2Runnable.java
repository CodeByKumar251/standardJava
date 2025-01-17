package javaBasics.com.learning.multiThreading.monitorLock;

public class MonitorThread2Runnable implements Runnable{

	MonitorLockExample obj;
	public MonitorThread2Runnable(MonitorLockExample obj) {
		this.obj=obj;
	}
	
	@Override
	public void run() {
		obj.task2();
	}

}
