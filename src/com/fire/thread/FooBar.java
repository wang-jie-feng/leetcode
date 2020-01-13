/*
 * @Descripttion: 
 * @Author: jiefeng.w@foxmail.com
 * @Date: 2020-01-13 14:21:37
 * @LastEditors  : jiefeng
 * @LastEditTime : 2020-01-13 14:53:59
 */
package com.fire.thread;

/**
 * FooBar
 */
class FooBar {
    
    private int n;
    // 使用此当做一个标志，且使用volatile来标志修改为原子性，一次只能被一个线程改变
    private volatile int flag = 0;
	public FooBar(int n) {
		this.n = n;
	}

	public void foo(Runnable printFoo) throws InterruptedException {
         for (int i = 0; i < n; i++) {
			while(flag != 0){
                // 暂停当前进程，执行其他线程
				Thread.yield();
			}
			printFoo.run();
			flag = 1;
		}
	}

	public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
			while(flag != 1){
				Thread.yield();
			}
			printBar.run();
			flag = 0;
		}
	}
    
}