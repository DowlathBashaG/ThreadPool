package io.dowlathbasha.datastructurecoding.thread.pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
	private BlockingQueue<Runnable> taskQueue;
	private boolean poolShutDownInitiated = false;
	ThreadPool(int nThreads){
	   taskQueue = new LinkedBlockingQueue<Runnable>(nThreads);
	   for(int i=1;i<=nThreads;i++){
		   ThreadPoolsThread tpt = new ThreadPoolsThread(taskQueue,this);
		   tpt.setName("Thread-"+i);
		   System.out.println("Thread "+i+"added in pool");
		   tpt.start();
	   }
	}
	public synchronized void execute(Runnable task) throws Exception{
		if(this.poolShutDownInitiated){
			System.out.println("No more tasks added");
		}
		this.taskQueue.put(task);
		System.out.println("Added task executed");
	}
	public boolean isShutDownInitiated(){
		return poolShutDownInitiated;
	}
	public synchronized void shutDown(){
		poolShutDownInitiated = true;
	}
}
