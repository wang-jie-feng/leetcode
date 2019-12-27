/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-09-11 21:28:05
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-27 10:40:30
 */
package com.fire.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/11 21:28
 * @histoty 2019/9/11 21:28 created by jiefeng
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        if (nums.length <= 3){
            return ret;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
//            去重
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j < nums.length - 2; j++) {
//                去重
                if (j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int k = j+1;
                int l = nums.length -1;
                while (k<l){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target){
                        List<Integer> curr = new ArrayList<>();
                        curr.add(nums[i]);
                        curr.add(nums[j]);
                        curr.add(nums[k]);
                        curr.add(nums[l]);
                        ret.add(curr);
//                        去重
                        do {
                            ++k;
                        }while (k<l && nums[k] == nums[k-1]);
                        do {
                            --l;
                        }while (k<l && nums[l] == nums[l+1]);
                    }else if (sum < target){
                        ++k;
                    }else {
                        --l;
                    }
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-3,-2,-1,0,0,1,2,3};
        int target = 0;
        System.out.println(new fourSum().fourSum(nums, target));
        System.out.println();
    }
}
