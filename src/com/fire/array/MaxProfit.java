/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-11 09:59:48
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-11 10:10:35
 */
package com.fire.array;

/**
 * MaxProfit
 * 给定一个数组，代表每天股票的价格，求利润
 */
public class MaxProfit {

    public int maxProfit(int[] prices){
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxprofit += prices[i] - prices[i - 1];
            }
        }
        return maxprofit;
    }
    
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new MaxProfit().maxProfit(prices));
    }
}