package com.fire.linkedList.前K个高频元素;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,-1,2,-1,2,3};
        System.out.println(new Solution().topKFrequent(nums, 2));
    }
}
