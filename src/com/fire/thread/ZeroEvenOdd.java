/*
 * @Descripttion: 
 * @Author: jiefeng.w@foxmail.com
 * @Date: 2020-01-13 15:03:01
 * @LastEditors  : jiefeng
 * @LastEditTime : 2020-01-13 15:56:29
 */
package com.fire.thread;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * ZeroEvenOdd
 */
public class ZeroEvenOdd {

    private int n;
    
    // 因为以0开始，所以刚开始就得有一个信号量
    Semaphore z = new Semaphore(1);
    Semaphore e = new Semaphore(0);
    Semaphore o = new Semaphore(0);
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            z.acquire();
            printNumber.accept(0);
            // 判断下一个应该是输出偶数还是奇数
            if((i&1)==0) {
                // 给奇数增加一个信号量
        		o.release();
        	}else {
                // 给偶数增加一个信号量
        		e.release();
        	}
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for(int i=2; i<=n; i+=2) {
            // 将自身信号量移除
        	e.acquire();
        	printNumber.accept(i);
        	z.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i=1; i<=n; i+=2) {
        	o.acquire();
        	printNumber.accept(i);
        	z.release();
        }
    }
}