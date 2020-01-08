/*
 * @Descripttion: 
 * @Author: 
 * @Date: 2019-12-09 17:21:11
 * @LastEditors  : jiefeng
 * @LastEditTime : 2020-01-08 11:14:06
 */
package com.fire.array;


/**
 * Duplicate
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
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