package com.soham.pool.element;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.LinkedBlockingDeque;

import com.soham.pool.controller.ThreadNotifier;
import com.soham.pool.controller.ThreadController;
import com.soham.pool.element.TaskQueue.TaskQueueFactory;

public class ExecutorPool {

//	public enum TASK_PRIORITY {
//		EXTREME (10),
//		IMMEDIATE (9),
//		HIGHEST(8), 
//		HIGH(7), 
//		MEDIUM(6), 
//		LOW(5), 
//		LOWEST(4);
//		
//		private int PRIORITY_CODE = 0;
//		TASK_PRIORITY(int PRIORITY_CODE) {
//			this.PRIORITY_CODE = PRIORITY_CODE;
//		}
//		public int getPRIORITY_CODE() {
//			return PRIORITY_CODE;
//		}
//	}
	
	private Map<String, PoolThread> threadMap = null;
	private TaskQueue task_queue = null;
	private ThreadNotifier threadNotifier = null;
	private int maxNumberOfTask = 0;
	
	public ExecutorPool(int maxNumberOfTask) {
		threadMap = new HashMap<String, PoolThread>();
		task_queue = TaskQueueFactory.taskQueueInstance;
		this.maxNumberOfTask = maxNumberOfTask;
		threadNotifier = new ThreadController();
		populateThreadMap();
	}
	
	private void populateThreadMap() {
		for (int i = 0; i < maxNumberOfTask; i++) {
			PoolThread pt = new PoolThread(task_queue, threadNotifier);
			threadMap.put(pt.getPoolId(), pt);
			//System.out.println(pt.getPoolId());
			pt.start();
		}
	}
	
	public void addTaskInQueue(Runnable runnable) {
		task_queue.addTask(runnable);
	}
	
	public void stopPool() {
		for (Entry<String, PoolThread> thread : threadMap.entrySet()) {
			thread.getValue().stopThread();
		}
	}
}