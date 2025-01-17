package javaBasics.com.learning.multiThreading.monitorLock.producerConsumerProblem;

/*
 * Questions:-
 * Two thread a producer and a consumer, share a common, fixed size buffer as a queue.
 * The producer's job is to generate data and put it into the buffer, while the consumer's job is to consume 
 * the data from the buffer.
 * The problem is to make sure that the producer won't produce data if the buffer is full, and the consumer 
 * won't consume data if the buffer is empty
 */
public class Main {
	
	public static void main(String args[]) {
		
		SharedResource sharedResource=new SharedResource(3);
		
		ProducerTask producerTask=new ProducerTask(sharedResource);
		Thread producerThread=new Thread(producerTask);
		
		ConsumerTask consumerTask=new ConsumerTask(sharedResource);
		Thread consumerThread=new Thread(consumerTask);
		
		producerThread.start();
		consumerThread.start();
		
	}

}
