/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-09 14:20:01
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 10:41:52
 */
package com.fire.array;


/**
 * OnlyOne
 * 此处使用了异或运算，相同为0，不同为一
 * 所以如果一个数两次和同一个数异或运算，那么得到的是之前的数
 */
public class OnlyOne {
    public int singleNumber(int[] nums) {
        int n = 0;
        for (int i : nums) {
            n ^= i;
        }
        return n;
    }

    public static void main(String[] args) {
        // System.out.println(new OnlyOne().singleNumber(arr));
        System.out.println(7^6);
    }
}