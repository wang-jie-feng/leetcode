/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-12 11:39:41
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-12 12:31:39
 */
package com.fire.string;

/**
 * Reverse
 */
public class Reverse {

    public int reverse(int x) {
        try {
            String str = "";
        int o = 0;
        if (x < 0) {
            o = 1;
            str = String.valueOf(-x);
        }else if (x == 0){
            return 0;
        } else {
            str = String.valueOf(x);
        }
        char[] res = str.toCharArray();
        reverseString(res);
        String a = String.valueOf(res);
        Integer y = Integer.valueOf(a);
        if (o == 1) {
            return -y;
        }else {
            return y;   
        }
        } catch (Exception e) {
            //TODO: handle exception
            return 0;
        }
        
    }

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
        System.out.println(new Reverse().reverse(1534269));
    }
}