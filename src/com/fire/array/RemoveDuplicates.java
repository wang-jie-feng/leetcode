/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-09 15:46:11
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-09 15:55:06
 */
package com.fire.array;

/**
 * RemoveDuplicates
 * 使用一个快指针和一个慢指针
 * 快指针用于遍历原数组，慢指针用于记录添加的元素位置
 * 不相等的话，那么将其添加，慢指针加一，否则快指针继续前进
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}