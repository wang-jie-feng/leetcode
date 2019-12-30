/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-09 14:34:44
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-09 14:43:19
 */
package com.fire.array;

import java.util.Arrays;

/**
 * MajorityElement 多数元素，总数大于一半
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if (nums.length/2*2 == nums.length) {
            // 如果是偶数
            return nums[nums.length/2-1];
        }else{
            return nums[nums.length/2];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,3};
        System.out.println(new MajorityElement().majorityElement(arr));
    }
}