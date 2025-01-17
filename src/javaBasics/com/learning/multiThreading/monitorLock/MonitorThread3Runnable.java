package javaBasics.com.learning.multiThreading.monitorLock;

public class MonitorThread3Runnable implements Runnable{
	
	MonitorLockExample obj;
	public MonitorThread3Runnable(MonitorLockExample obj) {
		this.obj=obj;
	}
	
	@Override
	public void run() {
		obj.task3();
	}

}
