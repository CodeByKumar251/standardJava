package javaBasics.com.learning.multiThreading.customLock.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
	
	boolean isAvailable=false;
	
	public void producer(ReadWriteLock lock) {
		try {
			lock.readLock().lock();
			System.out.println("lock acquired by " + Thread.currentThread().getName());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.readLock().unlock();
			System.out.println("lock released by "+Thread.currentThread().getName());
		}
	}
	
	public void consume(ReadWriteLock lock) {
		try {
			lock.writeLock().lock();
			System.out.println("lock acquired by " + Thread.currentThread().getName());
			isAvailable = true;
		}catch(Exception e) {
			
		}finally {
			lock.writeLock().unlock();
			System.out.println("lock released by "+Thread.currentThread().getName());
		}
	}
	

}
