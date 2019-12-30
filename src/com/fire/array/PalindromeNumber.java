package com.fire.array;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/14 23:04
 * @histoty 2019/9/14 23:04 created by jiefeng
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
//        首先判断的是0 或者负数，这两种情况一个符合一个不符合
        if (x < 0){
            return false;
        }else if (x == 0){
            return true;
        }else {
            int tmp = x;
            int y = 0;
//            将这个数字除以10，保留他的余数，下次将余数乘以10，加上这个数字再除以10的余数
            while (x != 0){
                y = y*10 + x%10;
                x = x/10;
            }
            if (tmp == y)
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(101));
    }
}
