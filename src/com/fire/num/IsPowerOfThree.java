/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-24 15:35:14
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-24 15:36:04
 */
package com.fire.num;

/**
 * IsPowerOfThree
 */
public class IsPowerOfThree {

    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;   
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfThree().isPowerOfThree(9));
    }
}