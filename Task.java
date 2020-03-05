package io.dowlathbasha.datastructurecoding.thread.pool;

public class Task extends Thread {
 public void run(){
	 try{
		  Thread.sleep(1000);
		  System.out.println("Executing task");
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
   }
}