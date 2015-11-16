package com.soham.pool.element;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ExecutorPool {

	public enum TASK_PRIORITY {
		EXTREME (10),
		IMMEDIATE (9),
		HIGHEST(8), 
		HIGH(7), 
		MEDIUM(6), 
		LOW(5), 
		LOWEST(4);
		
		private int PRIORITY_CODE = 0;
		TASK_PRIORITY(int PRIORITY_CODE) {
			this.PRIORITY_CODE = PRIORITY_CODE;
		}
		public int getPRIORITY_CODE() {
			return PRIORITY_CODE;
		}
	}
	
	private Map<String, PoolThread> threadMap = null;
	private BlockingDeque<Runnable> task_queue = null;
	
	public ExecutorPool() {
		threadMap = new HashMap<String, PoolThread>();
		task_queue = new LinkedBlockingDeque<Runnable>(1024);
	}
	
	
	
}