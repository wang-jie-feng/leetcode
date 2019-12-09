/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-09 21:19:45
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-09 22:18:38
 */
package com.fire.array;

/**
 * Rotate
 */
public class Rotate {

    public static void rotate(int[] nums, int k) {
        if (k >= nums.length) {
            k = k%nums.length;
        }

        if (k == 0) {
            return;
        }

        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length-1];
            for (int l = nums.length-1; l > 0; l--) {
                nums[l] = nums[l-1];
            }
            nums[0] = temp;
        }   
    }
    /**
     * 使用反转数组的方式，未使用新空间，空间复杂度为O(1)，每一个元素都遍历了一遍，时间复杂度为O(A)
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums,int k){

        if (k >= nums.length) {
            k = k%nums.length;
        }

        if (k == 0) {
            return;
        }

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public static void reverse(int[] nums,int i,int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    
    static int[] arr = {1,2,3,4,5};
    public static void main(String[] args) {
        rotate2(arr,4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}