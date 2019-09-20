package com.fire.bitManipulation;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/19 22:17
 * @histoty 2019/9/19 22:17 created by jiefeng
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n < 0) {
            return false;
        }
//        2的幂都是只有1开头的二进制数字，减一之后其他位都变成一，原来为1的那一位置零，所以和运算之后，应该是0
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(new PowerOfTwo().isPowerOfTwo(2));
    }
}
