/*
 * @Descripttion: 
 * @Author: jiefeng.w@foxmail.com
 * @Date: 2020-01-09 14:47:38
 * @LastEditors  : jiefeng
 * @LastEditTime : 2020-01-29 15:27:46
 */
package com.fire.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum (int[] nums){
        List<List<Integer>> ret = new ArrayList<>();
        if (nums.length <= 2){
            return ret;
        }
//        由于要求输出是有序的，所以需要先排序
        Arrays.sort(nums);

        for (int i=0;i<nums.length-2;i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                List<Integer> curr = new ArrayList<>();
                if (nums[i] + nums[j] + nums[k] == 0) {
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[k]);
                    j++;
                    k--;
//                    此处是指，如果当前值等于下一个的值那么直接跳过，可以用于去重
                    while (j < k && nums[j - 1] == nums[j])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
                if (curr.size()>0){
                    ret.add(curr);
                }

            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(new ThreeSum().threeSum(a).toString());
    }
}
