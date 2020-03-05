package io.dowlathbasha.datastructurecoding.thread.pool;

import java.util.concurrent.BlockingQueue;

public class ThreadPoolsThread extends Thread {
	private BlockingQueue<Runnable> task;
	private ThreadPool threadPool;
	ThreadPoolsThread(BlockingQueue<Runnable> task,ThreadPool threadPool){
		this.task = task;
		this.threadPool = threadPool;
	}
	public void run(){
		try{
			while(true){
				System.out.println("Task executed");
				Runnable runnable = this.task.take();
				System.out.println("Task has been taken");
				runnable.run();
				System.out.println("Task executed");
				if(this.threadPool.isShutDownInitiated() && this.task.size()==0)
					this.interrupted();
				    Thread.sleep(1);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
