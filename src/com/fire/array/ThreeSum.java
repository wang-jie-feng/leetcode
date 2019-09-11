package com.fire.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/10 23:18
 * @histoty 2019/9/10 23:18 created by jiefeng
 */
public class ThreeSum {
    public List<List<Integer>> ThreeSum (int[] nums){
        List<List<Integer>> ret = new ArrayList<>();
        if (nums.length <= 2){
            return ret;
        }
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
//                    此处是指，如果当前值等于下一个的值那么直接跳过
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
        System.out.println(new ThreeSum().ThreeSum(a).toString());
    }
}
