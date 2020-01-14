/*
 * @Descripttion: 
 * @Author: jiefeng.w@foxmail.com
 * @Date: 2020-01-13 15:58:04
 * @LastEditors  : jiefeng
 * @LastEditTime : 2020-01-13 16:34:28
 */
package com.fire.thread;

import java.util.function.IntConsumer;

/**
 * ZeroEvenOdd2 使用锁来实现
 */
public class ZeroEvenOdd2 {

    private int n;

    private volatile int z = 0;

    public ZeroEvenOdd2(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while (z != 0) {
            Thread.yield();
        }
        for (int i = 0; i < n; i++) {
            printNumber.accept(0);
            if ((i & 1) == 0) {
                // 给奇数增加一个信号量
                z = 1;
            } else {
                // 给偶数增加一个信号量
                z = 2;
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            // 将自身信号量移除
            while (z != 1) {
                Thread.yield();
            }
            printNumber.accept(i);
            z = 0;
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            while (z != 2) {
                Thread.yield();
            }
            printNumber.accept(i);
            z = 0;
        }
    }

    public static void main(String[] args) {
        ZeroEvenOdd2 zeroEvenOdd2 = new ZeroEvenOdd2(10);
        Thread thread1 = new Thread(() -> {
            try {
                zeroEvenOdd2.zero(x -> System.out.println(x));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                zeroEvenOdd2.even(x -> System.out.println(x));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                zeroEvenOdd2.odd(x -> System.out.println(x));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        thread1.start();
        thread3.start();
        thread2.start();
    }
}