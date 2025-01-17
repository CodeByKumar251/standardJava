package javaBasics.com.learning.multiThreading.monitorLock.producerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
	
	//size of buffer queue
	private int bufferSize;
	private Queue<Integer> bufferQueue;
	
	public SharedResource(int bufferSize) {
		this.bufferSize=bufferSize;
		bufferQueue=new LinkedList<Integer>();
	}
	
	public synchronized void produce(int item) {
		
		//can also use if but while used to avoid spurious wake-up
		while(bufferQueue.size()==bufferSize) {
			System.out.println("bufferQueue has full");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		bufferQueue.add(item);
		System.out.println("Produced: "+item);
		//notify consume thread 
		notify();
		
	}
	
	public synchronized void consume() {
		
		while(bufferQueue.isEmpty()) {
			System.out.println("bufferQueue is empty");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int ele=bufferQueue.poll();
		System.out.println("consume element: "+ele);
		
		//notidy produce thread
		notify();
	}
}
