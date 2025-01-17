package javaBasics.com.learning.multiThreading.monitorLock;

public class Main {
	
	public static void main(String args[]) {
		MonitorLockExample obj=new MonitorLockExample();
		
		MonitorThread1Runnable runnableObj1=new MonitorThread1Runnable(obj);
		Thread t1=new Thread(runnableObj1);
		
		MonitorThread2Runnable runnableObj2=new MonitorThread2Runnable(obj);
		Thread t2=new Thread(runnableObj2);
		
		MonitorThread3Runnable runnableObj3=new MonitorThread3Runnable(obj);
		Thread t3=new Thread(runnableObj3);
		
		
		
		
		/* we can directly because Runnable is functional interface, we can use lambda to 
		 * directly make and implement
		 */
//		Thread t1=new Thread(()->{obj.task1();});
//		Thread t2=new Thread(()->{obj.task2();});
//		Thread t3=new Thread(()->{obj.task3();});
		
		t1.start();
		t2.start();
		t3.start();
	}

}
