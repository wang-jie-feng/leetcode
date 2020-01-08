/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-24 15:22:21
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-24 15:27:30
 */
package com.fire.num;

import java.util.ArrayList;
import java.util.List;

/**
 * FizzBuzz
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0 && i%5 ==0) {
                list.add("FizzBuzz");
            }else if (i%3 == 0) {
                list.add("Fizz");
            }else if (i%5 ==0) {
                list.add("Buzz");
            }else {
                list.add(i+"");
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzz(15).toString());;
    }
}