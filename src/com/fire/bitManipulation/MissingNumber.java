package com.fire.bitManipulation;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/19 21:37
 * @histoty 2019/9/19 21:37 created by jiefeng
 */
public class MissingNumber {

    /**
     * 异或运算时候，如果相同为0，不同不为0，且0与其他值运算时获得的都是其他值，利用这一特性，可以获取缺失的那一个值
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int x = 0;
        for (int i = 0; i <= nums.length; i++) {
            x ^= i;
        }
        System.out.println(x);
        for (int num : nums) {
            x ^= num;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4,6};
        System.out.println(new MissingNumber().missingNumber(nums));
        System.out.println(2^3^2);
    }
}
