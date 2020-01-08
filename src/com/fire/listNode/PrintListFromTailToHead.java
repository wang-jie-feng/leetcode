/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-19 17:47:06
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-19 17:47:19
 */
package com.fire.listNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * PrintListFromTailToHead 实现逆序打印链表
 */
public class PrintListFromTailToHead {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(10);
        listNode.next = new ListNode(9);
        // System.out.println(new PrintListFromTailToHead().printListFromTailToHead(listNode).toString());
        // new PrintListFromTailToHead().printListFromTailToHead2(listNode);
        new PrintListFromTailToHead().printListFromTailToHead3(listNode);
    }

    // 1. 第一种方法使用递归，
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode != null) {
            // 如果没有遍历到头，那么调用自身继续往里边加
            list.addAll(printListFromTailToHead(listNode.next));
            // 开始的等于被加入到数组的最后边
            list.add(listNode.val);
        }
        return list;
    }

    // 2. 第二种方式是使用一个空节点来当头结点，然后构建一个新的节点，叫做头插法
    public void printListFromTailToHead2(ListNode listNode) {
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            // 首先记录一下当前位置的下一个
            ListNode memo = listNode.next;
            // 将当前位置的插入头结点和头结点的下一个
            listNode.next = head.next;
            head.next = listNode;
            // 将当前节点向后移
            listNode = memo;
        }
        while (head.next != null) {
            System.out.println(head.next.val);
            head = head.next;
        }
    }
    // 3. 使用栈这种数据结构，先进后出
    public void printListFromTailToHead3(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}