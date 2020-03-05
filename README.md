# ThreadPool
This is not buit in thread pool. Created manual thread pool service using the following files.

1. ThreadPool.java

    It contains , 
    
        a. taskQueue assigned in the BlockingQueue<Runnable>
        
        b. execute method , in this method putting the task.
        
        c. isShutDown initiated and shutDown two methods for returning the boolean value for shutdown.
 
2. ThredPoolsThread.java

    It contains,
    
        a. In the run method - Runnable runnable = this.task.take();
        
        b. runnable.run(); // task executed and task has been taken.
        
        c. this.threadPool.isShutDownInitiated() && this.task.size()==0 sleep for some time.
        
3. Task.java

    It contains,
    
        a. Sleep for 1 minute and execute task.

4. ThreadPoolTest.java [ Client Program ]

    It contains,
    
        a. Execute task 
        
        b. Shutdown
 
 Output : 
 
Thread 1added in pool
Thread 2added in pool
Task executed
Task executed
Added task executed
Task has been taken
Task has been taken
Added task executed
Executing task
Task executed
Executing task
Task executed
Task executed
Task executed
