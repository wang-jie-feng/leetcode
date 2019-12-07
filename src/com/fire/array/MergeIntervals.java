package com.fire.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    /**
     * 给出一个区间的集合，请合并所有重叠的区间。
     * 首先排序
     * 然后比较前一个的右值和后一个的左值，如果前者大于后者那么就是相交，然后比较两者的右值，取大者
     * 如果没有符合条件的，从下一个开始
     * @param intervals
     * @return
     */
    public static int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length <= 1){
            return intervals;
        }

        List<int[]> list = new ArrayList<>();

//        使用lambda表达式
        Arrays.sort(intervals,(e1,e2) -> {return e1[0] - e2[0];});

        int i=0;
        int n = intervals.length;
        while(i<n){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while(i<n-1 && right>=intervals[i+1][0]){
                right = Math.max(right,intervals[i+1][1]);
                i++;
            }
            list.add(new int[] {left,right});
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }

    static int[][] arrs = {{1,3},{2,4}};
    public static void main(String[] args) {
        int[][] out = merge(arrs);
        for (int[] ints : out) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
