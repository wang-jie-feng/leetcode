/*
 * @Descripttion: 
 * @Author: jiefeng.w@foxmail.com
 * @Date: 2020-01-13 12:05:29
 * @LastEditors  : jiefeng
 * @LastEditTime : 2020-01-13 14:08:07
 */
package com.fire.thread;

/**
 * Foo
 */
public class Foo {
    
    private boolean firstFinished;
    private boolean secondFinished;
    private Object lock = new Object();


    public void first(Runnable printFirst) throws InterruptedException {
        
        synchronized (lock) {
            printFirst.run();
            // 当第一次执行完成之后，改变标记的状态，使第二个方法可以运行
            firstFinished = true;
            lock.notifyAll(); 
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        synchronized (lock) {
            while (!firstFinished) {
                // 如果第一个还没有运行过，那么释放锁，重新竞争
                lock.wait();
            }
        
            // 如果第一个已经运行过，那么可以继续运行
            printSecond.run();
            secondFinished = true;
            lock.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        synchronized (lock) {
           while (!secondFinished) {
                lock.wait();
            }

            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        } 
    }
}