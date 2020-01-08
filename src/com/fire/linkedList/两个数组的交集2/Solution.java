package com.fire.linkedList.两个数组的交集2;

import java.util.ArrayList;
import java.util.TreeMap;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i : nums1) {
            if (!map.containsKey(i)){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
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
