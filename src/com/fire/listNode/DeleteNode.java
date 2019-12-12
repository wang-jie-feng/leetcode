/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-12 16:49:45
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-12 17:02:19
 */
package com.fire.listNode;

/**
 * DeleteNode
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}