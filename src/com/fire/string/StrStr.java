/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-12 10:58:17
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-12 11:34:31
 */
package com.fire.string;

/**
 * StrStr
 */
public class StrStr {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int length = needle.length();
        char[] hays = haystack.toCharArray();
        for (int i = 0; i < hays.length; i++) {
            if (i + length > hays.length) {
                return -1;
            }
            String str = haystack.substring(i, i+length);
            if (str.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack  = "aa";
        String needle  = "aaa";
        System.out.println(new StrStr().strStr(haystack, needle));;
    }
}