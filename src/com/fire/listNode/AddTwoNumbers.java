/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-25 14:17:53
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-25 14:27:37
 */
package com.fire.listNode;

/**
 * AddTwoNumbers 需要考虑进位 需要考虑一个链表比另一个长的情况
 * 还要考虑链表全部遍历完了之后如果还有一个进位值，那么应该添加上去
 * 使用一个空的头结点当作链表开端，可以简化流程并且更易于理解
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 使用一个空的头结点来当做开始的值
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            // 此处如果某一个链表已经为空，那么使用0来占位
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            // 求进位值
            carry = sum / 10;
            // 设置当前位置值
            curr.next = new ListNode(sum % 10);
            // 继续往下遍历
            curr = curr.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        // 如果都遍历结束之后，还有一个进位值，那么将其进位
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}