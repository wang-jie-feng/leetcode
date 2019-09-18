package com.fire.array;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/18 21:43
 * @histoty 2019/9/18 21:43 created by jiefeng
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,5};
        int target = 4;
        System.out.println(new SearchInsertPosition().searchInsert(nums, target));
    }
}
