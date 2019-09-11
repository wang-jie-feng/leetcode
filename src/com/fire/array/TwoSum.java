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
    public List<Integer> twoSum(int[] nums, int target){
        List<Integer> res = new ArrayList<>();
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
                    res.add(index+1);
                    res.add(i+1);
                    return res;
                }else {
                    res.add(i+1);
                    res.add(index+1);
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
