/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-16 18:28:48
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-16 18:48:54
 */
package com.fire.string;

/**
 * ReplaceSpace 题目描述：将给定的字符串的空格替换成 %20
 * 
 */
public class ReplaceSpace {

    public String replaceSpace(StringBuffer str) {
        int P1 = str.length() - 1;
        for (int i = 0; i <= P1; i++)
            if (str.charAt(i) == ' ')
                str.append("  ");

        int P2 = str.length() - 1;
        while (P1 >= 0 && P2 > P1) {
            char c = str.charAt(P1--);
            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("a c");
        System.out.println(new ReplaceSpace().replaceSpace(str));
        System.out.println("fjdkd");
    }
}