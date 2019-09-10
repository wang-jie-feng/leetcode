package com.fire.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/9 20:51
 * @histoty 2019/9/9 20:51 created by jiefeng
 */
public class plusOne {
    public int[] plusOne(int[] digits){
//        List<Integer> res = new ArrayList<>(digits.length);
        int[] res = new int[digits.length];
        int sum = 0;
        int one = 1;
        for (int i = digits.length-1;i>=0;i--){
            sum = one + digits[i];
            one = sum/10;
            res[i] = sum%10;
        }

        if (one > 0){
            int[] res1 = new int[digits.length+1];
            res1[0] = one;
            for (int i = 1; i < res1.length; i++) {
                res1[i] = res[i-1];
            }
            return res1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] x = new int[]{9,9,9};
        for (int i = 0; i < new plusOne().plusOne(x).length; i++) {
            System.out.println(new plusOne().plusOne(x)[i]);
        }
    }
}
