package com.fire.array;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/12 10:59
 * @histoty 2019/9/12 10:59 created by jiefeng
 * 旋转数组可以看做两个数组，其中一个所有的值都大于另外一个，那么可以据此判断中点在哪一个数组中，进而继续循环较小的数组，重复的情况则是使用hi--来实现
 * 由于条件的约束，现在也不会数组越界
 * 此题的难点在于，需要寻找到那个较小的数组的位置
 * 如果中点大于right，那么说明他肯定在大的那个数组里边，然后继续循环找到那个小的数组之后继续二分，也可以取到最小值
 */
public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length-1;
        while(lo < hi) {
            int mid = lo+(hi-lo)/2;
            if(nums[mid] > nums[hi])
                lo = mid+1;
            else if(nums[mid] < nums[hi])
                hi = mid;
            else
//                此处是判断重复值的一个关键，如果相等了那么往前进一位
                hi--;
        }
        return nums[lo];
    }
}
