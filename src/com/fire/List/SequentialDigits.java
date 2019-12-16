/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-15 15:00:40
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-15 15:14:01
 */
package com.fire.List;

import java.util.ArrayList;
import java.util.List;

/**
 * SequentialDigits
 */
public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        String code = "123456789";
        List<Integer> list = new ArrayList();
        for (int i = 2; i <= code.length(); i++) {
            for (int j = 0; j < code.length()-1; j++) {
                if (Integer.parseInt(code.substring(j,i+j-1)) > low && Integer.parseInt(code.substring(j,i+j-1)) < high) {
                    list.add(Integer.parseInt(code.substring(j,i+j-1)));
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = new SequentialDigits().sequentialDigits(100,200);
        System.out.println(list.toString());
    }
}