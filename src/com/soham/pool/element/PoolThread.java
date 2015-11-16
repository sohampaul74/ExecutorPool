package com.soham.pool.element;

import java.util.concurrent.BlockingQueue;

import com.soham.pool.controller.ThreadNotifier;

public class PoolThread implements Runnable {

	private String poolId = null;
	private BlockingQueue<PoolThread> taskQueue = null;
	//private ThreadNotifier threadNotifier = null;
	private boolean isStopped = false;
	
	public PoolThread(BlockingQueue<PoolThread> taskQueue, ThreadNotifier threadNotifier) {
		this.taskQueue = taskQueue;
		//this.threadNotifier = threadNotifier;
		poolId = threadNotifier.receiveId();
	}
	
	public void run() {
		while (!isStopped) {
			while (taskQueue.poll() == null) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Runnable runnable = taskQueue.poll();
			runnable.run();
		}
	}
	
	public void stopThread() {
		isStopped = true;
	}
	
	public String getPoolId() {
		return poolId;
	}
	
}
