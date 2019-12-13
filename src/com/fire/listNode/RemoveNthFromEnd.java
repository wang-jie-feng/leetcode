/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-13 09:45:17
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-13 10:09:22
 */
package com.fire.listNode;

/**
 * RemoveNthFromEnd
 * 解题思路，首先使用哑节点来表示head之前的节点
 * 获取长度
 * 倒数第n个，就是l-n+1个
 * 将其替换
 * 第二个思路：双指针
 * 首先第一个指针遍历到n+1个位置
 * 之后第一个第二个指针一起遍历，当第一个指针到头的时候停止
 * 此时第二个指针就是倒数第n个
 * 替换即可
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
        // 获取倒数第n个的位置
        length -= n;
        // 从哑节点开始遍历
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second  = dummy;
        for (int i = 0; i < n+1; i++) {
            first = first.next;
        }
        // 两者一起遍历
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}