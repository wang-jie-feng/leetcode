/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-24 14:59:21
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-24 15:19:52
 */
package com.fire.design;

import java.util.Stack;

/**
 * MinStack 设计一个栈，可以在常数时间复杂度内获取到栈内最小元素 思路：使用一个最小栈用来维护最小的值
 */
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        // 数据栈
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    /**
     * 入栈操作
     * @param x
     */
    public void push(int x) {
        this.stack.push(x);
        if (this.minStack.isEmpty()) {
            this.minStack.push(x);
            return;
        }
        if (x < this.minStack.peek()) {
            minStack.push(x);
        }else {
            // 如果新加元素没有原来的栈顶元素小，那么最小站里边还是添加之前最小栈的栈顶元素
            minStack.push(minStack.peek());
        }
    }

    /**
     * 出栈操作
     */
    public void pop() {
        this.stack.pop();
        this.minStack.pop();
    }

    // 获取栈顶元素
    public int top() {
        return stack.peek();
    }

    /**
     * 获取栈的最小元素
     * @return
     */
    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(1);
        minStack.push(4);
        minStack.push(0);
        minStack.push(5);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}