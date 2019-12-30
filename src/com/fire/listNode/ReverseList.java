/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-13 10:15:31
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-26 10:29:51
 */
package com.fire.listNode;


/**
 * ReverseList
 * 题解：思想就是将每一个指向的关系反转过来
 * 将当前节点的下一个指向转为上一个元素
 * 
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;

            curr.next = prev;
            prev = curr;
            
            curr = nextTemp;
        }
        return prev;
    }
}