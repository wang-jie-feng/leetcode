/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-10 16:54:41
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-10 17:09:37
 */
package com.fire.array;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {
    public int[] intersect(int[] nums1, int[] nums2) {
        // 首先，利用TreeMap来将第一个数组里的存起来，key存储值，value存储出现次数
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i : nums1) {
            if (!map.containsKey(i)){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        // 遍历，如果存在，那么将其保存起来，然后将其出现次数减一，如果出现次数为零那么移除
        for (int i : nums2) {
            if (map.containsKey(i)){
                list.add(i);
                map.put(i,map.get(i) - 1);
                if (map.get(i) == 0){
                    map.remove(i);
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}