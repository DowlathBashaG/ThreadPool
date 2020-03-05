package io.dowlathbasha.datastructurecoding.thread.pool;

public class ThreadPoolTest {
	public static void main(String ags[]) throws Exception{
		ThreadPool tp = new ThreadPool(2);
		Runnable task = new Task();
		tp.execute(task);
		tp.execute(task);
		tp.shutDown();
	}

}
