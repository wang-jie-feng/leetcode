/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-15 14:53:07
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-15 14:57:30
 */
package com.fire.listNode;


/**
 * GgetDecimalValue
 */
public class GgetDecimalValue {

    public int getDecimalValue(ListNode head) {
        String in = "";
        while(head!= null){
            in = in + head.val;
            head = head.next;
        }
        int x = Integer.parseInt(in);
     return x;   
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt(Integer.toBinaryString(10)));
    }
}