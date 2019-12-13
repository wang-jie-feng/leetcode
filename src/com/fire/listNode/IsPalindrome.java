/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-13 10:53:27
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-13 11:06:25
 */
package com.fire.listNode;

/**
 * IsPalindrome
 * 解题思路：快指针慢指针都从头节点开始，快指针是慢指针的两倍速度
 * 一边遍历，一边将慢指针所遍历的反转
 * 之后慢指针和慢指针之后的一个开始遍历并对比
 */
public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head;
        ListNode pre = head, prepre = null;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }
        // 解决奇偶问题
        if (fast != null) {
            slow = slow.next;
        }
        while (pre != null && slow != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }
}