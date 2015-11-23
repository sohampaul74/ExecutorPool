package com.soham.pool.element;

//import java.util.concurrent.BlockingQueue;
import com.soham.pool.controller.ThreadNotifier;

class PoolThread extends Thread {

	private String poolId = null;
	//private BlockingQueue<Runnable> taskQueue = null;
	private TaskQueue taskQueue = null;
	//private ThreadNotifier threadNotifier = null;
	private boolean isStopped = false;
	
//	public PoolThread(BlockingQueue<Runnable> taskQueue, ThreadNotifier threadNotifier) {
	public PoolThread(TaskQueue taskQueue, ThreadNotifier threadNotifier) {
		this.taskQueue = taskQueue;
		//this.threadNotifier = threadNotifier;
		poolId = threadNotifier.receiveId();
	}
	
	public void run() {
		while (!isStopped) {
			Runnable runnable = taskQueue.getTask();
			if(runnable != null) {
				runnable.run();
			}
		}
		return;
	}
	
	public void stopThread() {
		isStopped = true;
		this.interrupt();
	}
	
	public String getPoolId() {
		return poolId;
	}
	
}
