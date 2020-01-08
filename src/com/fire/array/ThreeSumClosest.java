package com.fire.array;

import java.util.Arrays;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/11 20:57
 * @histoty 2019/9/11 20:57 created by jiefeng
 */
//给定一个整形数组S和一个具体的值，要求找出在这数组中三个元素的和和这个给定的值最小。input只有
//一个有效答案
public class ThreeSumClosest {
    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length <= 1){
            return -1;
        }
//        用于存储返回值
        int ret = 0;
//        设定开始时是最大值，使其可以开始循环
        int distance = Integer.MAX_VALUE;
//        排序之后，可以便于指针移动
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i+1;
            int k = nums.length - 1;
            while (j<k){
                int tmpVal = nums[i] + nums[j] + nums[k];
                int tmpDistance;
                if (tmpVal < target){
//                    记录一下距离
                    tmpDistance = target - tmpVal;
                    if (tmpDistance < distance){
//                        如果距离比原来的小那么覆盖原来的
                        distance = tmpDistance;
                        ret = nums[i] + nums[j] + nums[k];
                    }
//                    如果缓存变量小于结果值，说明需要继续增大才可以接近
                    j++;
                }else if (tmpVal > target){
                    tmpDistance = tmpVal - target;
                    if (tmpDistance < distance){
                        distance = tmpDistance;
                        ret = nums[i] + nums[j] + nums[k];
                    }
//                    同上
                    k--;
                }else {
//                    距离为0是最小的
                    ret = nums[i] + nums[j] + nums[k];
                    return ret;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        int target = 1;
        System.out.println(new ThreeSumClosest().threeSumClosest(nums, target));
    }
}
