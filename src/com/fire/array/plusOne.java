/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-09-09 20:51:41
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-08 13:02:15
 */
package com.fire.array;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo 2019/9/10 我觉得可以想一个办法来解决最后需要复制数组的问题
 * @date 2019/9/9 20:51
 * @histoty 2019/9/9 20:51 created by jiefeng
 */
public class plusOne {
//    每次将最后一个数字加一，然后除十进位，到最后一位，判断一下，如果需要进位了那么需要一个加一位的数组，然后将数据赋值过去，
//    如果不需要那么就不做操作
    public int[] plusOne(int[] digits){
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
        int[] x = new int[]{9,9,9,10,11};
        for (int i = 0; i < new plusOne().plusOne(x).length; i++) {
            System.out.println(new plusOne().plusOne(x)[i]);
        }
    }
}
