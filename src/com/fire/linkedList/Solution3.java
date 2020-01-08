package com.fire.linkedList;

public class Solution3 {
    public ListNode removeElements(ListNode head, int val){
        if (head == null)
            return null;
        head.next = removeElements(head.next, val);
//        如果当前的值符合那么返回之后的链表，如果不符合，那么连起来并返回
        return head.val == val ? head.next : head;
    }
}
