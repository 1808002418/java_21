package com.hwl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
public class Main {
	public static void main(String[] args) throws InterruptedException {
		/**
		 * 不要使用线程池尽量不要使用ThreadLocal。虽然可以正常运行，但创建太快又不能复用，会给ThreadLocal造成很大压力。这里golang的channel是比较好的方案，希望java世界在虚拟线程的普及中也有类似的方案出来
		 * 不要使用synchronized，因为其会锁住真实的ForkJoinPool造成协程调度失败。使用ReentrantLock
		 * 必须使用分代zgc，否则gc压力比过去大很多
		 *
		 */
//		方法一：直接创建虚拟线程
//		f1();
//		方法二：创建虚拟线程但不自动运行，手动调用start()开始运行
//		f2();
//		方法三：通过虚拟线程的 ThreadFactory 创建虚拟线程
//		f3();
//		方法四：Executors.newVirtualThreadPer-TaskExecutor()
//		f4();
	}


	private static void f1() {
		Thread vt = Thread.startVirtualThread(() -> {
			System.out.println("hello world virtual thread f1");
		});
	}

	private static void f2() {
		Thread vt = Thread.ofVirtual().unstarted(() -> {
			System.out.println("hello world virtual thread f2");
		});
		vt.start();
	}

	private static void f3() throws InterruptedException {
		ThreadFactory tf = Thread.ofVirtual().factory();
		Thread vt = tf.newThread(() -> {
			System.out.println("Start virtual thread... f3");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("End virtual thread. f3");
		});
		vt.start();
		vt.join();
	}

	private static void f4() {
		ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
		executor.submit(() -> {
			System.out.println("Start virtual thread... f4");
			Thread.sleep(1000);
			System.out.println("End virtual thread. f4");
			return true;
		});
		executor.close();
	}
}