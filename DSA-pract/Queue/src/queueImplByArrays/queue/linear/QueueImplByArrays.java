package queueImplByArrays.queue.linear;

public class QueueImplByArrays {

	int [] arr;
	int topOfQueue;
	int beginningOfQueue;
	public QueueImplByArrays(int size) {
	this.arr = new int [size];
	this.topOfQueue = -1;
	this.beginningOfQueue = -1;
	System.out.println("Successfully created an empty queue of size: "+size);
	}//end of cons
	
	public void enQueue(int value) throws Exception {
		if(isQueueFull()) throw new Exception("Queue overflow err"); 
		else if(isQueueEmpty()) {
			beginningOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}else {//if the queue already has some elements in it then no need to initialize beginning index  
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}
	    printQueue();
	}//end of method
    public void printQueue() {
    	if(!isQueueEmpty()) {
    		System.out.println("Queue now ...");
    		for (int i = beginningOfQueue; i < topOfQueue; i++)
				System.out.println(arr[i]+" ");
    	System.out.println();
    	}else {
    		System.out.println("Queue is empty!");
    	}
    }//end of method
    
    public void deQueue() {
    	if(isQueueEmpty())
    		System.out.println("Queue underflow error!!");
    	else {
    		System.out.println("Dequeing value from Queue...");
    	    System.out.println("Dequeued: "+arr[beginningOfQueue]+" from queue");
    	    beginningOfQueue++;
    	    if(beginningOfQueue>topOfQueue)//if last element in the Queue is Dequeued
    	    beginningOfQueue=topOfQueue=-1;
    	}//else
    	printQueue();
    	System.out.println();
    }//end of method
    
    public boolean isQueueEmpty() {
		if(beginningOfQueue==-1|| (beginningOfQueue==arr.length))
    	return true;
		else
			return false;
    }//end of method
    
    private boolean isQueueFull() {
    if(topOfQueue==arr.length-1)
    	return true;
    else
    	return false;
	}//end of method
    
    public void peekOperation() {
    	if(!isQueueEmpty())
    		System.out.println(arr[beginningOfQueue]);
    	else System.out.println("The queue is empty!!");
    }//end of method 
   
    public void deleteQueue() {
    	arr=null;
    	System.out.println("Queue is successfully deleted !");
    }//end of method 
}//end of class
