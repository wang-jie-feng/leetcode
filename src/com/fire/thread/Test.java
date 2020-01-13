/*
 * @Descripttion: 
 * @Author: jiefeng.w@foxmail.com
 * @Date: 2020-01-13 12:08:04
 * @LastEditors  : jiefeng
 * @LastEditTime : 2020-01-13 12:28:04
 */
package com.fire.thread;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Thread thread1 = new Thread(() -> {

            try {
                foo.first(() -> {
                    System.out.println("first");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                foo.second(() -> {
                    System.out.println("second");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                foo.third(() -> {
                    System.out.println("third");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread2.start();
        thread1.start();
        thread3.start();
    }
}