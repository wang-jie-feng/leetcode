package com.fire.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiefeng
 * @Copyright shanghai Definesys company.All right reserved
 * @Description ToDo
 * @date 2019/9/12 15:39
 * @histoty 2019/9/12 15:39 created by jiefeng
 */

public class LargestRectangleInHistogram {
    /**
     * 获取连续柱状图连续矩形最大值
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        List<Integer> s = new ArrayList<>();
        int[] myHeights = new int[heights.length+1];
//        末尾添加一个用于最后的结束遍历
        myHeights[heights.length] = 0;
        for (int i = 0; i < heights.length; i++) {
            myHeights[i] = heights[i];
        }


        int sum = 0;
        int i = 0;
        while (i<myHeights.length){
//            如果比数组里边最后一个大那么添加进去，且继续循环，否则将数组里边的数减一，因为矩形可以一直连到上一个比他小的所以每次需要移除最后一个元素
//            如果循环到比之前小，那么会将之前所有的可能都遍历一遍
            if (s.isEmpty() || myHeights[i] > myHeights[s.get(s.size()-1)]){
                s.add(i);
                i++;
            }else {
                int t = s.get(s.size()-1);
//                使用此可以遍历之前所有的可能性，因为s里边最后一个肯定小于当前值，
                s.remove(s.size()-1);
                sum = Math.max(sum,heights[t]*(s.isEmpty()? i:i-s.get(s.size()-1)-1));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,5,6,7,2,3};
        System.out.println(new LargestRectangleInHistogram().largestRectangleArea(arr));
    }
}
