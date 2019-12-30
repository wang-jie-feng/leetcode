/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-09 14:47:50
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-09 14:58:18
 */
package com.fire.array;

import java.util.Arrays;

/**
 * Merge 合并两个有序数组 假定第一个数组的长度是可以将第二个装进去的
 */
public class Merge {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[nums1.length - i-1] = nums2[i];
            }
            Arrays.sort(nums1);
            System.out.println(nums1.toString());
        }
        public static void main(String[] args) {
            int a[] = {1,3,5,0};
            int[] b = {2};
            new Merge().merge(a,3,b,1);
        }
}