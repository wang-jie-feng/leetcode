/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-24 15:35:14
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-26 09:42:16
 */
package com.fire.num;

/**
 * IsPowerOfThree
 */
public class IsPowerOfThree {

    public boolean isPowerOfThree(int n) {
        // 使用数学公式来改变
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;   
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfThree().isPowerOfThree(1000000));
    }
}