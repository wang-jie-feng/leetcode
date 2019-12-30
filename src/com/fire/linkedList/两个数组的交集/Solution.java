package com.fire.linkedList.两个数组的交集;


import com.fire.linkedList.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        List<Integer> list = new ArrayList();
        for (int i : nums2) {
            if (set.contains(i)){
                list.add(i);
                set.remove(i);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}