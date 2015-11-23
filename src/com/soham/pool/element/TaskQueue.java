package com.soham.pool.element;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
	private Queue<Runnable> taskQueue = null;
	
	private TaskQueue() {
		taskQueue = new LinkedList<Runnable>();
	}
	
	public void addTask(Runnable r) {
		taskQueue.add(r);
	}
	
	public synchronized Runnable getTask() {
		//System.out.println(taskQueue.size());
		return taskQueue.poll();
	}
	
	public static class TaskQueueFactory {
		public static TaskQueue taskQueueInstance = new TaskQueue();
	}
	
}
