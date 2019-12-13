/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-13 09:45:17
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-13 09:52:36
 */
package com.fire.listNode;

/**
 * RemoveNthFromEnd
 * 解题思路，首先使用哑节点来表示head之前的节点
 * 获取长度
 * 倒数第n个，就是l-n+1个
 * 将其替换
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}