/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-09 15:14:17
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-09 15:28:10
 */
package com.fire.array;

/**
 * SuperEggDrop
 */
public class SuperEggDrop {
    public int superEggDrop(int K, int N) {
        int lo = 1, hi = N;
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            if (f(mi, K, N) < N)
                lo = mi + 1;
            else
                hi = mi;
        }

        return lo;
    }

    public int f(int x, int K, int N) {
        int ans = 0, r = 1;
        for (int i = 1; i <= K; ++i) {
            r *= x-i+1;
            r /= i;
            ans += r;
            if (ans >= N) break;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new SuperEggDrop().superEggDrop(10, 10));
    }
}