/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-11 10:23:07
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-11 10:29:25
 */
package com.fire.string;

/**
 * ReverseString
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length-1;
        while (low < high) {
            char item = s[low];
            s[low] = s[high];
            s[high] = item;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'a','b','c','d'};
        new ReverseString().reverseString(s);
        for (char c : s) {
            System.out.println(c);
        }
    }
}