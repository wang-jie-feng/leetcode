/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-09-10 21:50:17
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-10 18:01:19
 */
package com.fire.array;

import java.util.*;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/10 21:50
 * @histoty 2019/9/10 21:50 created by jiefeng
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] res = new int[2];
        if (nums.length <= 1){
            return res;
        }
        Map<Integer,Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            int restVal = target-nums[i];
            if (myMap.get(restVal) != null){
                int index=myMap.get(restVal);
                if (index == i)
                    continue;
                if (index < i){
                    res[0] = (index);
                    res[1] = (i);
                    return res;
                }else {
                    res[0] = (i);
                    res[1] = (index);
                    return res;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,6};
        int target = 7;
        List<Integer> integers = new TwoSum().twoSum(nums, target);
        System.out.println(integers.toString());
    }
}
