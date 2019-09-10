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
    public List<Integer> twoSum(int[] numbers, int target){
        List<Integer> res = new ArrayList<>();
        if (numbers.length <= 1){
            return res;
        }
//        首先对于数组排序一下
//        Arrays.sort(numbers);
        Map<Integer,Integer> myMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            myMap.put(numbers[i],i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int restVal = target-numbers[i];
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
        int[] numbers = new int[]{1,2,4,6};
        int target = 7;
        List<Integer> integers = new TwoSum().twoSum(numbers, target);
        System.out.println(integers.toString());
    }
}
