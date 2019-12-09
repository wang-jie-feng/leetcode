/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-09 17:21:11
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-09 18:35:56
 */
package com.fire.array;

/**
 * Duplicate
 * 首先将每一个位置上的归位，如果遇到相等那么返回true
 */
public class Duplicate {

    public static boolean duplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1,3, 0};
        System.out.println(duplicate(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}