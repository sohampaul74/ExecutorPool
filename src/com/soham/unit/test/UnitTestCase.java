package com.soham.unit.test;

import com.soham.pool.element.ExecutorPool;

public class UnitTestCase {
	public static void main(String[] args) {
		ExecutorPool tp = new ExecutorPool(10);
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo1");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo2");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo3");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo4");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo5");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo6");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo7");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo8");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo9");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo11");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo12");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo13");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo14");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo15");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo16");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo17");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo18");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo19");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo21");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo22");
			}
		});
		tp.addTaskInQueue(new Runnable() {
			public void run() {
				System.out.println("gtfo gtfo23");
			}
		});
		tp.stopPool();
	}
}
