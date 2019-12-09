/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-08 19:13:59
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-09 14:15:02
 */
package com.fire.array;

import java.util.ArrayList;
import java.util.List;

/**
 * InsertInstervals 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 * 目前解题思路，首先添加新的数组之前的，然后比较并合并，合并之后，如果还有那么先将更新之后的新数组添加，并将其置空
 * 如果一直合并到了最后，那么添加到最后一个 时间复杂度为n
 * 我的思路：使用二分查找法，确定左右两个的位置，然后将其合并，可以将时间复杂度降为2log(n)
 */
public class InsertInstervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        for (int[] interval : intervals) {
            // 如果新数组在之前
            if (newInterval == null || interval[1] < newInterval[0]) {
                result.add(interval);
            } else if (interval[0] > newInterval[1]){
                result.add(newInterval);
                result.add(interval);
                newInterval = null;
            } else {
                newInterval[0] = Math.min(newInterval[0],interval[0]);
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }
        }
        if (newInterval != null) {
            result.add(newInterval);
        }
        int[][] out = new int[result.size()][];
        for (int i = 0; i < out.length; i++) {
            out[i] = result.get(i);
        }
        return out;
    }
}